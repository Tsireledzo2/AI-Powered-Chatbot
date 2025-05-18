# 📍 Project Roadmap

This document outlines planned enhancements and features for the AI-Powered Chatbot. Contributions are welcome—feel free to submit suggestions or tackle items from this roadmap.

---

## ✅ Completed

- Basic CRUD for Users, Chatbot, Sessions, Intents
- REST API with Spring Boot
- Swagger UI integration
- Initial unit tests for services

---

## 🚧 In Progress

- Implement global exception handling
- Add OpenAPI/Swagger documentation to all endpoints
- Expand test coverage (service + controller layers)

---

## 🧠 Planned Features

### 🗃️ Performance & Caching
- [ ] Integrate Redis caching for chatbot responses
- [ ] Add request/response logging with Spring AOP

### 🌍 Multi-language Support
- [ ] Support multiple languages via i18n properties
- [ ] Add language selector in frontend (if applicable)

### 🔐 Security
- [ ] Add JWT-based user authentication
- [ ] Role-based access control (admin/user)
- [ ] Rate-limiting on API endpoints

### 🧠 Chatbot Intelligence
- [ ] Add NLP preprocessing pipeline
- [ ] Integrate with external AI APIs (e.g., OpenAI, Hugging Face)
- [ ] Store chat history per user

### 📊 Analytics
- [ ] Track chatbot usage statistics
- [ ] Visualize analytics in admin dashboard

### 🧪 Testing & Quality
- [ ] Setup CI/CD with GitHub Actions
- [ ] Enforce code coverage >80%
- [ ] Add API contract tests with Postman or Rest Assured

---

## 💡 Ideas for Future

- WebSocket-based real-time chat support
- Admin panel UI (React or Angular)
- Voice interaction support using Web Speech API

---

> 🚀 Want to help implement one of these features? Fork the repo, check the [CONTRIBUTING.md](CONTRIBUTING.md), and open a PR referencing the roadmap item.
