# Social Media Application

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=mongodb&logoColor=white)

## Descrição

Esta é uma aplicação de mídia social na qual um usuário pode criar postagens e outros usuários podem comentar nas postagens. O projeto foi construído usando **Java** com o **Spring Boot** e o **MongoDB** como banco de dados.

## Funcionalidades

- Criação de usuários
- Criação de postagens
- Adição de comentários nas postagens
- Pesquisa de postagens por título e texto
- Pesquisa de postagens com filtro por data

## Pré-requisitos

Antes de começar, certifique-se de ter o seguinte instalado:

- [Java 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [MongoDB](https://docs.mongodb.com/manual/installation/)

## Instalação

1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    cd seu-repositorio
    ```

2. Configure o MongoDB:
    - Certifique-se de que o MongoDB está rodando na `localhost:27017`
    - Ou modifique a URI no `application.properties`:
      ```properties
      spring.data.mongodb.uri=mongodb://localhost:27017/spring-boot-mongodb
      ```

3. Compile e execute a aplicação:
    ```bash
    mvn spring-boot:run
    ```

## Uso

### Endpoints

#### Usuários

- **GET /users**: Lista todos os usuários
- **GET /users/{id}**: Busca um usuário pelo ID
- **POST /users**: Cria um novo usuário
- **DELETE /users/{id}**: Remove um usuário pelo ID
- **PUT /users/{id}**: Atualiza os dados de um usuário
- **GET /users/{id}/posts**: Lista todas as postagens de um usuário

#### Postagens

- **GET /posts/{id}**: Busca uma postagem pelo ID
- **GET /posts/titlesearch?text=**: Busca postagens por título
- **GET /posts/searchtitle?text=**: Pesquisa postagens pelo texto
- **GET /posts/fullsearch

#### Criar uma postagem
```
curl -X POST "http://localhost:8080/posts" -H "Content-Type: application/json" -d '{
  "date": "2023-07-07T10:00:00Z",
  "title": "My First Post",
  "body": "This is the content of the post.",
  "author": {
    "id": "user123",
    "name": "John Doe"
  }
}'
```
### Contribuindo
Faça um fork do projeto.
Crie uma nova branch: git checkout -b minha-nova-funcionalidade
Faça suas alterações e commit: git commit -m 'Adiciona nova funcionalidade'
Envie para o branch: git push origin minha-nova-funcionalidade
Abra um Pull Request


