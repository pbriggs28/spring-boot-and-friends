package com.prestonb.bootnfriends;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.prestonb.bootnfriends.conf.ApplicationProperties;

@Component
public class AppRunner implements ApplicationRunner {
	
	@Autowired private ApplicationProperties appProps;

	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		
		if(appProps.getDisableCsrf())
			System.out.println("Warning: CSRF is disabled.");
		
		int numRetries = appProps.getMaxNumRetries();
		for (int i = 0; i < numRetries; i++) {
			if(attemptRequest()) {
				System.out.println("Request successful");
				break;
			} else {
				System.out.println("Request failed...");				
			}
		}
	}
	
	
	private boolean attemptRequest() {
		return new Random().nextBoolean();
	}

}
