# Getting Started

### Build
	mvn clean install

### Configure
* Edit **grocery\src\main\resources\application.properties** to configure mysql

	spring.datasource.url=jdbc:mysql://rds-mysql-proj.c44bcpzlvser.us-west-1.rds.amazonaws.com:3306/grocery
	spring.datasource.username=username
	spring.datasource.password=password

### Database schema setup
* Load **grocery\src\main\resources\sql\groceryCreateTables.sql** to generate Grocery tables
* Load **grocery\src\main\resources\sql\grocerySampleData.sql** to generate Sample Grocery data

### Run server
	java -jar target/grocery-0.0.1-SNAPSHOT.jar

#### Get all products
	http://localhost:8080/product/all
	
#### Add a product
	http://localhost:8080/product/add
Request

	POST /product/add HTTP/1.1
	Host: localhost:8080
	Content-Type: application/json
	
	{
		"product_name":"Banana",
		"cat_id":2
	}
	
Respond

	Saved
	
### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.5/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#howto-use-exposing-spring-data-repositories-rest-endpoint)
