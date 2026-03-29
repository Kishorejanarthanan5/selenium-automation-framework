# Selenium Automation Framework

## 📌 Overview

This is a Selenium-based automation framework built using Java, TestNG, and Maven following the Page Object Model (POM) design pattern.

---

## 🛠 Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* WebDriverManager

---

## 📂 Framework Structure

* **base** → Test setup, teardown, and common page actions
* **driver** → Browser initialization using DriverFactory
* **pages** → Page Object classes with locators and actions
* **tests** → Test cases with assertions
* **utils** → Configuration handling

---

## 🚀 Features

* Page Object Model design pattern
* Multi-browser support (Chrome, Edge, Firefox)
* WebDriverManager for automatic driver management
* Config-driven execution
* Explicit waits for stability
* Positive and negative test scenarios

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

## 🧠 Design Approach

* Separation of concerns using layered architecture
* Reusable page methods for maintainability
* Clean test design with clear assertions

---

## 🔧 Future Enhancements

* Screenshot capture on failure
* Logging integration
* CI/CD integration
