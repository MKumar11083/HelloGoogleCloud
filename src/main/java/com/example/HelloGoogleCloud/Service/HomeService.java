package com.example.HelloGoogleCloud.Service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
	public boolean validateUser(String usernme) {
        // in28minutes, dummy
        return !usernme.equalsIgnoreCase("");
                
    }
}
