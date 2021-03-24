package edu.escuelaing;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class SparkWebApp {
	public static void main(String[] args) {
		port(getPort());

		Calculator c = new Calculator();
		get("/sin", (req, res) -> {
			res.status(200);
			res.type("application/json");
			String value = req.queryParamsValues("value")[0];
			return c.Sin(value);
		});
		
		get("/atan", (req, res) -> {
			res.status(200);
			res.type("application/json");
			String value = req.queryParamsValues("value")[0];
			return c.atan(value);
		});
	}

	private static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 2000;
	}
}
