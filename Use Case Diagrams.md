# Use Case Diagram
## Screenshot in marmaid js
![image](https://github.com/user-attachments/assets/fb44c842-c8dd-4a0a-ac32-3578f476f954)

## Screenshot of use case 
![image](https://github.com/user-attachments/assets/a897e331-18e2-4d14-9d13-05980cdb1184)

## Use case pdf file
[Use case diagram.pdf](https://github.com/user-attachments/files/19275694/Use.case.diagram.pdf)

## marmaid js script
```%% UML Use Case Diagram in Mermaid.js
%% Chatbot System Use Case Diagram

%% Define actors and use cases
%% Use "-->" for associations between actors and use cases
%% Use "..>" for dependencies or external interactions

graph TD;
    %% Define actors
    EndUser[":End User"]
    Developer[":Developer"]
    ProjectManager[":Project Manager"]
    BusinessOwner[":Business Owner"]
    SecurityEngineer[":Security Engineer"]
    SysAdmin[":System Administrator"]
    
    %% Define use cases
    SendQuery["Send query to the chatbot"]
    ProcessQuery["Chatbot processes the query and gets relevant responses from DB"]
    ProcessResponse["Chatbot processes the response and sends it to the user"]
    StoreData["Chatbot stores data in the DB for query history"]
    DBRecord["DB record for improving query quality"]
    MaintainChatbot["Maintain the chatbot"]
    MonitorPerformance["Monitor system performance and user engagement"]
    AnalyzeUsage["Analyze chatbot usage and optimize strategies"]
    EnsurePrivacy["Ensure data privacy and compliance"]
    DeployInfrastructure["Deploy and maintain chatbot infrastructure"]
    
    %% Define external systems
    ExternalDB["External Databases/APIs"]
    InternalDB["Internal Chatbot Database"]
    
    %% Establish relationships
    EndUser --> SendQuery
    SendQuery --> ProcessQuery
    ProcessQuery --> ExternalDB
    ProcessQuery --> ProcessResponse
    ProcessResponse --> EndUser
    ProcessResponse --> DBRecord
    DBRecord --> InternalDB
    StoreData --> InternalDB
    EndUser --> StoreData
    
    Developer --> MaintainChatbot
    ProjectManager --> MonitorPerformance
    BusinessOwner --> AnalyzeUsage
    SecurityEngineer --> EnsurePrivacy
    SysAdmin --> DeployInfrastructure
```
