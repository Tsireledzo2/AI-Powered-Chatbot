# AI-Powered-Chatbot

## Description
This project is aimed at developing an AI-powered chatbot system designed to assist users with a variety of tasks using natural language processing.

## Links
- [SPECIFICATION.md](./SPECIFICATION.md)
- [ARCHITECTURE.md](./ARCHITECTURE.md)
- [STAKEHOLDERS.md](./STAKEHOLDERS.md)
- [SYSTEM_REQUIREMENTS.md](./SYSTEM_REQUIREMENTS.md)
- [Use Case Diagrams.md.md](./Use_Case_Diagrams.md)
- [Use Case Specifications.md](./Use_Case_Specifications.md)
- [Test Case Development.md](./Test_Case_Development.md)
- [Reflection: Challenges in Translating Requirements to Use Cases and Tests.md](./Reflection_Challenges_in_Translating_Requirements_to_Use_Cases_and_Tests.md)
- [User Stories.md](./User_Stories.md)
- [Reflaction: Prioritization, estimation.md](./ReflectionChallenges_in_prioritization_estimation.md)
- [Agile documentation.md](./Documentation_&_Clarity.md)
- [template_analysis.md](./Template_Analysis_and_Selection.md)
- [Kanban_Creation.md](./Kanban_Creation.md)
- [kanban_explanation.md](./kanban_explanation.md)
- [Reflection_Discuss_challenges_in_selecting_and_customizing_the_template.md](./Reflection_Discuss_challenges_in_selecting_and_customizing_the_template.md)
- [State _transition_Diagrams.md](./State_transition_Diagrams.md)
- [Activity_Workflow_Modeling.md](./Activity_Workflow_Modeling.md)
- [Integration_with_Prior_Work.md](./Integration_with_Prior_Work.md)
- [Domain_Model_and_BusinessRules.md](./Domain_Model_and_BusinessRules.md)
- [Reflection_Assignment9.md](./Reflection_Assignment9.md)
- [CoverageReport.md](./CoverageReport.md)

# Justification of  generic repository interface
## Why use a generic Repository interface?

We used a generic `Repository<T, ID>` interface to define standard CRUD operations for all entities like `User`, `Intent`, `Chatbot`, etc.  
This avoids code duplication, promotes reusability, and ensures consistency across the project.

Entity-specific repositories (such as `UserRepository`, `IntentRepository`) extend the generic interface by specifying the entity type and its ID type (`UUID`).

# Repository Abstraction Mechanism

We chose the **Factory Pattern** to decouple the repository layer from specific storage mechanisms.

Instead of hard-coding the storage backend, our services can now request a repository from the `RepositoryFactory`, specifying the desired storage type (e.g., "MEMORY", "DATABASE").

## Why Factory over Dependency Injection (DI)?
- Factory keeps the project lightweight without needing a DI framework like Spring.
- We can easily extend the factory in the future to support new backends (e.g., `PostgresUserRepository` or `MongoDBChatbotSessionRepository`).
- It keeps construction logic centralized in one place, avoiding duplicate `new` calls across services.

## Example Usage

`java`
`UserRepository userRepo = RepositoryFactory.getUserRepository("MEMORY");`


`We also provided in-memory repository implementations to allow easy testing and decoupling from any specific database technology.`

## Future Proofing

The system is designed so that new storage options (like databases or filesystem storage) can be added easily.

- All repositories implement the generic `Repository<T, ID>` interface.
- We added stub classes like `DatabaseUserRepository`, which can later connect to a real database (e.g., MySQL, PostgreSQL).
- The `RepositoryFactory` allows selecting the storage backend at runtime.

### Example

```java
UserRepository repo = RepositoryFactory.getUserRepository("DATABASE");




