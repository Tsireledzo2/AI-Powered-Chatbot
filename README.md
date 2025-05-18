# AI-Powered-Chatbot

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven 3.8+
- PostgreSQL or H2 (optional for local dev)

### Installation

1. **Clone the repository**

```bash
git clone https://github.com/your-username/ai-powered-chatbot.git
cd ai-powered-chatbot
```
## 💡 Features for Contribution
| Feature                                | Status      | Type              |
| -------------------------------------- | ----------- | ----------------- |
| Redis Caching for Responses            | Planned     | Performance       |
| JWT Authentication                     | Planned     | Security          |
| NLP Integration (OpenAI, Hugging Face) | Planned     | AI Enhancement    |
| Chat History by User                   | In Progress | Data Management   |
| WebSocket Live Chat                    | Planned     | Real-time Feature |
| Swagger + OpenAPI Docs                 | Done        | Documentation     |


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
- [API_Documentation.md](./API_Documentation.md)

## Justification of  generic repository interface
### Why use a generic Repository interface?

We used a generic `Repository<T, ID>` interface to define standard CRUD operations for all entities like `User`, `Intent`, `Chatbot`, etc.  
This avoids code duplication, promotes reusability, and ensures consistency across the project.

Entity-specific repositories (such as `UserRepository`, `IntentRepository`) extend the generic interface by specifying the entity type and its ID type (`UUID`).

## Repository Abstraction Mechanism

We chose the **Factory Pattern** to decouple the repository layer from specific storage mechanisms.

Instead of hard-coding the storage backend, our services can now request a repository from the `RepositoryFactory`, specifying the desired storage type (e.g., "MEMORY", "DATABASE").

### Why Factory over Dependency Injection (DI)?
- Factory keeps the project lightweight without needing a DI framework like Spring.
- We can easily extend the factory in the future to support new backends (e.g., `PostgresUserRepository` or `MongoDBChatbotSessionRepository`).
- It keeps construction logic centralized in one place, avoiding duplicate `new` calls across services.

### Example Usage

`java`
`UserRepository userRepo = RepositoryFactory.getUserRepository("MEMORY");`


`We also provided in-memory repository implementations to allow easy testing and decoupling from any specific database technology.`

### Future Proofing

The system is designed so that new storage options (like databases or filesystem storage) can be added easily.

- All repositories implement the generic `Repository<T, ID>` interface.
- We added stub classes like `DatabaseUserRepository`, which can later connect to a real database (e.g., MySQL, PostgreSQL).
- The `RepositoryFactory` allows selecting the storage backend at runtime.

#### Example

```java
UserRepository repo = RepositoryFactory.getUserRepository("DATABASE");
```

### How to Run Tests Locally

#### Prerequisites
Ensure that you have the following installed:
- **Java 17** or later
- **Maven**

#### Running Tests with Maven

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/Tsireledzo2/AI-Powered-Chatbot.git
   cd AI-Powered-Chatbot
``
  ###  How the CI/CD Pipeline Works
The project uses GitHub Actions to automate the Continuous Integration and Continuous Deployment (CI/CD) process. Here's a breakdown of how the CI/CD pipeline is set up:

#### CI Workflow
The CI workflow is triggered on:

Push events: This triggers the pipeline whenever code is pushed to any branch.

Pull request events: This triggers the pipeline when a pull request is made targeting the master branch.

Steps:
Checkout the code: The code from the repository is checked out to the runner.

Setup Java environment: The runner is configured to use Java 17.

Cache dependencies: Maven dependencies are cached to speed up the build process.

Build and run tests: The mvn clean verify command is executed to build the project and run the tests.

If all tests pass, the pipeline continues to the next stage.

CD Workflow
The CD workflow is triggered only when a commit is pushed to the master branch.

Steps:
Checkout the code: Similar to the CI step, the code is checked out.

Setup Java environment: The runner is set up with Java 17.

Build the JAR file: The application is packaged into a JAR file using Maven.

Create a version tag: A new version tag is created based on the current timestamp (e.g., v20230512153000).

Push the tag to GitHub: The tag is pushed to GitHub to mark the new release version.

Upload the JAR to GitHub Release: The generated JAR file is uploaded to GitHub Releases, making it available for download.





