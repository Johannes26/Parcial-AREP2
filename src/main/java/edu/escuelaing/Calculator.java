package edu.escuelaing;

public class Calculator {

	public String Sin(String value) {
		Double number = Double.parseDouble(value);
		Double res = Math.sin(number);
		return ToJson("sin", number, res);
	}

	public String atan(String value) {
		Double number = Double.parseDouble(value);
		Double res = Math.atan(number);
		return ToJson("atan", number, res);
	}

	public String ToJson(String operacion, Double InputValue, Double OutputValue) {

		String jsonFormat = "{\"Operation\":\"%s\",\"input\":%f,\"output\":%f}";
		String json = String.format(jsonFormat, operacion, InputValue, OutputValue);
		return json;
	}

}