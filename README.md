📌 Project Overview

This project demonstrates Object Serialization and Deserialization in Java using a simple Student class.
It shows how an object can be saved to a file permanently and later restored back into memory.

This concept is widely used in real-world applications such as:

Student Management Systems

Login & Session Storage

Banking Applications

Saving Game Progress

----

🎯 Learning Objectives

By completing this project, you will learn:

What Serialization and Deserialization are

How to use Serializable interface

How ObjectOutputStream and ObjectInputStream work

Why serialVersionUID is important

How transient protects sensitive data

How to handle ClassNotFoundException

How object persistence works in real life

🛠 Technologies Used

Java (JDK 8 or above)

File Handling (FileInputStream, FileOutputStream)

Object Streams (ObjectInputStream, ObjectOutputStream)

----

📂 Project Structure
SerializationDemo/
│
├── Student.java      // Serializable Student class
├── Main.java         // Serialization & Deserialization logic
├── student.ser       // Generated serialized object file
└── README.md         // Project documentation

----

🧑‍🎓 Student Class Details

Implements Serializable

Contains:

id

name

email

password (marked as transient)

Uses serialVersionUID for version control

🔐 Why transient Is Used

The password field is marked as transient so that:

It is NOT saved in the file

Sensitive information stays protected

After deserialization, its value becomes null

🔑 Why serialVersionUID Is Important

Acts as a version number of the class

Prevents InvalidClassException

Ensures compatibility during deserialization

----

▶️ How to Run the Program
Step 1: Compile the files
javac Student.java Main.java

Step 2: Run the program
java Main

----

🧪 Expected Output
Object Serialized Successfully

Object Deserialized Successfully

ID      : 101
Name    : Kartik
Email   : kartik@email.com
Password: null

----

✅ Exception Handling

The program safely handles:

IOException

ClassNotFoundException

This ensures the program does not crash unexpectedly.

----

📌 Key Concepts Summary
Concept	Description
Serialization	Converting object into file
Deserialization	Restoring object from file
Serializable	Marker interface
transient	Prevents data from being saved
serialVersionUID	Version control for class

----

🏁 Conclusion

This project provides a clear and beginner-friendly understanding of how Java handles object persistence.
It is an essential concept for anyone learning Java backend or core Java.

----
✅ Author

Kartik Krish

----