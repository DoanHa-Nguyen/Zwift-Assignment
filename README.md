# Zwift-Assignment
Using a Java web automation framework, provide a project that contains tests covering the scenarios listed below.

Delivery:

Provide a GitHub repository for review.
Provide instructions on how to execute the tests within your project within your git repository's `README.md`.
Include any prerequisite industry-standard software. Examples: Java, Chrome or Firefox.
Assume those who run the tests are not familiar with the framework you're using and provide clear instructions for prerequisite installation and test execution.
Automation task must be able to run via Command line without an IDE
Require MIT License.
Project Restrictions:

Test Framework must be open source.
Your project cannot require the usage of cloud service(s).
Test Scenarios:

 - Home Page

Navigate to https://zwift.com
Validate the page loads.
Validate content of your choice is present.
- Events Page

Navigate to https://zwift.com
Use the top-nav elements to reach https://zwift.com/events
Validate the page loads.
Populate the Sports, Intensities, and Start Times fields and apply the filter.
Validate events have changed. (Assume that the filters you choose may return NO events.)

#Running Instructions for Windows Only
In order to run the project, the following industry-standard software are needed.
- Java version 8 or above, which can be download at https://www.java.com/en/download/
- Java jdk 8.0 or above. The most up-to-date version of jdk can be found at https://www.oracle.com/java/technologies/downloads/ or the older version can be found at https://www.oracle.com/java/technologies/downloads/archive/
- Google Chrome version 96.0.4664.45 (latest version as of 12/05/2021). If you are using a different version of Google Chrome, please download the correspond chromedriver.exe from https://chromedriver.chromium.org/downloads and replace the one in \src\main\resources\ folder in the Assignment_1 project. This will require the jar file to be rebuilt.
- An IDE that can run and execute Java code, such as IntelliJ IDEA Community Edition or Eclipse IDE. (Optional, as a jar file has been provided to be run with command line).
- Command Line

First step to run the project is to clone the project from GitHub to your local repository.
Next, open your command line and navigate to that repository, then navigate into Assignment_1\target\
Once you are in the target folder, run the command java -jar Assignment_1-1.0-SNAPSHOT.jar
Currently, all errors or reports are made on command line console. Please do not terminate the browser before the program finish.

