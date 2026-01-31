## Pointers on Maven project configuration

1. Project structure should be :
    ```bash
   project
   ├── pom.xml
   └── target
   └── src
        └── test
        └── main
            └── java
                └── pkg
                    └── *.java
                └──resources
                    └── applicationContext.xml
   ```
   
2. Web search `maven xsd` to get bare configuration required in pom.xml

3. To run the project :
    ```shell
    mvn clean compile exec:java
    ```
   
## Pointers on dependency injection

1. real-world Spring applications prefer constructor dependency injection(CDI) between both types of XML dependency injection.
2. Although Configuration dependency injection and annotations is preferred over XML injection.
3. avoid XML configuration and use annotations

```bash
    | XML concept              | Annotation equivalent                |
    | ------------------------ | ------------------------------------ |
    | `<bean>`                 | `@Component`                         |
    | `id="..."`               | Bean name in `@Component("name")`    |
    | `<property ref="...">`   | `@Autowired`                         |
    | `<constructor-arg>`      | Constructor + `@Autowired`           |
    | `ApplicationContext` XML | `AnnotationConfigApplicationContext` |
```

