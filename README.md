# NewsAPI
Spring Boot REST Service to obtain data from News API.
For now service enable to find all articles and top headlines from BBC news and contains CRUD operations for users.
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
* Spring Boot 2.2+
* MySQL
* Spring data jpa for persistence
* Maven
* Docker

### Build application with Docker
This version is available on  branch 'dockerized '

1. Create a network for two containers to properly communicate between them
```
docker network create news_mysql_db
```
2. Create container for MySQL
```
docker run --name mysql_database --network news_mysql_db -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=demo -d mysql:8
```
3. Package project(under application.properties update -> spring.datasource.url), Build the project
```
mvn clean package -DskipTests
```
4. Create Image from Dockerfile 
```
docker image build -t news-image .
```
5. List images 
```
docker images
```
7. Create container
```
docker container run -d --name news-container --network news_mysql_db -p 8080:8080 news-image
```
8. List current running containers
```
docker ps -a
```

