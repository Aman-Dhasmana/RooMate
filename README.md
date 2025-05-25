# 🏠 RooMate

**RooMate** is a room-based real-time chat application that allows users to create or join chat rooms and communicate instantly. It combines a modern frontend built with **React**, **Vite**, and **Tailwind CSS**, and a robust backend powered by **Spring Boot** and **MongoDB**. Real-time communication is enabled using **WebSocket**.

---

## 🚀 Features

- 🔐 Create a chat room
- 🔑 Join an existing room
- 💬 Real-time messaging via WebSockets
- 🧠 Persistent data with MongoDB
- ⚡ Lightning-fast frontend using Vite
- 🎨 Beautiful UI with Tailwind CSS

---

## 🛠 Tech Stack

| Frontend   | Backend     | Database | Communication |
|------------|-------------|----------|----------------|
| React      | Spring Boot | MongoDB  | WebSocket       |
| Vite       | Java        |          | STOMP over SockJS |
| Tailwind   |              |          |                |

---

## 📦 Project Structure

front-chat/
├── frontend/ # React + Vite + Tailwind frontend
└── backend/ # Spring Boot backend

---

## ⚙️ Setup Instructions

### 🔧 Backend (Spring Boot)

1. Open `backend/` in IntelliJ.
2. Configure MongoDB connection in `application.properties`.
3. Run `ChatAppBackendApplication.java`.

> Make sure MongoDB is running locally or hosted remotely.

---

### 💻 Frontend (React)

```bash
cd frontend
npm install
npm run dev

)

📍 Future Improvements
User authentication (JWT)

Room moderation

Typing indicators

Message history and persistence

Responsive mobile design

🤝 Contribution
Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

