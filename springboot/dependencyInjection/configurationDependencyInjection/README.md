## pointers on gradle project configuration

1.  start with project initialization.
    This should create .gradle, build.gradle, gradlew, gradlew.bat, and settings.gradle files and gradle directory
    ```shell 
        gradle init
    ```

2. **settings.gradle** (or settings.gradle.kts): Located in the root directory, this file defines the root project's name and includes any subprojects in a multi-project build.
    ```groovy
    plugins {
     // Apply the foojay-resolver plugin to allow automatic download of JDKs
     id 'org.gradle.toolchains.foojay-resolver-convention' version '1.0.0'
    }

    rootProject.name = 'configurationDependencyInjection'
   
    include('app') // the directory inside configurationDependencyInjection
    ```  
   
   **build.gradle** (or build.gradle.kts): Each project (root and subprojects) has a build script that defines how it is built. This is where you apply plugins, declare dependencies, and configure tasks.
    > "app" is one application/project hence, it will have one build.gradle.
   
    > add plugins (like spring) and dependencies like springframework here
    
    > add `mainClass` in application section 

   ```groovy
    plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
      id 'application'
      id 'org.springframework.boot' version '4.0.2' // Specify your desired Spring Boot version
      id 'io.spring.dependency-management' version '1.0.11.RELEASE'
    }
    
    repositories {
    // Use Maven Central for resolving dependencies.
     mavenCentral()
    }
    
    dependencies {
    // This dependency is used by the application.
        implementation libs.guava
    
        implementation 'org.springframework.boot:spring-boot-starter-web'
        implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    }
    
    testing {
      suites {
       // Configure the built-in test suite
       test {
       // Use JUnit4 test framework
         useJUnit('4.13.2')
       }
      }
    }
    
    // Apply a specific Java toolchain to ease working on different environments.
    java {
      toolchain {
      languageVersion = JavaLanguageVersion.of(21)
      }
    }
    
    application {
    // Define the main class for the application.
      mainClass = 'com.vehicle.Vehicle'
    }
    ```
   
   **gradle.properties**: This file stores project-wide properties and environment-specific settings (e.g., memory limits for the Gradle daemon or specific JDK paths). Properties defined here can be accessed in your build scripts.  
   
   **gradle/wrapper/gradle-wrapper.properties**: Configures which version of Gradle should be used for the project, ensuring consistent builds across different environments.  

3. project structure in gradle varies a bit from maven
      ```bash
   projectroot
   ├── settings.gradle
   ├── gradlew
   ├── gradle.properties
   ├── gradle/
   ├── build/
   ├── .gradle
   ├── app
        └── build.gradle
        └── build
        └── src
            └── test
            └── main
                └── java
                    └── app/pkg
                          └── com
                              └──*.java
                    └──resources
                          └── 
   ```
   
4. to build project
    ```shell 
       ./gradlew build
   ```
   
5. to run project
    ```shell 
       ./gradlew run
   ```