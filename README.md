# 💰 BudgeT Buddy

**BudgeT Buddy** is a **Java Swing-based desktop application** designed to simplify personal finance management.  
It allows users to track expenses and income, visualize spending patterns, and manage budgets — all through an intuitive and lightweight graphical interface.  
This project is our 2nd year 1st semester OOP group assignment, which was to develop a finance tracker app using java.

Built entirely using **Java and Swing**, the project demonstrates practical use of event-driven programming, GUI layouts, and modular design patterns.

---

## 🚀 Features

- 💵 Add, edit, and delete income or expense entries  
- 📊 Visualize budget summaries and balances  
- 🗂️ Organized GUI built with reusable Swing components  
- 💾 Local data management (with query files for future database integration)  
- 🧮 Automatic total and balance calculations  
- 🖥️ Lightweight, offline-ready, and easy to run  

---

## 🧱 Project Structure

```

BudgetBuddy/
├── Buddy/
│   └── src/
│       ├── financegui/        # GUI components and panels (Login1.java, Register2.java, etc.)
│       ├── javaswingdev/      # Core logic and event handling
│       │   └── chart/         # Charting utilities (if any)
│       ├── swing/             # Swing helper classes
│       └── App.java           # Main application entry point
│
└── queryfordb/                # Database query scripts (for future DB integration)

````

---

## ⚙️ Prerequisites

Before running BudgeT Buddy, ensure you have:

- **Java JDK 17** or higher  
- Any IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans) or a terminal  
- (Optional) **Maven** if you plan to manage dependencies  

Check your Java version:
```bash
java -version
````

---

## 🧩 Setup & Run

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/<your-username>/BudgetBuddy.git
cd BudgetBuddy/Buddy/src
```

### 2️⃣ Compile the Application

Compile all `.java` files, including subfolders:

```cmd
javac financegui/*.java javaswingdev/chart/*.java swing/*.java App.java
```

> ⚠️ The compiler may show warnings about deprecated APIs or unchecked operations — these are safe to ignore.

### 3️⃣ Run the Application

Launch the main GUI (Login1):

```cmd
java -cp . App
```

> This will open the **Login1** GUI window, which is the entry point for BudgeT Buddy.

---

## 🧰 Technologies Used

| Component      | Technology                             |
| -------------- | -------------------------------------- |
| Language       | Java                                   |
| GUI Framework  | Swing                                  |
| Design Pattern | MVC-inspired modular design            |
| Data           | File I/O / Query scripts for future DB |
| IDE Support    | IntelliJ IDEA / Eclipse / NetBeans     |

---

## 💡 Future Improvements

* 🗃️ Integrate database support (e.g., SQLite/MySQL)
* 📊 Add chart visualization for spending trends
* ☁️ Introduce cloud sync or backup
* 🌙 Add a dark mode UI theme
* 🧠 Implement budget insights with AI-based analysis

---

## 🪪 License

This project is open source and available under the [MIT License](LICENSE).
