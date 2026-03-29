# Selenium Automation Framework

## 📌 Overview

This project is a Selenium-based automation framework built using Java, TestNG, and Maven, following the Page Object Model (POM) design pattern. The framework is designed for scalability, readability, and maintainability.

---

## 🛠 Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* WebDriverManager

---

## 📂 Framework Structure

* **base** → Test setup, teardown, and reusable page methods
* **driver** → Browser initialization using DriverFactory
* **pages** → Page Object classes (locators + actions)
* **tests** → Test cases with assertions
* **utils** → Configuration and utility classes

---

## 🚀 Features

* Page Object Model (POM) design pattern
* Multi-browser support (Chrome, Edge, Firefox)
* WebDriverManager for automatic driver handling
* Config-driven execution using properties file
* Explicit waits for stable element handling
* Automated screenshot capture on test failure
* Clear separation of test logic and page actions

---

## ▶️ How to Run Tests

```bash
mvn clean test
```

---

## 📊 Test Coverage

* Valid login scenario
* Invalid login scenario
* Invalid username validation
* Invalid password validation

---

## 📸 Screenshot Handling

* Screenshots are automatically captured on test failure
* Stored in `/screenshots` folder
* Helps in debugging and failure analysis

---

## 🧠 Design Approach

* Layered architecture for separation of concerns
* Reusable methods implemented in BasePage
* Centralized driver management using DriverFactory
* Configuration externalized using properties file

---

## 🔧 Future Enhancements

* Logging (Log4j) integration
* Reporting (Extent/Allure)
* Parallel execution
* CI/CD integration

