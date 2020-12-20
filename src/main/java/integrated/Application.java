package integrated;

import static spark.Spark.get;

public class Application {

	public static void main(String[] args) {

		get("/", (request, response) -> {

			String value = request.queryParams("name");

			if (value == null) {
				System.out.println("null");
			} else if (value.equals("A")) {
				System.out.println("A");
			} else if (value.equals("B")) {
				System.out.println("B");
			} else {
				System.out.println("else");
			}

			return "Hello: " + value;
		});

	}

}
