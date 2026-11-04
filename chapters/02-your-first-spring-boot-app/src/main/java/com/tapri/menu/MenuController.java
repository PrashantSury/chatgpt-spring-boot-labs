package com.tapri.menu;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Chapter 2 practice stub.
// Complete the TODOs described in the chapter README.
@RestController
public class MenuController {

    // Keep this order when implementing /menu:
    // Masala chai (35), Cutting chai (20), Samosa (30), Parle-G (10).
    private final List<MenuItem> menu = List.of(
            new MenuItem("Masala chai", 35),
            new MenuItem("Cutting chai", 20),
            new MenuItem("Samosa", 30),
            new MenuItem("Parle-G", 10)
    );

    // Task 1: Map GET /ping and return plain text "pong".
    @GetMapping("/ping")
    public String ping() {
        // TODO: return the required response.
        return null;
    }

    // Task 2: Map GET /menu and return all four menu items in the order above.
    @GetMapping("/menu")
    public List<MenuItem> getMenu() {
        // TODO: return the menu.
        return null;
    }

    // Task 3: Map GET /hello/{station} and include the path value in the greeting.
    @GetMapping("/hello/{station}")
    public String hello(@PathVariable String station) {
        // TODO: return "Welcome to Tapri Cloud, " followed by station.
        return null;
    }

    // Task 4: Return only items whose price is strictly less than the query value.
    // Example: /menu/under?price=30 returns Cutting chai and Parle-G.
    @GetMapping("/menu/under")
    public List<MenuItem> getMenuUnderPrice(@RequestParam int price) {
        // TODO: filter the menu and preserve its original order.
        return null;
    }
}
