## Test Automation of Energy Australia - Festivals Mobile application

Technology used - Java, Appium, Cucumber, Maven, Android

### There are two options to run this project.

**Running locally using editors like IntelliJ Idea**
- Clone the repo `https://github.com/shiveshdewangan/mobile-app-automation.git`
- Import the project as maven project on IntelliJ
- Install all maven dependencies on pom.xml file
- Go to **mobile-app-automation/src/test/java/TestRunner***
- Locate **Runner.java** file within **TestRunner** folder
- Right click on the **Runner.java** file and Run it

**Running locally from Command Line**

*Please make sure you have **Java** and **Maven** installed and configured on your system.*

- `Open a Terminal window`
- `git clone https://github.com/shiveshdewangan/mobile-app-automation.git`
- `cd mobile-app-automation`
- `mvn clean test`

##### Note: After test execution, please look inside `**target/cucumber-reports/index.html**` for Cucumber HTML Reports.

#### Assumptions taken and My Notes
- I have modified the **Feature File** as per instructions on the Tech Test doc - ***Feel free to rewrite the problem to your preference***.
- It's quite easy to scale this framework since I have used some of the best practices like BDD and Page Object Design Patterns. Using Scenario Outline for Test Case Design lets us run the same test case for multiple sets of data. This add to reusability. Moreover, Page Objects helps in proper code splitting, Single Responsibility Principle and also in maintenance.
- For the decisions made and considerations taken, I am happy to discuss *What I did* and *Why I did so*.

#### Acceptance Criteria met
- :white_check_mark: Basic Page Object Model
- :white_check_mark: Assertions for both verification and validations wherever necessary
- :white_check_mark: Code modularity/reuse of methods is achieved
- :white_check_mark: Data Driven
- :white_check_mark: Right Setup and teardown of tests
- :white_check_mark: Capture screenshots when test fails
- :white_check_mark: Basic reporting
