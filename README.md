# Swag Labs Playwright Automation

[![Contributors][contributors-shield]][contributors-url]

[![LinkedIn][linkedin-shield]][linkedin-url]

## Overview

This repository contains an automated test suite for the Swag Labs website using
the [Microsoft Playwright](https://playwright.dev/java/docs/intro) framework with Java. The tests cover various
functionalities of the Swag Labs website, including login, product selection, adding items to the cart, and checking
out.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Running the Application](#running-the-application)
- [Running Tests](#running-tests)
- [Project Structure](#project-structure)
- [Built with](#built-with)


## Installation

To get started, you need to clone this repository and set up the required dependencies.

1. **Clone the repository:**

    ```bash
    git clone https://github.com/sarkadins/swag-labs-playwright.git
    cd swag-labs-playwright
    ```

2. **Environment Variables**

   The following environment variables are required to run the tests:

   PASSWORD: The password used for login. You can set the environment variable directly in your terminal before running the tests:
   

   Linux / macOS
   ```
   export PASSWORD=secret_sauce
   ```
   Windows
   ```
   set PASSWORD=secret_sauce
   ```

3. **Install the dependencies:**

   Ensure you have Maven installed. Then run:

    ```bash
    mvn clean install
    ```

   Maven will handle downloading the necessary dependencies, including JUnit 5 and Playwright.

## Usage

The test suite interacts with the Swag Labs website to validate various functionalities. You can execute the tests using
Maven.

### Running the Application

To compile the code and run the main application, use the following Maven command:

   ```bash
   mvn compile exec:java -D exec.mainClass="com.codecool.Main"
   ```

##### Running Tests

   ```bash
   mvn clean test
   ```

##### Project Structure

```
├── pom.xml                
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── codecool
│   │               ├── pages
│   │               │   ├── BasePage.java
│   │               │   ├── CartPage.java
│   │               │   ├── HomePage.java
│   │               │   ├── LoginPage.java
│   │               │   └── Main.java
│   ├── test
│   │   ├── java
│   │   │   ├── CheckOutTest.java
│   │   │   ├── ListProductsTest.java
│   │   │   ├── LoginTest.java
│   │   │   ├── LogoutTest.java
│   │   │   ├── PutProductsToCartTest.java
│   │   │   └── SelectItemTest.java
│   │   └── resources
│   │       ├── login-data.csv
│   │       ├── logout-data.csv
│   │       └── select-item-data.csv
└── README.md
```
#### Built with:

[![Playwright][playwright-shield]][playwright-url]

[![Java][java-shield]][java-url]

[contributors-shield]: https://img.shields.io/github/contributors/sarkadins/swag-labs-playwright
[contributors-url]: https://github.com/sarkadins/swag-labs-playwright/graphs/contributors
[linkedin-shield]: https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white
[linkedin-url]: https://www.linkedin.com/in/soma-sarkadi-nagy/
[playwright-shield]: https://img.shields.io/badge/Playwright-end_to_end_tests-blue
[playwright-url]: https://playwright.dev/
[java-shield]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white
[java-url]: https://www.java.com/en/