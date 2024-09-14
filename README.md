# Socket Chat Application

## Overview

The **Socket Chat Application** is a simple yet powerful Java-based chat system that allows multiple users to communicate over a network. This application utilizes **sockets** for real-time, bi-directional communication between clients and a server, creating an instant messaging experience. It supports basic text messaging and can be extended for more complex functionalities.

## Features

- **Multi-Client Support**: Multiple users can connect to the server and chat in real time.
- **Server-Client Architecture**: A central server manages all client connections and message forwarding.
- **Instant Messaging**: Real-time text message transmission between clients.
- **Simple and Lightweight**: Minimalistic design focusing on core chat functionality.
- **Scalable**: The application can be extended to support more features, such as file sharing, user authentication, etc.

## Technology Stack

- **Programming Language**: Java
- **Network Protocol**: TCP (Transmission Control Protocol)
- **Libraries**: Java's `Socket` and `ServerSocket` classes for networking.

## How It Works

- **Server**: The server listens on a specific port for incoming client connections. It accepts multiple clients and forwards messages between them.
- **Client**: Each client connects to the server and can send and receive messages. Messages sent by one client are broadcasted to all connected clients.

## Installation and Setup

### 1. Clone the Repository

```bash
git clone https://github.com/Ganeshhhhh/socket_chat_application.git
cd socketchatapplication
```

### 2. Running the Server

1. Compile the server-side code:
   ```bash
   javac Server.java
   ```

2. Run the server:
   ```bash
   java Server
   ```
   The server will start and listen for client connections on a predefined port (e.g., `8080`).

### 3. Running the Client

1. Compile the client-side code:
   ```bash
   javac Client.java
   ```

2. Run the client:
   ```bash
   java Client
   ```
   You will be prompted to enter the server's IP address and the port number to establish the connection.

### 4. Chat

Once both the server and clients are running, users can start exchanging messages. All messages are transmitted via the server and broadcasted to every connected client.

## Usage

1. **Start the server**: The server must be started first to accept incoming client connections.
2. **Start the clients**: Run multiple instances of the client, connecting to the server by specifying the IP address and port.
3. **Begin chatting**: Clients can send messages which will be visible to all connected users.

## Future Enhancements

- **User Authentication**: Add login/logout functionality.
- **Private Messaging**: Allow users to send private messages to specific users.
- **File Sharing**: Enable file transfers between clients.
- **GUI**: Implement a graphical user interface using JavaFX or Swing for better user experience.

## Contributing

We welcome contributions to improve the **Socket Chat Application**. Here's how you can contribute:

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Submit a pull request.

## Screenshots

![ca1](https://github.com/user-attachments/assets/898211a1-601e-4984-8cef-e821f81a8b58)
![ca2](https://github.com/user-attachments/assets/37e5ee76-4d34-410a-944b-525243a643de)
![ca3](https://github.com/user-attachments/assets/1e4579fc-c85c-4594-868e-c90f210518be)
