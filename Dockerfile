FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN chmod +x mvnw && ./mvnw clean install -DskipTests

CMD ["java", "-jar", "target/sistema-de-votacao-de-filmes-0.0.1-SNAPSHOT.jar"]

