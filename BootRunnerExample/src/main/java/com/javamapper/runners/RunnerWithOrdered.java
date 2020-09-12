package com.javamapper.runners;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class RunnerWithOrdered implements CommandLineRunner,Ordered{
	 static final Logger logger = LoggerFactory.getLogger(RunnerWithOrdered.class);
	@Override
	public int getOrder() {
		return 20;
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("	1)[ from CommandLineRunner -Ordered20-::"+Arrays.asList(args));
	}

}
