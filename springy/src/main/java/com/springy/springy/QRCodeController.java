package com.springy.springy;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QRCodeController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	private String clientFirstName, clientCode, clientLastName, clientOrganization, clientUrl;
	
	@GetMapping("/registerclient")
	public QRCodeObject qrCodeObject(@RequestParam(value="clientName", defaultValue = "Please supply a client name") String clientName) {
		retrieveNames(clientName);
		return new QRCodeObject(clientFirstName, clientCode, clientLastName, clientOrganization, clientUrl, counter.incrementAndGet());
	}
	
	@GetMapping("/")
	public String frontPage() {
		return "Welcome to QRCode. What is your name?";
	}

	private void retrieveNames(String clientName) {
		Scanner scan = new Scanner("clientRegister");
		while(scan.hasNextLine()) {
			String name = scan.nextLine();
			String[] client = name.split("|");
			if(client[0].equalsIgnoreCase(clientName) || client[1].equalsIgnoreCase(clientName)) {
				clientFirstName = client[0];
				clientLastName = client[2];
				clientCode = client[1];
				clientOrganization = client[3];
				clientUrl = client[4];
			}
		}
		
	}
	
	
	
	
}
