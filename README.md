# Fix My Campus

## Project Overview

Fix My Campus is a web-based application designed to help students and staff report issues around their college campus.

The application aims to improve communication between students and campus maintenance or IT teams by providing a central place to report, manage and track issues.

Examples of issues include broken equipment, damaged facilities, IT problems and general maintenance requests.

## Project Objectives

- Allow students and staff to report campus-related issues.
- Provide a way to track the progress of submitted reports.
- Help maintenance and IT staff manage reported problems.
- Improve communication between students and campus services.
- Make reporting and resolving campus issues more organised and efficient.

## Team Members and Roles

| Team Member | Role | Responsibilities |
|---|---|---|
| Alex | Scrum Master | Organises sprint meetings, tracks progress and helps the team follow Agile practices. |
| Oisin | Product Owner | Manages the product backlog, prioritises features and ensures the application meets user needs. |
| Valentyn | DevOps / Tester | Supports development setup, testing, GitHub workflows and application deployment. |

All team members contribute to planning, development, testing and documentation.

## Main Features

The planned application will include:

- **Issue Reporting:** Users can submit reports about problems on campus.
- **Issue Categories:** Reports can be organised into categories such as IT, maintenance and facilities.
- **Issue Tracking:** Users can view the status of submitted issues.
- **Staff Dashboard:** Maintenance and IT staff can view and manage reports.
- **Status Updates:** Staff can update reports as issues are being addressed.

## Project Structure

```text
Fix-My-Campus/
├── .github/
│   └── workflows/
├── src/
├── tests/
├── docs/
├── .gitignore
└── README.md
```

- **.github/workflows/** – GitHub Actions for automated builds and testing.
- **src/** – Application source code.
- **tests/** – Unit, integration and other project tests.
- **docs/** – Project documentation, including planning, architecture, release plans, risk registers and design materials.
- **.gitignore** – Files and folders excluded from Git tracking.
- **README.md** – Project overview and repository information.

## Development Workflow

The project follows an Agile development approach using Scrum.

1. Tasks and user stories are organised and tracked using Jira.
2. Each team member works on their own GitHub branch.
3. Changes are committed and pushed to GitHub.
4. Pull requests are created when work is ready for review.
5. Another team member reviews the pull request.
6. Changes are merged into the `main` branch after approval and successful testing.

The `main` branch will be protected to help prevent unreviewed changes.

## Coding Standards

To keep the project consistent and easy to maintain, the team will follow these standards:

- Use clear and meaningful names for variables, functions and files.
- Maintain consistent formatting and indentation.
- Keep code organised and readable.
- Add comments where necessary to explain complex sections.
- Test new functionality before merging changes.
- Use descriptive Git commit messages.
- Avoid committing passwords, API keys or other sensitive information.

## Project Management

The team uses the following tools:

- **Jira:** Sprint planning, user stories and task tracking.
- **GitHub:** Version control, collaboration and code reviews.
- **Microsoft OneNote:** Team meetings, decisions and assignment documentation.
- **Microsoft Project:** Project scheduling and milestones.

## Project Status

Fix My Campus is currently in the release planning and development preparation stage.

The team is preparing the development environment, GitHub repository, testing approach and release schedule before beginning full application development.

## Future Development

Planned development includes implementing the main application features, testing functionality, improving the user interface and preparing the final release.
