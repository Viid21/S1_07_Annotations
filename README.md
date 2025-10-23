# 🧑‍💻 Task S1.06. Java Annotations  
**Author:** David Rey  
**Corrected by:** Adolfo Caicaguare (adolcc)

## 📄 Description  
This project explores object-oriented principles in Java such as inheritance, method overriding, static and constant attributes, and annotations. It also introduces custom annotations for JSON serialization and demonstrates how to process them using Java Reflection. The exercises are organized by difficulty level.

### 🔹 Level 1  
**Exercise 1 – Worker Hierarchy and Method Overriding**  
- Create a class hierarchy with three classes:  
  - `Worker` (base class)  
  - `OnlineWorker` (subclass)  
  - `OnsiteWorker` (subclass)  
- The `Worker` class includes the following attributes:  
  - `name` (String)  
  - `surname` (String)  
  - `hourlyRate` (double)  
- It also includes a method `calculateSalary(int hoursWorked)` that multiplies `hoursWorked` by `hourlyRate`.  
- Both subclasses override this method using the `@Override` annotation:  
  - `OnsiteWorker` adds a static attribute `fuelCost` to the salary calculation.  
  - `OnlineWorker` adds a constant `INTERNET_FLAT_RATE` to the salary calculation.  
- In the `main()` method of the `Main` class, invoke the salary calculation methods to demonstrate the use of `@Override`.

**Exercise 2 – Deprecated Methods and Suppression**  
- Add deprecated methods to both subclasses using the `@Deprecated` annotation.  
- From an external class, invoke these deprecated methods.  
- Use the `@SuppressWarnings("deprecation")` annotation to suppress warnings during invocation.

### 🔹 Level 2  
**Exercise 1 – Custom Annotation for JSON Serialization**  
- Create a custom annotation `@SaveToJson` that allows serializing a Java object to a JSON file.  
- The annotation should accept a parameter indicating the directory where the resulting file will be saved.  
- Apply the annotation to one or more classes and implement logic to serialize the annotated objects.

### 🔹 Level 3  
**Exercise 1 – Runtime Annotation Processing with Reflection**  
- Extend the previous annotation to be retained at runtime using `@Retention(RetentionPolicy.RUNTIME)`.  
- Use Java Reflection to detect the presence of the annotation and execute the serialization logic accordingly.  
- ✅ Note: This exercise has been merged with Level 2 Exercise 1, since the `@SaveToJson` annotation was already implemented with runtime retention. The only remaining task was to validate its behavior using Reflection to meet Level 3 objectives.

## 💻 Technologies Used  
- Java SE 24  
- IntelliJ IDEA as the development environment  
- Git & GitHub for version control  
- JDK for compiling and running the code  
- OOP Principles:  
  - Inheritance and method overriding  
  - Static and constant attributes  
  - Use of annotations (`@Override`, `@Deprecated`, `@SuppressWarnings`)  
- Custom annotations with parameters  
- JSON serialization logic  
- Java Reflection API for runtime annotation processing

## 📋 Requirements  
- Java Development Kit (JDK) 24 or higher  
- IntelliJ IDEA or any Java-compatible IDE  
- Git installed to clone the repository  
- Basic knowledge of object-oriented programming, annotations, and reflection in Java

## 🛠️ Installation  
- Clone the repository:  
```bash
git clone https://github.com/Viid21/S1_06_Java_Annotations.git
