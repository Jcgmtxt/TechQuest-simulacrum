# TechQuest Platform

## Context

TechQuest is building a modern and secure platform to manage missions and training for students (heroes in training). Teachers can assign missions and skills to students based on their progress, while students participate in missions and view their assigned skills. The platform must be secure, role-based, and provide a transparent audit trail.

## Objective

Develop a system to manage students, teachers, missions, and special skills securely and efficiently. The system must include:
- JWT-based authentication and role management (ADMIN, TEACHER, STUDENT).
- Automatic auditing of key actions.
- Robust exception handling.
- Mission difficulty levels (EASY, MEDIUM, HARD).

Optional features include:
- Granular permissions.
- Multi-database support.
- Integration with an external API for file storage (e.g., Cloudinary, Amazon S3).

## Key Features

1. **Roles and Authentication**  
   - JWT authentication with roles:
     - **ADMIN**: Manages the system (users, missions, skills).
     - **TEACHER**: Manages their own classes, missions, and students.
     - **STUDENT**: Views their own missions and skills.
   
2. **Skill and Mission Management**  
   - Teachers assign skills to students and create missions categorized by difficulty.
   - Students can only participate in missions if they possess the necessary skills.

3. **Automatic Auditing**  
   - Tracks user actions (create, modify, delete) for missions, students, and skills using Spring Data JPA auditing.

4. **Exception Handling**  
   - Handles common errors, including unauthorized access, resource not found, and validation issues via `@ControllerAdvice`.

5. **Mission Difficulty Levels**  
   - Missions are classified by difficulty. Students must have the required skills to attempt higher difficulty missions.

6. **Swagger Documentation**  
   - API endpoints are documented using Swagger for easy testing and consultation.

7. **Deployment**  
   - Deployable on free services like Railway or Render.

## Optional Features

- **Multi-Database Support**: Supports both MySQL and PostgreSQL with Spring profiles.
- **Granular Permissions**: Role-based permissions for specific actions like creating missions or assigning skills.
- **File Storage Integration**: External API for multimedia storage (e.g., Cloudinary, Amazon S3).

## Endpoints

1. **Authentication**  
   - `POST /api/v1/auth/login`: Authenticates users and returns a JWT.

2. **Assign Skills to Students**  
   - `POST /api/v1/students/{id}/abilities`: Assigns skills to students.

3. **Create and Assign Missions**  
   - `POST /api/v1/missions`: Creates missions and assigns them to students with required skills.

4. **Evaluate Mission Performance**  
   - `PATCH /api/v1/missions/{id}/evaluate`: Evaluates student performance on missions.

## Setup Instructions

1. Clone the repository.
2. Set up the database:
   - Configure profiles for MySQL or PostgreSQL.
3. Add environment variables for sensitive data (JWT secrets, API keys).
4. Use Swagger (`/swagger-ui.html`) for API testing.

## Deliverables

- Public GitHub repository with source code, branches, and pull requests.
- Compressed zip file with final code, Swagger documentation, and configuration details.
- Detailed instructions for setup and running the application, including database configuration and external file storage integration.
