# NewsAPI
Spring Boot REST Service to obtain data from News API.
For now service enable to find all articles and top headliness from BBC news and conrains CRUD operations with users.
Application in progress.

Endpoints descriptions for users

| HTTP Method | URI |Description |
| --- | --- | --- |
| GET | `/users` | Get all users |
| POST | `/addUser` | Add new User |
| GET | `/user/id` | Get user by id|
| DELETE | `/delete/id` | Delete user|
| PUT | `/update` | Update user data|

Endpoints descriptions for news

| HTTP Method | URI |Description |
| --- | --- | --- |
| GET | `/showTop` | Get top headliness from BBC news|
| GET | `/showBBC` | Get all articles from BBC news|


## Technologies
Spring Boot 2.2+
MySQL
Maven
Docker
