# practiceLab

[project-SpringBoot]

CommandLineRunner -:
* 1) RunnnerWIthOrdered class implements CommandLineRunner, Ordered interface. 
* 5) @Bean CommandLineRunner in StartupApplication.java mapped command line parameter.

ApplicationRunner -: 
* 2) @Bean ApplicationRunner in StartupApplication.java giving option to collect all command parameter in NonOptionArgs and OptionValue bag.
* 3) @Bean & @Ordered ApplicationRunner in StartupApplication.java priorities order of execution defined.  
* 4) UserInputRunner class implements CommandLineRunner interface.  

To run application, I am passing below parameter : 

Program Arguments: 

num1 num2 --name=Anil --lastName=Kumar num5 --spring.config.location=classpath:/config/changed-config.yml,classpath:/config/developer-config.yml

You will get output result in HELP.md file.