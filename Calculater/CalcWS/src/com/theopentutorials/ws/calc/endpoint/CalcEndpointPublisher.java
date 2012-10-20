package com.theopentutorials.ws.calc.endpoint;

import javax.xml.ws.Endpoint;

import com.theopentutorials.ws.calc.Calculator;

public class CalcEndpointPublisher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/CalcWS/Calculator", new Calculator());

	}

}
