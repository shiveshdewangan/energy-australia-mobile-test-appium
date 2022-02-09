## Test Automation of Energy Australia - Festivals Mobile application

Technology used - Java, Appium, Cucumber, Maven, Android

### There are two options to run this project.

**Running locally using editors like IntelliJ Idea**
- Clone the repo `https://github.com/shiveshdewangan/energy-australia-mobile-test-appium.git`
- Import the project as maven project on IntelliJ
- Install all maven dependencies on pom.xml file
- Go to **energy-australia-mobile-test-appium/src/test/java/TestRunner***
- Locate **Runner.java** file within **TestRunner** folder
- Right click on the **Runner.java** file and Run it

**Running locally from Command Line**

*Please make sure you have **Java** and **Maven** installed and configured on your system.*

- `Open a Terminal window`
- `git clone https://github.com/shiveshdewangan/energy-australia-mobile-test-appium.git`
- `cd mobile-app-automation`
- `mvn clean test`

##### Note: After test execution, please look inside `**target/cucumber-reports/index.html**` for Cucumber HTML Reports.
