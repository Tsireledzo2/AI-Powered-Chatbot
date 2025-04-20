#  State Transition Diagrams mermaid screenshot
![mermaid-diagram-2025-04-06-201547](https://github.com/user-attachments/assets/49a4ed35-647f-46cb-8fb6-6bc93d968522)

# Markdown explanation
- **User:** This state diagram models the lifecycle of a user, starting from registration, becoming active after email verification, and possible transitions to suspended or deactivated states. It directly supports account management features (FR-001, FR-004).

- **ChatSession:** Represents the lifecycle of a chat session from initiation to archival. This supports features like live chat and session persistence (FR-006).

- **Message:** Details how user messages transition from composition to delivery and processing by the bot, supporting the messaging pipeline (FR-007).

- **BotResponse:** Describes how responses are generated, sent, delivered, and logged, giving insight into bot behavior tracking (FR-009).

- **Intent:** Captures the creation, review, activation, and retirement of chatbot intents, reflecting content lifecycle management (FR-010).

- **ConversationHistory:** Shows how conversation data is handled during and after a session, addressing needs for history storage and access (FR-012).

- **ErrorLog:** Models the journey of an error report from detection to resolution and archival, enabling better error handling and monitoring (FR-014).

- **AdminAccount:** Highlights the lifecycle of admin accounts, including creation, lockout, and deactivation. This ties into administrative functions and security (FR-015).

#  State Transition Diagrams mermaid code

```
    %% User
    state User {
        [*] --> Registered : user signs up
        Registered --> Active : email verified
        Active --> Suspended : too many failed logins
        Active --> Deactivated : user deletes account
        Suspended --> Active : admin reinstates
        Deactivated --> [*]
    }

    %% ChatSession
    state ChatSession {
        [*] --> Initiated : user starts chat
        Initiated --> Active : bot responds
        Active --> Ended : user ends chat
        Ended --> Archived : system stores log
        Archived --> [*]
    }

    %% Message
    state Message {
        [*] --> Composing : user typing
        Composing --> Sent : user hits send
        Sent --> Delivered : system queues message
        Delivered --> Processed : bot receives
        Processed --> [*]
    }

    %% BotResponse
    state BotResponse {
        [*] --> Generated : bot processes message
        Generated --> Sent : message queued
        Sent --> Delivered : reaches user
        Delivered --> Logged : archived
        Logged --> [*]
    }

    %% Intent
    state Intent {
        [*] --> Draft : created by admin
        Draft --> Reviewed : under QA
        Reviewed --> Active : approved
        Active --> Retired : deprecated intent
        Retired --> [*]
    }

    %% ConversationHistory
    state ConversationHistory {
        [*] --> InMemory : active session
        InMemory --> Persisted : user ends chat
        Persisted --> Archived : long-term storage
        Archived --> [*]
    }

    %% ErrorLog
    state ErrorLog {
        [*] --> New : error detected
        New --> Investigating : devs notified
        Investigating --> Resolved : fixed
        Resolved --> Archived : closed
        Archived --> [*]
    }

    %% AdminAccount
    state AdminAccount {
        [*] --> Created : by sysadmin
        Created --> Active : credentials set
        Active --> Locked : multiple login failures
        Locked --> Active : reset by sysadmin
        Active --> Deactivated : account retired
        Deactivated --> [*]
    }```
