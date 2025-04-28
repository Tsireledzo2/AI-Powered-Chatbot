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

## Justification of  generic repository interface
# Repositories Design

We used a generic `Repository<T, ID>` interface to define standard CRUD operations (Create, Read, Update, Delete).  
This avoids duplication across different entity repositories , and promotes code reuse and consistency. 

Each entity-specific repository extends the generic repository, specifying the entity type and its ID type.


