package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CapitalizeName {
	@PostMapping("/capitalize")
    public String createEmployee(@RequestBody Name name) {
        return "Hello " + name.getName().toUpperCase() ;
    }
	@GetMapping(value = "/")
	public String Welcome() {
		 return "Sidecar container 1\n";
	}
}

