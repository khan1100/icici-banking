package com.icici.endpoint;

import javax.xml.ws.Endpoint;

import com.icici.ws.IBankImpl;

/**
 * This is the publisher class to deploy the service on the server
 * 
 * @author arifk2
 *
 */
public class BankPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/bank", new IBankImpl());
		System.out.println("Running on Server Sucessfully..");
	}
}
