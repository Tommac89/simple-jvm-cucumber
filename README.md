#Sample Java Test framework - by Tom McCawley
This is a sample test framework written in Java 11, running a single test against AutomationPractice.com

## 3rd Party Libraries
The framework uses very few 3rd party libraries or tools in an effort to prioritise simplicity. Libraries that have been made use of, are as follows:
- Cucumber BDD framework - enables BDD format of tests. https://cucumber.io/
- Selenium - Browser automation framework - https://www.selenium.dev/
- Cluecumber-report-plugin - a reporting plugin that converts the native .json reports into a formatted html report https://github.com/trivago/cluecumber-report-plugin
## Project Structure
The tests make use of the Cucumber BDD framework, and as such, tests are composed in Gherkin syntax making them accessible to non-technical stakeholders.
The tests (or features) can be found within the folder at  `src/test/resources/features`

The steps (underlying code for each step) is written in Java and can be found in `src/test/java/steps`. Other supporting code (such as page objects and utilities) can be found in neighbouring packages. 

## Pre-requisite requirements
This framework requires:
 - Java 11
 - Maven (or a suitable IDE allowing Cucumber support)
 - Google Chrome (and compatible chromedriver installed on users PATH)

### Running via Maven
Run `mvn install` in a terminal from the root directory of the project. (Running `mvn install` will ensure the full life-cycle including test report generation)

### Running via an IDE
From a suitable IDE, provided the relevant Cucumber plugin is supported, you can run the tests directly from the feature file (right click > run test). The exact steps may vary by IDE/plugin.

### Viewing The Test Output
Once the test has ran, the simple JSON output can be found in `target/cucumber-report/cucumber.json`. If running a full maven install (and thereforetriggering the clucumber reporting plugin) a html report can be found at `target/generated-report/index.html` 
This report is best viewed in a web-browser.

  

 
