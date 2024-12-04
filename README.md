==============================Excercise-6==================================================
Write a build script to build the application using a build automation tool like Maven. Create a folder 
structure that will run the build script and invoke the various software development build stages. This script 
should invoke the static analysis tool and unit test cases and deploy the application to a web application 
server like Tomcat
-----------------------------------------------------------------------------------------------------

pom.xml
Defines the Maven project, including dependencies, plugins, and configuration.

Source Code Files:
StudentresultApplication.java: Main Spring Boot application class.

ResultController.java: REST controller for handling result-related operations.

Result.java: Represents the result model class.

ResultRepo.java: Repository interface for database operations.

Configuration:
application.properties: Configurations like database connection properties.

Tests:
StudentresultApplicationTests.java: Contains unit tests for the application.

Maven Wrapper Scripts:
mvnw and mvnw.cmd: To build the project without requiring a global Maven installation.

Theoretical Points for the Build Script
1. Folder Structure
Standard Maven Structure

project-root/
├── src/
│   ├── main/
│   │   ├── java/ (Application Code)
│   │   └── resources/ (Configuration Files)
│   └── test/
│       └── java/ (Test Code)
├── pom.xml (Project Object Model for Maven)
└── README.md (Project Documentation)

2. Build Automation Stages
   
Clean: Removes previous build artifacts.

Compile: Compiles source code into bytecode.

Test: Runs unit tests to verify functionality.

Static Analysis: Scans code for potential issues (e.g., using tools like Checkstyle, PMD, or SpotBugs).

Package: Packages the application into a deployable artifact (e.g., JAR or WAR).

Deploy: Deploys the packaged artifact to a server like Apache Tomcat.

4. Maven Build Script
Static Analysis: Include a plugin in pom.xml for static analysis (e.g., SpotBugs or Checkstyle). Example:
xml

<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-checkstyle-plugin</artifactId>
    <version>3.2.0</version>
    <executions>
        <execution>
            <phase>verify</phase>
            <goals>
                <goal>check</goal>
            </goals>
        </execution>
    </executions>
</plugin>

Stages:
Clean: clean
Compile: compile
Test: test
Static Analysis: verify
Package: package
Deploy: cargo:run
