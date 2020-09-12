package com.javamapper;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import com.javamapper.entity.Customer;
import com.javamapper.entity.Developer;
import com.javamapper.entity.GlobalConst;
import com.javamapper.runners.EntityReader;
import com.javamapper.runners.RandomReader;
@SpringBootApplication
public class StartupApplication {
	 static final Logger logger = LoggerFactory.getLogger(StartupApplication.class);
	public static void main(String[] args) {
		logger.info("--- StartupApplication running  ---");
		// --spring.config.location=classpath:/config/changed-config.yml,classpath:/config/developer-config.yml
			ConfigurableApplicationContext context = new SpringApplicationBuilder(StartupApplication.class) 
		/*		.properties("spring.config.location=classpath:/config/changed-config.yml,classpath:/config/developer-config.yml")
				.build()*/
				.run(args);
			
		RandomReader randomReader = context.getBean(RandomReader.class);
		logger.info(randomReader+"");
		GlobalConst globalConst = context.getBean(GlobalConst.class);
		logger.info(""+globalConst);
		Developer developer=context.getBean(Developer.class);
		logger.info(""+developer);
	}
	@Bean
	public CommandLineRunner getRunner() {
		return args->{
			logger.info("   5)[-----@------ From CommandLineRunner ----------]");
			logger.info(""+Arrays.asList(args));
			Customer customerConstantValue = getCustomerConstantValue();
			logger.info(""+customerConstantValue);
			EntityReader entityReader = getEntityReader();
			logger.info(""+entityReader);
			logger.info("    [-----@------ End CommandLineRunner ----------]");
		};
	}
	
	@Bean
	public ApplicationRunner getApplicationRunner() {
		return args->{
			logger.info("   2)[-----@------  From ApplicationRunner exec ----------]");
			logger.info(""+Arrays.asList(args.getSourceArgs()));
			logger.info("non option args: "+args.getNonOptionArgs());
			logger.info("option Names: "+args.getOptionNames());
			logger.info("args optionvalue for name: "+args.getOptionValues("name"));
			logger.info("args optionvalue for name: "+args.getOptionValues("lastName"));
			logger.info("    [-----@-----  End ApplicationRunner exec ----------]");
		};
	}
	
	@Bean
	@Order(30)
	public ApplicationRunner getOrderedRunnerOne() {
		return args->{
			logger.info("	3)[-----@----- from ApplicationRunner ------@Order30-------]"+Arrays.asList(args));
		};
	}
	
	@Bean
	public Customer getCustomerConstantValue() {
		return new Customer();
	}
	@Bean
	public EntityReader getEntityReader() {
		return new EntityReader();
	}
}
