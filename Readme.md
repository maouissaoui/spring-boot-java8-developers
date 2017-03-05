API REST (CRUD Developer, CRUD language) with Maven, Spring Boot, Java 8

Running

To build and start the server simply type

$ mvn spring-boot:run  


Using

You can see what urls are available using curl:

$ curl localhost:8086


List of developers:


$ curl localhost:8086/developers


Create a developer: can create new ones using a POST:


$ curl -i -X POST -H "Content-Type:application/json" -d '{ "firstname" : "moufida", "lastname" : "aouissaoui", "email" : "moufida.a.job@gmail.com" }' localhost:8086/developers


List of languages

$ curl http://localhost:8086/languages

and can create new ones using a POST:


$ curl -i -X POST -H "Content-Type:application/json" -d '{ "name" : "java 8", "niveauCompetence" : "very good" }' localhost:8086/languages


