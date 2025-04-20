# Challenges Faced
Designing the domain model for the chatbot system posed several abstraction challenges. Initially, it was difficult to decide whether to combine chatbot logic, NLP, and conversation history into a single monolithic entity or modularize them. The decision to separate concerns into Chatbot, NLPModel, and ChatbotSession allowed us to better align with the Single Responsibility Principle and keep the system scalable.

Modeling Intent and ResponsePattern also required iteration. While use cases helped identify that intents are classified and responses are generated, translating that into actionable object-oriented entities required some refinement. Ensuring that methods and attributes didn't overlap unnecessarily across these entities took a few cycles of rethinking.

# Alignment with Prior Work
This class diagram is directly aligned with use cases from Assignment 5 such as “Send Message,” “Get Response,” and “Train Chatbot.” Each use case maps cleanly to a method in one or more classes. For example, “Train Chatbot” relates to the trainModel() method in NLPModel, and “Get Response” involves predictIntent() and generateResponse().

The class diagram also reinforces state transitions identified in Assignment 8 — such as session states (Idle → Active → Ended), which are encapsulated in the ChatbotSession entity. Similarly, message exchanges follow the flow identified in activity diagrams, and class relationships reflect the interaction flows described in Agile stories (Assignment 6).

# Trade-Offs
A key trade-off was avoiding inheritance in favor of associations and composition. For example, instead of creating subclasses of Message for user and bot messages, we used a senderType enum. This reduces class count and simplifies the model while preserving necessary context. Another trade-off was keeping ChatbotSession relatively lightweight in functionality; heavier features like analytics were postponed for a later sprint to focus on the MVP.

# Lessons Learned
This process emphasized the importance of modularity and traceability in object-oriented design. By sticking to Agile artifacts as guiding references, the model remained relevant to actual system goals. It also highlighted the value of separating behavior from data structure — especially when designing for adaptability, as in the case of the NLPModel and its evolving responsibilities.

I learned that the class diagram not only serves as a design artifact but also as a communication tool — helping developers, stakeholders, and testers align on the system’s architecture. The clarity and maintainability of the system are directly influenced by the quality of this diagram.
