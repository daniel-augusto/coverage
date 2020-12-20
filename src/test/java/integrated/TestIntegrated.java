package integrated;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

public class TestIntegrated {

	@Test
	public void flowNullParam() {

		given() 
			.port(4567) 
		.when() 
			.get("/") 
		.then()
			.statusCode(200);
	}

	@Test
	public void flowEmptyParam() {

		given() 
			.port(4567) 
		.when() 
			.queryParam("name", "") 
		.get("/") 
		.then() 
			.statusCode(200);
	}

	@Test
	public void flowAParam() {

		given() 
			.port(4567) 
		.when() 
			.queryParam("name", "A") 
		.get("/") 
		.then()
			.statusCode(200);
	}

	@Test
	public void flowBParam() {

		given() 
			.port(4567) 
		.when() 
			.queryParam("name", "B")
		.get("/") 
		.then() 
			.statusCode(200);
	}
	
}
