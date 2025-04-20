# Activity Diagrams
![image](https://github.com/user-attachments/assets/f292c71b-8b6b-4c0e-839e-75eb77d6a928)

# Explanation
### User Registration:
- **Stakeholder Needs:** Secure and streamlined onboarding
### User Login:
- **Stakeholder Needs:** Prevent unauthorized access
### Start Chat Session:
- **Stakeholder Needs:** Fast session setup
### Send Message:
- **Stakeholder Needs:** Smooth interaction flow
### Generate Bot Response:
- **Stakeholder Needs:** Fast and relevant response
### Log Conversation:
- **Stakeholder Needs:** Retain records for QA
### Report Error:
- **Stakeholder Needs:** Real-time error reporting
### Admin Updates Intent:
- **Stakeholder Needs:** Controlled content updates

# Mermeid code for Activity Diagram
```
%% === User Registration ===
flowchart TD
    reg_start([Start]) --> reg_details[Enter Details]
    reg_details --> reg_validate[Validate Email Format]
    reg_validate --> reg_decide{Is Valid?}
    reg_decide -- No --> reg_error[Show Error]
    reg_decide -- Yes --> reg_store[Store User Info]
    reg_store --> reg_send[Send Verification Email]
    reg_send --> reg_end([End])

%% === User Login ===
    login_start([Start]) --> login_enter[Enter Credentials]
    login_enter --> login_validate[Validate Credentials]
    login_validate --> login_decide{Correct?}
    login_decide -- No --> login_retry[Retry/Login Blocked]
    login_decide -- Yes --> login_granted[Access Granted]
    login_granted --> login_end([End])

%% === Start Chat Session ===
    chat_start([Start]) --> chat_click[User Clicks Chat]
    chat_click --> chat_init[Session Initiated]
    chat_init --> chat_welcome[Display Welcome Message]
    chat_welcome --> chat_end([End])

%% === Send Message ===
    msg_start([Start]) --> msg_type[User Types Message]
    msg_type --> msg_send[Click Send]
    msg_send --> msg_queue[Message Queued]
    msg_queue --> msg_end([End])

%% === Generate Bot Response ===
    bot_start([Start]) --> bot_recv[Receive Message]
    bot_recv --> bot_parse[Parse Intent]
    bot_parse --> bot_check{Intent Found?}
    bot_check -- No --> bot_default[Return Default Response]
    bot_check -- Yes --> bot_gen[Generate Response]
    bot_gen --> bot_deliver[Queue for Delivery]
    bot_default --> bot_end([End])
    bot_deliver --> bot_end

%% === Log Conversation ===
    log_start([Start]) --> log_endSession[End Session]
    log_endSession --> log_format[Format Log]
    log_format --> log_store[Store in DB]
    log_store --> log_end([End])

%% === Report Error ===
    err_start([Start]) --> err_detect[Error Detected]
    err_detect --> err_log[Log Error]
    err_log --> err_notify[Notify Developer]
    err_notify --> err_end([End])

%% === Admin Updates Intent ===
    admin_start([Start]) --> admin_login[Admin Logs In]
    admin_login --> admin_select[Select Intent to Edit]
    admin_select --> admin_update[Update Content]
    admin_update --> admin_save[Save Changes]
    admin_save --> admin_review[Mark for Review]
    admin_review --> admin_end([End])
