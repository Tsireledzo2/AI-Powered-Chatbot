# Rules Screenshots
![image](https://github.com/user-attachments/assets/c25fb319-79ee-4035-b81c-0d35bfbe25e3)
![image](https://github.com/user-attachments/assets/24ca3a99-315c-4987-b228-0606532a40b1)
![image](https://github.com/user-attachments/assets/698f4e1b-f78a-4e89-a50c-b8d222d7403c)
![image](https://github.com/user-attachments/assets/1e3dc742-5cf5-42c2-aca1-f5c6db419a4a)

# Purpose of Branch Protection Rules
Branch protection rules are critical for maintaining the integrity, stability, and quality of the main codebase in any collaborative software project. In this project, we have enforced protection on the main branch using the following settings:

###  Require Pull Request Reviews (at least 1)
Why it matters: This ensures that all changes are peer-reviewed before being merged into the main branch. It promotes collaboration, improves code quality, and helps identify bugs or design flaws early.

### Benefits:

- Encourages team accountability.

- Prevents unreviewed or risky code from being merged.

- Enhances knowledge sharing and collective code ownership.

### Require Status Checks to Pass (CI Workflow)
Why it matters: Status checks verify that the code passes all automated tests and adheres to the defined standards (e.g., unit tests, linting, formatting) before merging.

### Benefits:

- Reduces chances of introducing bugs or breaking the build.

- Provides confidence that the code is stable and production-ready.

- Supports Continuous Integration (CI) practices for faster, safer deployments.

### Disable Direct Pushes
Why it matters: Disabling direct pushes ensures that all changes go through pull requests (PRs), which can then be reviewed and tested.

### Benefits:

- Prevents accidental or unauthorized changes to the main branch.

- Enforces a structured workflow that improves traceability.

- Aligns with industry best practices for DevOps and secure software development.
