# Chapter 1: Maven and the pom.xml

**By the end of this chapter:** read and write a Spring Boot project's `pom.xml`: project coordinates, parent, starters, scopes and a Maven profile.

## Why you need this

Tapri Cloud needs a web server, JSON, validation, a database driver and test tools. Maven makes every developer machine and build server use a consistent dependency graph. Without it, developers would copy JARs manually and guess compatible versions.

## What you will learn

- **Coordinates:** `groupId`, `artifactId`, `version` identify a project or library.
- **Parent:** `spring-boot-starter-parent` supplies tested dependency versions and plugin defaults.
- **Starters and scopes:** one dependency per feature; scopes decide which classpaths include it.
- **Profiles:** named build settings activated with `-P`.

## Coordinates

A dependency is identified by three coordinates. For example, `io.jsonwebtoken:jjwt-api:0.13.0`.

```xml
<dependency>
  <groupId>io.jsonwebtoken</groupId>
  <artifactId>jjwt-api</artifactId>
  <version>0.13.0</version>
</dependency>
```

A version ending in `-SNAPSHOT` means it is still changing.

## The parent picks versions

The Spring Boot parent manages versions for a tested set of libraries. A managed starter normally has no explicit `<version>` in your dependency declaration. When the Boot parent is upgraded, managed dependencies move to the versions selected by that parent. Explicitly pinned third-party versions remain independently controlled.

## Starters and scopes

A starter is a convenient dependency that brings a feature's related libraries. Maven scopes:

- `compile` (default): available to compile, test and run.
- `runtime`: not needed to compile application code, but needed when the app runs (for example a JDBC driver).
- `test`: only on test compilation/execution classpaths; not part of the production runtime dependency set.

## Maven profiles

A profile groups optional build properties. Activate it by id, for example `mvn package -Pfast`. A profile property such as `skipTests` can change build behavior. Spring Boot's Maven plugin also reads `spring-boot.run.profiles` when running the application through Maven.

## Try it

From the repository root:

```bash
cd chapters/01-maven-and-the-pom
```

Open `pom.xml` and inspect the TODO comments. You can also inspect the effective Maven model after completing the tasks with:

```bash
mvn help:effective-pom
```

## Your turn — six tasks

1. Change project coordinates to `com.tapri:tapri-cloud:0.0.1-SNAPSHOT`.
2. Add parent `org.springframework.boot:spring-boot-starter-parent:4.1.1` with an empty `<relativePath/>`, before project coordinates.
3. Set `<java.version>25</java.version>` inside project properties.
4. Add `org.springframework.boot:spring-boot-starter-webmvc` without a version or explicit scope. **Interview:** who selects its version? The parent dependency management.
5. Add `spring-boot-starter-webmvc-test` without a version and with `test` scope.
6. Add a `prod` Maven profile whose own properties set `spring-boot.run.profiles` to `prod`.

## Acceptance checklist

- [ ] Project coordinates are exactly `com.tapri:tapri-cloud:0.0.1-SNAPSHOT`.
- [ ] Parent version is exactly `4.1.1`; `<relativePath/>` is empty.
- [ ] Java version is `25`.
- [ ] Both Spring starters omit `<version>`.
- [ ] Test starter has `<scope>test</scope>`.
- [ ] The `prod` property is nested inside the `prod` profile.

## Interview check

**Who picks a Spring Boot starter's version?** The parent's dependency management. Upgrading the Boot parent updates the managed versions as a compatible set; explicitly pinned dependencies are not automatically changed.


## Practice workspace

This chapter's coding stub is the Maven project descriptor itself:

- [pom.xml](pom.xml) — intentionally incomplete; complete the six TODOs in order.

This is a Maven configuration lab, not a runnable web application. You do not need Java source files in this chapter. The goal is to make Maven understand the project and its dependency model.

### Verify your work

Run these commands from this chapter folder after completing the TODOs:

```bash
mvn validate
mvn help:effective-pom
mvn dependency:tree
```

Use the output to verify that the Spring Boot parent supplies managed dependency versions and that the test starter is present with test scope. To verify the profile property, run:

```bash
mvn help:active-profiles -Pprod
mvn help:evaluate -Dexpression=spring-boot.run.profiles -q -DforceStdout -Pprod
```

### What is intentionally not provided

There is no completed POM or solution branch. You are expected to edit the stub, run Maven, inspect errors and use the acceptance checklist above to validate your own work.
