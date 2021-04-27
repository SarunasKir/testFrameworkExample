#e2e-api-test-framework

This is common project to all test automation specialist to take and start e2e api testing. <br>
To run tests use maven command: mvn test -s settings.xml -Denv=dev <br>

instructions how to install allure reports locally: <br>
open powerShell(v5 or later) <br>
run command to install scoop: iwr -useb get.scoop.sh | iex <br>
run command to install allure: scoop install allure <br>
to verify if allure is installed run command: allure --version <br> 
after tests execution run command 'allure serve' to start allure server locally and get reports. Run this command inside the project directory
