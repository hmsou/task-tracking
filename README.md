## Task Management Application
### Overview
A Task Management Application designed to help users organize their
responsibilities efficiently. This system allows users to create, manage, and track
tasks and task lists, ensuring optimal productivity and organization.

### Features
#### Task
A task is a specific action item or to-do that a user wants to complete. Each task 
includes:
- Title (required)
- Description (optional)
- Due Date
- Priority Level

#### Task List
A task list is a collection of related tasks, grouped together for better 
organization. For example, task lists can include "Work Tasks", "Personal Errands", 
or "Project X".

## Technologies Used
- Java 21
- Spring Boot
- PostgreSQL
- Docker
- JUnit
#
### API Endpoints
`TaskList` Endpoints
- Get all task lists:
> `GET /task-lists`
- Get task list by ID
> `GET /task-lists/{task_list_id}`
- Create task list
> `POST /task-lists`
- Update task list
> `PUT /task-lists/{task_list_id}`
- Delete task list
> `DELETE /task-lists/{task_list_id}`
#
`Task` Endpoints
- Get all tasks:
> `GET /task-lists/{task_list_id}/tasks`
- Get task by ID
> `GET /task-lists/{task_list_id}/tasks/{task_list_id}`
- Create task
> `POST /task-lists/{task_list_id}/tasks`
- Update task
> `PUT /task-lists/{task_list_id}/tasks/{task_list_id}`
- Delete task
> `DELETE /task-lists/{task_list_id}/tasks/{task_list_id}`
