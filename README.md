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
	
#### Create user	
	http://localhost:8080/user/create
Request

	POST /user/create HTTP/1.1
	Host: localhost:8080
	Content-Type: application/json
	Cache-Control: no-cache

	{
		"userName":"kim",
		"password_hash":"ku7ejjokolkdfja",
		"title":"manager"
	}

#### Get user
	http://localhost:8080/user/?name={name}

#### Add an inventory
	http://localhost:8080/inventory/add
Request

	POST /inventory/add HTTP/1.1
	Host: localhost:8080
	Content-Type: application/json
	Cache-Control: no-cache
	
    {
    	  "store_id": 1,
        "quantity": 130,
        "unit_price": 0.49,
        "expiration": "2021-12-02T07:00:00.000+00:00",
        "product": {
            "product_id": 4,
            "product_name": "Banana",
            "cat_id": 1
        }
    }
    
#### Get all inventory
	http://localhost:8080/inventory/all
	
### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.5/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#howto-use-exposing-spring-data-repositories-rest-endpoint)
