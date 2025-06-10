Você pode testar todos os endpoints diretamente pelo Postman:

 Acessar workspace no Postman: https://www.postman.com/italokelmy/workspace/apifilm/request/44774411-5221e837-29ac-4652-b692-afe80011a04b?action=share&creator=44774411&ctx=documentation

 Endpoints Disponíveis
Listar todos os filmes:
GET https://sistemadevotacaodefilmes-1.onrender.com/filmes

Votar em um filme (por ID):
POST https://sistemadevotacaodefilmes-1.onrender.com/filmes/votacao

Envie no corpo da requisição o ID do filme e o identificador do usuário.

Ranking dos filmes mais votados:
GET https://sistemadevotacaodefilmes-1.onrender.com/filmes/votacao/ranking

 Tecnologias Utilizadas
 
Java
Spring Boot
Spring Data JPA


Deploy via Render

 Funcionalidades
 Criação de enquetes de filmes

 Votação (restrita a um voto por usuário)

 Visualização de ranking em tempo real
