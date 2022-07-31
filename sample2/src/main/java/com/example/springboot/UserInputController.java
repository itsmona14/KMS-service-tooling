package com.example.springboot;

import org.springframework.http.HttpHeaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserInputController {
	@Autowired
	RestTemplate restTemplate;
	@GetMapping(value = "/{name}")
	public String getData(@PathVariable Name name) {
		String url1 = "http://localhost:8085/capitalize";
		String url2 = "http://localhost:8090/camel";
		Name n = name;
		String response1 = new RestTemplate().postForObject(url1,n,String.class);
		String response2 = new RestTemplate().postForObject(url2,n,String.class);
		return "Hello " + name.getName() + "\n" +  response1 + "\n" + response2;
	}
	@GetMapping(value = "/")
	public String Welcome() {
		String url1 = "http://localhost:8085/";
		String url2 = "http://localhost:8090/";
		ResponseEntity<String> response1 = new RestTemplate().exchange(url1,HttpMethod.GET, getHeaders(),String.class);
		ResponseEntity<String> response2 = new RestTemplate().exchange(url2,HttpMethod.GET, getHeaders(),String.class);
		return "Main-container\n" + response1.getBody().toString() + response2.getBody().toString();
	}
	private static HttpEntity<?> getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept",MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
}
