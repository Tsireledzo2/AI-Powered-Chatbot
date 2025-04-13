# Domain Model
| **Entity**         | **Attributes**                                                                 | **Methods**                                | **Relationships**                                      |
|--------------------|--------------------------------------------------------------------------------|---------------------------------------------|--------------------------------------------------------|
| `User`             | `userId: UUID`, `name: String`, `role: Enum`                                   | `sendMessage()`, `receiveMessage()`         | Interacts with `ChatbotSession`                       |
| `Chatbot`          | `botId: UUID`, `name: String`, `version: String`                               | `generateResponse()`, `logMessage()`        | Runs `NLPModel`, maintains `ChatbotSession`           |
| `NLPModel`         | `modelType: String`, `version: String`                                         | `trainModel()`, `predictIntent()`           | Used by `Chatbot`                                     |
| `ChatbotSession`   | `sessionId: UUID`, `startTime: DateTime`, `endTime: DateTime`                  | `startSession()`, `endSession()`            | Logs `Message`, connects `User` and `Chatbot`         |
| `Message`          | `messageId: UUID`, `content: String`, `timestamp: DateTime`, `senderType: Enum`| `editMessage()`, `deleteMessage()`          | Exchanged in `ChatbotSession`                         |
| `Intent`           | `intentId: UUID`, `name: String`, `confidence: Float`                          | `addResponsePattern()`, `updateIntent()`    | Detected by `NLPModel`, maps to `ResponsePattern`     |
| `ResponsePattern`  | `patternId: UUID`, `text: String`                                              | `generateResponse()`                        | Linked to `Intent`                                    |

# Business Rules
1. A User can have multiple ChatbotSessions.

2. Each ChatbotSession stores a conversation of messages (from user and chatbot).

3. A Chatbot instance can only run one NLPModel at a time.

4. Each Message belongs to exactly one ChatbotSession.

5. NLPModel classifies a message’s intent and generates an appropriate response using ResponsePattern.
