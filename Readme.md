Running

To build and start the server simply type

$ mvn spring-boot:run  
or 
$ mvn clean package
$ java -jar target/spring-boot-java8-developers-0.0.1-SNAPSHOT.jar


Using

You can see what urls are available using curl:

$ curl localhost:8067


You can view existing developers objects using a similar request:

$ curl localhost:8067/developers


and can create new ones using a POST:


$ curl -i -X POST -H "Content-Type:application/json" -d '{ "firstname" : "moufida", "lastname" : "aouissaoui", "email" : "moufida.a.job@gmail.com" }' localhost:8067/developers


You can view existing languages objects using a similar request:

$ curl http://localhost:8067/languages


and can create new ones using a POST:


$ curl -i -X POST -H "Content-Type:application/json" -d '{ "name" : "java 8", "niveauCompetence" : "verry good" }' localhost:8067/languages


