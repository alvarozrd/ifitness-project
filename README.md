# iFitness

API REST para cadastro e consulta de usuários de academia, desenvolvida com Java e Spring Boot.

## Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA
- H2 em memória

## Executar

Com o JDK 17 instalado, inicie a aplicação pelo Maven Wrapper:

```bash
./mvnw spring-boot:run
```

A API ficará disponível em `http://localhost:8080`.

## Endpoints

| Método | Caminho | Descrição |
|---|---|---|
| `GET` | `/api/users` | Lista os usuários |
| `GET` | `/api/users/{id}` | Consulta um usuário pelo identificador |
| `POST` | `/api/users` | Cadastra um usuário |

O banco H2 é temporário e reinicia com a aplicação.
