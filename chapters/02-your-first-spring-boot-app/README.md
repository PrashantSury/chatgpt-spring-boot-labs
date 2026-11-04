# Chapter 2: Your first Spring Boot app

**By the end of this chapter:** start a Spring Boot app and answer HTTP requests with text and JSON, using path variables and query parameters.

## Why you need this

Tapri Cloud gives counters, the mobile app and partner cafés one backend to call over HTTP. Spring MVC handles the server plumbing so you can focus on endpoint behavior rather than manually parsing sockets, URLs, headers and JSON.

## What you will learn

- **Application class:** `SpringApplication.run` starts the application context and embedded web server.
- **Controllers:** `@RestController` and `@GetMapping` connect URLs to Java methods.
- **Path variables and query parameters:** Spring converts URL text into Java parameter types.

## The application class

`@SpringBootApplication` combines three annotations:

- `@SpringBootConfiguration` — marks a configuration source.
- `@EnableAutoConfiguration` — configures sensible defaults from the classpath (including a web server when the web stack is present).
- `@ComponentScan` — discovers components in the package and its subpackages.

The application class should live in a parent package of the controllers so component scanning can find them.

## A controller

```java
@RestController
class StationController {
  record Station(String code, String city) {}

  @GetMapping("/version")
  String version() { return "Tapri Cloud 0.0.1"; }

  @GetMapping("/stations")
  List<Station> stations() {
    return List.of(new Station("SBC", "Bengaluru"), new Station("NDLS", "New Delhi"));
  }
}
```

## Path variables and query parameters

```java
@GetMapping("/stations/{code}")
String station(@PathVariable String code) {
  return "Station " + code.toUpperCase();
}

@GetMapping("/bill")
int bill(@RequestParam int cups) {
  return cups * 25;
}
```

A path variable is part of the path; a query parameter follows `?`. If a required query parameter is missing or cannot be converted, Spring normally responds with `400 Bad Request` before the controller method runs. An unmapped URL normally responds with `404`.

## Try it

Use a JDK matching the project's configured Java release, then run the app with Maven. Example requests:

```bash
curl -i localhost:8081/ping
curl localhost:8081/menu
curl localhost:8081/hello/SBC
curl 'localhost:8081/menu/under?price=30'
```

## Your turn — five tasks

1. Map `GET /ping` and return exactly plain text `pong`.
2. Map `GET /menu` and return all four menu items as a JSON list in order (Masala chai first, Parle-G last).
3. Map `GET /hello/{station}` and return `Welcome to Tapri Cloud, ` followed by the station path value.
4. Map `GET /menu/under?price=N` and return items priced strictly below `N`, preserving order. At `price=30`, return Cutting chai then Parle-G; at `price=10`, return an empty list.
5. Annotate `TapriApplication` with `@SpringBootApplication`. Name the three annotations it combines.

## Acceptance checklist

- [ ] `/ping` returns `200` and plain text `pong`.
- [ ] `/menu` returns four JSON objects in menu order.
- [ ] `/hello/SBC` returns `Welcome to Tapri Cloud, SBC`.
- [ ] `/menu/under?price=30` excludes items priced 30 or higher.
- [ ] `/menu/under?price=10` returns `[]`.
- [ ] App starts and component scanning finds `MenuController`.

## Interview check

**What does `@SpringBootApplication` switch on?** Configuration, auto-configuration and component scanning.
