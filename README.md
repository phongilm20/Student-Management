# 🎓 Student Management System (OOP Console)

This is a simple **Java console application** designed to manage a list of students.  
The project was built to **practice and demonstrate core Object-Oriented Programming (OOP)** principles.

---

## 🚀 Features

The program provides an interactive menu that allows users to perform the following functions:

1. **Display Students** — Show all students currently in the system.  
2. **Add Student** — Add a new student with information such as *Name, ID, Age, GPA*.  
3. **Delete Student** — Remove a student based on their **index number (STT)**.  
4. **Search Student**  
   - Search by **ID** (shows one matching result).  
   - Search by **Name** (shows all matching results).  
5. **Edit Student** — Update student information based on their index.  
6. **Exit** — Stop the program.  

💡 **Error Handling:**  
The program uses `try-catch` blocks to validate user input, ensuring correct data types (integers, doubles) and handling invalid indices safely.

---

## 🏛️ Project Structure (OOP)

The project is organized into **three main classes**, each with a clear responsibility:

### 🧩 `Student.java` — *Model Class*
- Serves as the blueprint for student objects.  
- Applies **Encapsulation**: all attributes (`id`, `name`, `age`, `gpa`) are `private` and accessed through public getters/setters.  
- Provides a `toString()` method to format student information for display.

### 🧠 `Manage.java` — *Controller / Manager Class*
- Acts as the “brain” of the program, containing the main business logic.  
- Manages a `List<Student>` (the student list).  
- Provides public methods such as  
  `addStudent()`, `deleteStudent()`, `findStudentById()`, `editStudent()`.  
- Applies **Abstraction** by hiding internal logic — the main class only calls high-level methods.

### 🖥️ `studentManage.java` — *View / Main Class*
- Contains the `public static void main(String[] args)` entry point.  
- The only class that interacts directly with the user.  
- Displays the menu, takes input via `Scanner`, and calls methods from `Manage`.

---

## 🛠️ Technologies Used
- **Language:** Java  
- **Libraries:** Java Collections Framework (`ArrayList`, `List`)

---
