package com.javamapper.runners;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserInputRunner implements CommandLineRunner{
	 static final Logger logger = LoggerFactory.getLogger(UserInputRunner.class);
	@Override
	public void run(String... args) throws Exception {
		logger.info("	4): from CommandLineRunner :: "+Arrays.asList(args));
	}

}
