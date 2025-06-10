# 🏅 SAApp – Sports Association App

> **CMPS251 – Object-Oriented Programming | Qatar University**

**SAApp** is a console-based Java application built as part of the CMPS251 course at Qatar University. The project demonstrates the practical application of core object-oriented programming (OOP) principles including encapsulation, inheritance, polymorphism, and abstraction—tailored around a simulated sports association system.

---

## 📌 Overview

SAApp is designed to simulate real-world sports organization operations. The system allows users to manage and interact with:

- Player profiles and performance statistics
- Coaches and their assigned teams
- Sports clubs and supported disciplines
- Administrator-level tasks and reporting functions

---

## 🚀 Key Features

- **Object-Oriented Architecture** with classes like `Player`, `Coach`, `Club`, `Sport`, and `Administrator`
- **Inheritance & Interfaces** with an abstract superclass `Person`, extended by specific roles
- **Encapsulation** through private fields and public accessors
- **Interactive Console UI** for adding, editing, and searching entities
- **Dynamic Reporting** for sorting, filtering, and classifying data by roles and attributes

---

## 📁 Project Structure

```
📂 sports-association-app-java
├── SAAppProject - phase 1/
│   └── src/
│       ├── model/              # Core entity classes (Player, Club, Sport, etc.)
│       └── test/               # Contains SAAppTester.java (entry point)
│
├── SAAppProject - phase 2/
│   ├── src/
│   │   ├── application/        # Main JavaFX app and launcher
│   │   ├── Controllers/        # JavaFX controller classes
│   │   ├── model/              # Core model classes reused from Phase 1
│   │   ├── Repository/         # Data access layer (e.g., PlayerRepository)
│   │   ├── test/               # Test harness
│   │   └── view/               # FXML layout files
│   ├── *.dat                  # Serialized data files
│
├── .gitignore
└── README.md
```

---

## 🧠 Concepts Demonstrated

- Java OOP fundamentals (Abstraction, Inheritance, Polymorphism)
- Encapsulation & data hiding
- Class hierarchy design
- Method overloading
- Package organization
- Console-based interaction
- JavaDoc for documentation

---

## 🛠 How to Run

#### 🔹 Phase 1 (Console-based)
1. Open the project in your preferred Java IDE (e.g., Eclipse, IntelliJ).
2. Navigate to `SAAppProject - phase 1/src/test/SAAppTester.java`.
3. Run the file to launch the console-based interface.

#### 🔹 Phase 2 (GUI-based with JavaFX)
1. Ensure JavaFX libraries are configured in your IDE.
2. Open `SAAppProject - phase 2/src/application/Main.java`.
3. Run `Main.java` to launch the GUI interface.
4. Make sure the `.dat` files (`players.dat`, `sportNames.dat`, etc.) are accessible in the root directory—they store serialized data.

---

## 📸 Screenshots

### 📋 Console Output – Phase 1
![Console Output 1](screenshots/console_output1.png)
![Console Output 2](screenshots/console_output2.png)

### 🖥️ JavaFX GUI – Phase 2
![Main Window](screenshots/gui_main_window.png)
![Add Player](screenshots/gui_add_player.png)
![Update Player](screenshots/gui_update_player.png)
![Delete Player](screenshots/gui_delete_player.png)
![Duplicate ID Warning](screenshots/gui_duplicate_id_warning.png)
![Validation Alert](screenshots/gui_validation_alert.png)

---

## 👩🏻‍💻 Author

**Islam Hamdi**  
Computer Science Student – Qatar University  
Course: CMPS251 – Object-Oriented Programming

---

## 📜 License

This project is intended solely for educational use and academic demonstration.
