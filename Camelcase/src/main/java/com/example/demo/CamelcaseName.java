package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CamelcaseName {
	//@RequestMapping(value = "/submit/{name}", method = RequestMethod.POST, consumes= "application/json")
	@PostMapping("/camel")
	public String getData(@RequestBody Name name) {
		String n = name.getName();
		String[] words = n.split("[\\W_]+");
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
		    String word = words[i];
		    if (i == 0) {
		        word = word.isEmpty() ? word : word.toLowerCase();
		    } else {
		        word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();      
		    }
		    builder.append(word);
		}
		return "Hello " + builder.toString() ;
	}
	@GetMapping(value = "/")
	public String Welcome() {
		 return "Sidecar container 2\n";
	}
}

