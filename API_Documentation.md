# API Documentation
openapi: 3.0.0
info:
  title: Chat Bot API
  description: API for managing chat bot components including users, messages, sessions, and responses
  version: 1.0.0
servers:
  - url: http://localhost:8080
    description: Development server

tags:
  - name: User
    description: Operations related to user management
  - name: ResponsePattern
    description: Manage chatbot response patterns
  - name: Intent
    description: Manage chatbot intents
  - name: ChatSession
    description: Manage chat sessions
  - name: Chatbot
    description: Manage chatbot configurations
  - name: Message
    description: Handle message operations

paths:
  # User Controller Endpoints
  /user/saveUser:
    post:
      tags: [User]
      summary: Create a new user
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/User'
      responses:
        '200':
          description: User created successfully
        '400':
          description: Invalid input
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Error'
  
  /user/getUser/{userId}:
    get:
      tags: [User]
      summary: Get user by ID
      parameters:
        - name: userId
          in: path
          required: true
          schema:
            type: string
            format: uuid
      responses:
        '200':
          description: User found
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/User'
        '404':
          description: User not found
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Error'

  /user/getAllUser:
    post:
      tags: [User]
      summary: Get all users
      responses:
        '200':
          description: List of all users
          content:
            application/json:
              schema:
                type: array
                items:
                  $ref: '#/components/schemas/User'

  /user/deleteUser/{userId}:
    delete:
      tags: [User]
      summary: Delete a user
      parameters:
        - name: userId
          in: path
          required: true
          schema:
            type: string
            format: uuid
      responses:
        '204':
          description: User deleted successfully
        '404':
          description: User not found
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Error'

  # ResponsePattern Controller Endpoints
  /responsePattern/saveResponse:
    post:
      tags: [ResponsePattern]
      summary: Save a response pattern
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/ResponsePattern'
      responses:
        '200':
          description: Response pattern saved successfully

  /responsePattern/getUser/{responsePatterId}:
    get:
      tags: [ResponsePattern]
      summary: Get response pattern by ID
      parameters:
        - name: responsePatterId
          in: path
          required: true
          schema:
            type: string
            format: uuid
      responses:
        '200':
          description: Response pattern found
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/ResponsePattern'
        '404':
          description: Response pattern not found

  /responsePattern/getAllresponse:
    post:
      tags: [ResponsePattern]
      summary: Get all response patterns
      responses:
        '200':
          description: List of all response patterns
          content:
            application/json:
              schema:
                type: array
                items:
                  $ref: '#/components/schemas/ResponsePattern'

  /responsePattern/deleteResponse/{responsePatterId}:
    delete:
      tags: [ResponsePattern]
      summary: Delete a response pattern
      parameters:
        - name: responsePatterId
          in: path
          required: true
          schema:
            type: string
            format: uuid
      responses:
        '204':
          description: Response pattern deleted successfully
        '404':
          description: Response pattern not found

  # Intent Controller Endpoints
  /intent/savedIntent:
    post:
      tags: [Intent]
      summary: Save an intent
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/Intent'
      responses:
        '200':
          description: Intent saved successfully

  /intent/getIntent/{intentId}:
    get:
      tags: [Intent]
      summary: Get intent by ID
      parameters:
        - name: intentId
          in: path
          required: true
          schema:
            type: string
            format: uuid
      responses:
        '200':
          description: Intent found
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Intent'
        '404':
          description: Intent not found

  /intent/getAllUser:
    post:
      tags: [Intent]
      summary: Get all intents
      responses:
        '200':
          description: List of all intents
          content:
            application/json:
              schema:
                type: array
                items:
                  $ref: '#/components/schemas/Intent'

  /intent/deleteUser/{userId}:
    delete:
      tags: [Intent]
      summary: Delete an intent
      parameters:
        - name: userId
          in: path
          required: true
          schema:
            type: string
            format: uuid
      responses:
        '204':
          description: Intent deleted successfully
        '404':
          description: Intent not found

  # Chat Session Controller Endpoints
  /chatSession/saveSession:
    post:
      tags: [ChatSession]
      summary: Save a chat session
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/ChatbotSession'
      responses:
        '200':
          description: Session saved successfully

  /chatSession/getSession/{sessionId}:
    get:
      tags: [ChatSession]
      summary: Get session by ID
      parameters:
        - name: sessionId
          in: path
          required: true
          schema:
            type: string
            format: uuid
      responses:
        '200':
          description: Session found
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/ChatbotSession'
        '404':
          description: Session not found

  /chatSession/getAllSessions:
    get:
      tags: [ChatSession]
      summary: Get all sessions
      responses:
        '200':
          description: List of all sessions
          content:
            application/json:
              schema:
                type: array
                items:
                  $ref: '#/components/schemas/ChatbotSession'

  /chatSession/deleteSession/{sessionId}:
    delete:
      tags: [ChatSession]
      summary: Delete a session
      parameters:
        - name: sessionId
          in: path
          required: true
          schema:
            type: string
            format: uuid
      responses:
        '204':
          description: Session deleted successfully
        '404':
          description: Session not found

  # Chatbot Controller Endpoints
  /chat/saveChatbot:
    post:
      tags: [Chatbot]
      summary: Save a chatbot configuration
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/Chatbot'
      responses:
        '200':
          description: Chatbot saved successfully

  /chat/getChatbot/{chatbotId}:
    get:
      tags: [Chatbot]
      summary: Get chatbot by ID
      parameters:
        - name: chatbotId
          in: path
          required: true
          schema:
            type: string
            format: uuid
      responses:
        '200':
          description: Chatbot found
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Chatbot'
        '404':
          description: Chatbot not found

  /chat/getAllChatbots:
    get:
      tags: [Chatbot]
      summary: Get all chatbots
      responses:
        '200':
          description: List of all chatbots
          content:
            application/json:
              schema:
                type: array
                items:
                  $ref: '#/components/schemas/Chatbot'

  /chat/deleteChatbot/{chatbotId}:
    delete:
      tags: [Chatbot]
      summary: Delete a chatbot
      parameters:
        - name: chatbotId
          in: path
          required: true
          schema:
            type: string
            format: uuid
      responses:
        '204':
          description: Chatbot deleted successfully
        '404':
          description: Chatbot not found

  # Message Controller Endpoints
  /message/saveMessage:
    post:
      tags: [Message]
      summary: Save a message
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/Messages'
      responses:
        '200':
          description: Message saved successfully

  /message/getMessages/{messageId}:
    get:
      tags: [Message]
      summary: Get message by ID
      parameters:
        - name: messageId
          in: path
          required: true
          schema:
            type: string
            format: uuid
      responses:
        '200':
          description: Message found
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Messages'
        '404':
          description: Message not found

  /message/getAllMessages:
    post:
      tags: [Message]
      summary: Get all messages
      responses:
        '200':
          description: List of all messages
          content:
            application/json:
              schema:
                type: array
                items:
                  $ref: '#/components/schemas/Messages'

  /message/deleteMessages/{messageId}:
    delete:
      tags: [Message]
      summary: Delete a message
      parameters:
        - name: messageId
          in: path
          required: true
          schema:
            type: string
            format: uuid
      responses:
        '204':
          description: Message deleted successfully
        '404':
          description: Message not found

components:
  schemas:
    User:
      type: object
      properties:
        id:
          type: string
          format: uuid
        username:
          type: string
        email:
          type: string
          format: email
        createdAt:
          type: string
          format: date-time

    ResponsePattern:
      type: object
      properties:
        id:
          type: string
          format: uuid
        pattern:
          type: string
        response:
          type: string
        intentId:
          type: string
          format: uuid

    Intent:
      type: object
      properties:
        id:
          type: string
          format: uuid
        name:
          type: string
        description:
          type: string

    ChatbotSession:
      type: object
      properties:
        id:
          type: string
          format: uuid
        userId:
          type: string
          format: uuid
        startedAt:
          type: string
          format: date-time
        lastActivity:
          type: string
          format: date-time
        status:
          type: string
          enum: [active, inactive, completed]

    Chatbot:
      type: object
      properties:
        id:
          type: string
          format: uuid
        name:
          type: string
        description:
          type: string
        createdAt:
          type: string
          format: date-time
        isActive:
          type: boolean

    Messages:
      type: object
      properties:
        id:
          type: string
          format: uuid
        sessionId:
          type: string
          format: uuid
        sender:
          type: string
          enum: [user, bot]
        content:
          type: string
        timestamp:
          type: string
          format: date-time

    Error:
      type: object
      properties:
        timestamp:
          type: string
          format: date-time
        status:
          type: integer
        error:
          type: string
        message:
          type: string
        path:
          type: string

# Swagger ScreenShot
![image](https://github.com/user-attachments/assets/cfe5675a-8822-41e0-b071-1e63690d4c15)


