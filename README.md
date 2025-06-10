Você pode testar todos os endpoints diretamente pelo Postman:

🔗 Acessar workspace no Postman

🌐 Endpoints Disponíveis
Listar todos os filmes:
GET https://sistemadevotacaodefilmes-1.onrender.com/filmes

Votar em um filme (por ID):
POST https://sistemadevotacaodefilmes-1.onrender.com/filmes/votacao

Envie no corpo da requisição o ID do filme e o identificador do usuário.

Ranking dos filmes mais votados:
GET https://sistemadevotacaodefilmes-1.onrender.com/filmes/votacao/ranking

🛠 Tecnologias Utilizadas
Java

Spring Boot

Spring Data JPA

Banco de dados relacional (ex: PostgreSQL ou H2)

Deploy via Render

📌 Funcionalidades
📋 Criação de enquetes de filmes

🗳 Votação (restrita a um voto por usuário)

📊 Visualização de ranking em tempo real
