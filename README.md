# INSTRUCTION

Edit the application.properties except /billing_db
## Under src/main/resources
```bash
spring.data.mongodb.uri = mongodb+srv://admin:admin@cluster0.mbqyl.mongodb.net/billing_db
```

## Change the package name for:
```bash
 com.teamf4.springbootmongodb
 ```

 # RUNNING

run first the springboot to initialize localhost of 8080,

## under src/main/com.teamf4/springbootmongodb/controller
```java
@CrossOrigin(origins = "http://localhost:8081")
```
the localhost 8081 should be the same to front end localhost

# If create new java package
add this to your pom.xml this depedency

```xml
        <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-mongodb</artifactId>
		</dependency>
```

under this depedency
```xml
        <dependency>
			<groupId>org.testcontainers</groupId>
			<artifactId>mongodb</artifactId>
			<scope>test</scope>
		</dependency>
```
