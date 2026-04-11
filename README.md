# 💬 Java Chat Messenger with Log Facility

## 📌 Overview
Java Chat Messenger is a simple client-server chat application built using Java Socket Programming. It enables real-time communication between a client and a server over a TCP connection.
The application also includes a chat logging feature, which stores all exchanged messages in a file for future reference.
This project demonstrates core concepts like Java Networking, I/O Streams, and Client-Server Architecture.

---

## 🚀 Features
- Real-time communication between client and server  
- TCP-based socket communication  
- Console-based chat interface  
- Automatic message logging to file  
- Simple and lightweight design  
- Easily extendable to multi-client systems  

---

## 🛠️ Technologies Used
- Java  
- Socket Programming  
- Java I/O Streams  
- File Handling (FileWriter, BufferedWriter)  

---

## 📂 Project Structure


Java-Chat-Messenger-With-Log-Facility
│
├── src
│   ├── Client.java
│   └── Server.java
│
├── logs
│   └── chat_log.txt
│
├── docs
│   └── project_overview.md
│
├── README.md
└── .gitignore


---

## ⚙️How to Run the Project

### 1️⃣ Clone Repository

git clone https://github.com/nityamore/Java_Chat_Messenger_With_Log_Facility.git

### 2️⃣ Navigate to Source Directory

cd Java-Chat-Messenger-With-Log-Facility/src

### 3️⃣ Compile the Program

javac Server.java
javac Client.java

### 4️⃣ Run the Server

java Server

### 5️⃣ Run the Client (in another terminal)

java Client


---

## 💬 How the Application Works

- The client connects to the server using a socket  
- Messages are exchanged using *input/output streams*  
- All messages are stored in chat_log.txt  
- Communication continues until the client ends the session
  
---

## 📝 Chat Log Example
Example content stored in the log file:

Client : Hello Server  
Server : Hi Client  
Client : Testing chat communication  
Server : Communication successful  

The log file maintains a record of all chat communication for future reference.

---

## 📸 Example Console Interaction

### Server

Server application is running...
Server is waiting for the client at port number 5100
Connection established with the client...
Client says : Hello Server
Enter message for client :
Hi Client

### Client

Client application is running...
Connection established with the Server...
Hello Server
Server says : Hi Client

---

## 🔮 Possible Future Enhancements

- Support for multiple clients with improved messaging features  
- Add GUI (Java Swing), secure communication, and message history tracking    

## 👨‍💻 Author

Nitya More Java Backend Developer (Fresher) Pune, Maharashtra, India

🔗 GitHub: https://github.com/nityamore
