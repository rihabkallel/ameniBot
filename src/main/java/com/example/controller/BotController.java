package com.example.controller;

import org.bots4j.wit.WitClient;
import org.bots4j.wit.beans.GetIntentViaTextResponse;
import org.bots4j.wit.beans.Outcome;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BotController {

	@RequestMapping(value = "/service", method = RequestMethod.GET)
	public void firstService() {
		System.out.print("aaaaa nku aa");
	}

	WitClient client = new WitClient("https://api.wit.ai", "736JTZE3ZHPMJS34N26R3SOMEUWZTTV5");

	String message1 = "I want to visit Porte de Brandebourg ";

	GetIntentViaTextResponse response = client.getIntentViaText(message1, null, null, null, null);

	// assertNotNull(response.getOutcomes());

	// Outcome outcome = response.getOutcomes().get(0);
	Outcome outcome = response.getOutcomes().get(0);
	
	

	@RequestMapping(value = "/outcome", method = RequestMethod.GET)
	public void sendMessageToInbox() {
		
		System.out.println("intent name : " + outcome.getIntent());
		System.out.println("text: " + outcome.getText());
		System.out.println("confidence: " + outcome.getConfidence());
	}

	// assertEquals("book-trip", outcome.getEntities().firstEntityValue("intent"));
	// assertEquals("paris", outcome.getEntities().firstEntityValue("location"));
}
