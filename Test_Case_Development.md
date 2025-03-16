## Test Case Development

### Functional Test Cases

| Test Case ID | Requirement ID | Description                 | Steps                                              | Expected Result                          | Status  |
|-------------|---------------|-----------------------------|----------------------------------------------------|------------------------------------------|---------|
| TC-001      | FR-001        | User submits a query       | 1. Open chatbot  2. Enter query  3. Receive response | Chatbot returns an answer within 2 sec  | Pending |
| TC-002      | FR-002        | API processes requests     | 1. Send API request  2. Receive JSON response     | AecPI returns response within 2 s       | Pending |
| TC-003      | FR-003        | Chatbot saves the chat to the database     | 1. Send query to save chats  2. Chat is saved     | Chats is saved to the database       | Pending |

### Non-Functional Test Cases

| Test Case ID  | Requirement | Description             | Steps                          | Expected Result            | Status  |
|--------------|------------|-------------------------|--------------------------------|----------------------------|---------|
| TC-NF-001   | Performance | Load testing for 10,000 users | Simulate concurrent users      | Response time < 2 sec      | Pending |
| TC-NF-002   | Security   | Encryption validation   | Check data storage format     | Data stored using encryption | Pending |
