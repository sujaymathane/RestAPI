# RestAPI

### Spring Data JPA, Spring web,validation,Spring Boot DevTools,My Sql Driver,Lombok
###   <dependency>
			<groupId>org.modelmapper</groupId>
			<artifactId>modelmapper</artifactId>
			<version>3.1.0</version>
		</dependency>
		<!-- Swagger UI -->
		<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-ui</artifactId>
			<version>1.6.4</version>
		</dependency>
    
    
    
#Tomcat server port number 8080
#server.port=7070
#context path default value : empty
#server.servlet.context-path=/day9_lab
#DB properties
spring.datasource.url=jdbc:mysql://localhost:3306/IacsdModuleEnd?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=password
# JPA properties
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update
#spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
#logging.level.org.springframework.orm.hibernate5=DEBUG

# Spring MVC ViewResolver related
#spring.mvc.view.prefix=/WEB-INF/views
#spring.mvc.view.suffix=.jsp
#Disable open session in view 
#spring.jpa.open-in-view=false
#property to disable hibernateLazyInitializer during initialized proxies
#spring.jackson.serialization.FAIL_ON_EMPTY_BEANS=false


