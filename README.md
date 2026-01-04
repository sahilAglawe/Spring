# 🌱 Spring Framework – Core Concepts Repository

This repository contains notes, examples, and explanations of **Spring Framework Core concepts**.  
It is intended for learners who want to understand **Spring fundamentals without using Spring Boot**.

---

## 📌 What is Spring Framework?

**Spring Framework** is an open-source, lightweight Java framework used to build **enterprise-level applications**.  
It provides a comprehensive programming and configuration model with support for **IoC, DI, AOP, JDBC, ORM, and MVC**.

---

## 🧩 Core Principles of Spring

### 1️⃣ Inversion of Control (IoC)
IoC is a design principle where the responsibility of object creation and dependency management is handled by the **Spring Container** instead of the programmer.

---

### 2️⃣ Dependency Injection (DI)
Dependency Injection allows Spring to inject required dependencies into a class at runtime.

**Types of Dependency Injection:**
- Constructor Injection
- Setter Injection
- Field Injection

---

## 🏭 Spring Container

The Spring Container manages the lifecycle of beans and their dependencies.

### Types of Containers:
- **BeanFactory** – Basic container with lazy initialization
- **ApplicationContext** – Advanced container with additional features

---

## 🫘 Spring Beans

A **Spring Bean** is an object that is instantiated, configured, and managed by the Spring IoC container.

### Ways to Configure Beans:
- XML-based configuration
- Java-based configuration
- Annotation-based configuration

---

## ⚙️ Bean Configuration Techniques

### XML Configuration
Beans are defined in XML configuration files.

---

### Java-Based Configuration
Uses Java classes annotated with:
- `@Configuration`
- `@Bean`

---

### Annotation-Based Configuration
Uses annotations such as:
- `@Component`
- `@Service`
- `@Repository`
- `@Controller`

---

## 🏷️ Important Spring Annotations

### Core Annotations
- `@Component` – Marks a class as a Spring-managed bean
- `@Service` – Indicates service layer
- `@Repository` – Indicates DAO layer and enables exception translation
- `@Controller` – Indicates controller layer
- `@Autowired` – Automatically injects dependencies
- `@Qualifier` – Resolves multiple bean conflicts
- `@Value` – Injects values from property files

---

## 🔄 Bean Scope

Defines the lifecycle and visibility of beans.

**Common Scopes:**
- `singleton` (default)
- `prototype`
- `request`
- `session`

---

## 🔁 Bean Lifecycle

Spring bean lifecycle includes:
1. Bean instantiation
2. Dependency injection
3. Initialization
4. Business logic execution
5. Bean destruction

### Lifecycle Interfaces & Annotations:
- `InitializingBean`
- `DisposableBean`
- `@PostConstruct`
- `@PreDestroy`

---

## 🧠 Aspect-Oriented Programming (AOP)

AOP helps separate **cross-cutting concerns** such as logging, security, and transactions.

### Core AOP Concepts:
- Aspect
- Advice
- Join Point
- Pointcut
- Target

---

## 🗄️ Spring JDBC

Spring JDBC provides abstraction over traditional JDBC, reducing boilerplate code.

### Key Features:
- JdbcTemplate
- Exception translation
- Resource management

---

## 🗃️ Spring ORM

Spring ORM integrates ORM frameworks with Spring.

### Supported ORM Tools:
- Hibernate
- JPA
- MyBatis

---

## 🌐 Spring MVC (Overview)

Spring MVC follows the **Model–View–Controller** design pattern for building web applications.

### Core Components:
- DispatcherServlet
- Controller
- ViewResolver
- Model

---

## 🔐 Transaction Management

Spring supports **declarative and programmatic transaction management**.

### Key Concepts:
- PlatformTransactionManager
- Propagation
- Isolation

---

## 🧪 Testing Support

Spring provides testing support for:
- Unit testing
- Integration testing

---

## 📦 Build & Configuration Tools

- Maven ( i am using while making projects )
- Gradle

---

## 🎯 Why Use Spring Framework?

- Promotes loose coupling
- Improves testability
- Simplifies enterprise application development
- Provides modular architecture

