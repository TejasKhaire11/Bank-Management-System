# 🏦 Bank Management System (Signup/Login Module)

This project is a basic **Bank Management System** developed in Java.  
It currently includes:

- ✅ Multi-step Signup pages (Signup1, Signup2, Signup3)
- ✅ Login page for existing users
- ✅ MySQL database integration using JDBC

## ✨ Features Implemented So Far

- 🔐 User Login system
- 📝 3-step Signup form (Signup1 → Signup2 → Signup3)
- 🗃️ Data stored in MySQL database
- 📶 JDBC used for database connection


## 🛠️ Technologies Used

- Java (Core + Swing)
- MySQL (Database)
- JDBC (Database connectivity)
- VS Code / IntelliJ (IDE)


## 🚀 How to Run the Project

1. Clone or download this repository  
2. Make sure MySQL is installed and running  
3. Import the database schema (if `database.sql` file is provided)  
4. Update DB credentials in your Java code (`DBConnection.java` or similar)

```java
// Example DB config
String url = "jdbc:mysql://localhost:3306/bankdb";
String user = "root";
String pass = "your_password";
```

5. Compile and run the project:
```bash
javac Signup1.java
java Signup1
```


## 🧱 Project Structure (So Far)

```
BankManagementSystem/
├── Signup1.java
├── Signup2.java
├── Signup3.java
├── Login.java
├── DBConnection.java
├── README.md
└── database.sql (if include)
```

---

## 🚧 Future Scope

- Add deposit and withdraw functionality
- Show account balance after login
- Integrate transaction history logs
- Create user dashboard
- Add admin panel to manage users

---
## 📜 License

This project is open-source for educational purposes.
---

## 🙋‍♂️ Developer

Created by "Tejas Khaire" — 3rd Year AIML Student  
Feel free to contribute or suggest improvements!
