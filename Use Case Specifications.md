# Use Case Specifications

## Use Case 1: User Sends a Query
- **Actor:** End User  
- **Precondition:** User has access to the chatbot interface.  
- **Postcondition:** The chatbot responds to the user's query.  

### Basic Flow:
1. User enters a query.  
2. System processes the query using the AI model.  
3. System returns a response to the user.  

### Alternative Flow:
- If no valid response is found, the system provides a fallback response.  

---

## Use Case 2: Chatbot Processes the Question and Sends Query to the Database
- **Actor:** Chatbot  
- **Precondition:** End user input must be submitted.  
- **Postcondition:** The end user query must be processed and sent to the database.  

### Basic Flow:
1. End user query is read.  
2. Chatbot processes it to build a proper query for the database.  
3. Chatbot sends the query to the database to retrieve information.  

### Alternative Flow:
- If the user input can’t be processed, an error message is sent to the user.  

---

## Use Case 3: Database Responds to Chatbot Request/Query
- **Actor:** Database  
- **Precondition:** Query must be sent from the chatbot.  
- **Postcondition:** Database must send feedback to the chatbot.  

### Basic Flow:
1. Chatbot sends the query.  
2. Database receives the query and processes it.  
3. Database sends feedback to the chatbot.  

### Alternative Flow:
- If no valid response is found, the database provides a fallback response.  

---

## Use Case 4: Chatbot Processes the Response, Formats It, and Sends It to the User
- **Actor:** Chatbot  
- **Precondition:** Feedback must be sent to the chatbot from the database.  
- **Postcondition:** The feedback must be processed and sent to the user.  

### Basic Flow:
1. Database sends the feedback to the chatbot.  
2. Chatbot processes and formats the feedback.  
3. Feedback is sent to the user.  

### Alternative Flow:
- If no valid response is found, the system provides a fallback response.  

---

## Use Case 5: Chatbot Saves the Chats to the Database
- **Actor:** Chatbot  
- **Precondition:** User must receive the feedback.  
- **Postcondition:** The conversation must be saved.  

### Basic Flow:
1. Chatbot sends the feedback to the user.  
2. User receives the feedback.  
3. The conversation is saved to the database.  

### Alternative Flow:
- If the user doesn’t receive the feedback, the chat is not saved.  

# Use Case Specifications pdf
[Use Case Specifications.pdf](https://github.com/user-attachments/files/19275921/Use.Case.Specifications.pdf)
