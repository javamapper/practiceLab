# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.3.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.3.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.3.3.RELEASE/reference/htmlsingle/#using-boot-devtools)


  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.3.RELEASE)

2020-09-12 19:02:53.168  INFO 39604 --- [  restartedMain] com.javamapper.StartupApplication        : Starting StartupApplication on MacBook-Air.local with PID 39604 (/Users/anilkumar/git/repository/BootRunnerExample/target/classes started by anilkumar in /Users/anilkumar/git/repository/BootRunnerExample)
2020-09-12 19:02:53.176  INFO 39604 --- [  restartedMain] com.javamapper.StartupApplication        : No active profile set, falling back to default profiles: default
2020-09-12 19:02:53.364  INFO 39604 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2020-09-12 19:02:54.870  INFO 39604 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2020-09-12 19:02:54.912  INFO 39604 --- [  restartedMain] com.javamapper.StartupApplication        : Started StartupApplication in 2.677 seconds (JVM running for 4.184)
2020-09-12 19:02:54.916  INFO 39604 --- [  restartedMain] c.javamapper.runners.RunnerWithOrdered   : 	1)[ from CommandLineRunner -Ordered20-::[num1, num2, --name=Anil, --lastName=Kumar, num5, --spring.config.location=classpath:/config/changed-config.yml,classpath:/config/developer-config.yml]
2020-09-12 19:02:54.916  INFO 39604 --- [  restartedMain] com.javamapper.StartupApplication        :    2)[-----@------  From ApplicationRunner exec ----------]
2020-09-12 19:02:54.916  INFO 39604 --- [  restartedMain] com.javamapper.StartupApplication        : [num1, num2, --name=Anil, --lastName=Kumar, num5, --spring.config.location=classpath:/config/changed-config.yml,classpath:/config/developer-config.yml]
2020-09-12 19:02:54.916  INFO 39604 --- [  restartedMain] com.javamapper.StartupApplication        : non option args: [num1, num2, num5]
2020-09-12 19:02:54.916  INFO 39604 --- [  restartedMain] com.javamapper.StartupApplication        : option Names: [lastName, name, spring.config.location]
2020-09-12 19:02:54.917  INFO 39604 --- [  restartedMain] com.javamapper.StartupApplication        : args optionvalue for name: [Anil]
2020-09-12 19:02:54.917  INFO 39604 --- [  restartedMain] com.javamapper.StartupApplication        : args optionvalue for name: [Kumar]
2020-09-12 19:02:54.917  INFO 39604 --- [  restartedMain] com.javamapper.StartupApplication        :     [-----@-----  End ApplicationRunner exec ----------]
2020-09-12 19:02:54.917  INFO 39604 --- [  restartedMain] com.javamapper.StartupApplication        : 	3)[-----@----- from ApplicationRunner ------@Order30-------][org.springframework.boot.DefaultApplicationArguments@7b2f810f]
2020-09-12 19:02:54.917  INFO 39604 --- [  restartedMain] com.javamapper.runners.UserInputRunner   : 	4): from CommandLineRunner :: [num1, num2, --name=Anil, --lastName=Kumar, num5, --spring.config.location=classpath:/config/changed-config.yml,classpath:/config/developer-config.yml]
2020-09-12 19:02:54.917  INFO 39604 --- [  restartedMain] com.javamapper.StartupApplication        :    5)[-----@------ From CommandLineRunner ----------]
2020-09-12 19:02:54.917  INFO 39604 --- [  restartedMain] com.javamapper.StartupApplication        : [num1, num2, --name=Anil, --lastName=Kumar, num5, --spring.config.location=classpath:/config/changed-config.yml,classpath:/config/developer-config.yml]
2020-09-12 19:02:54.935  INFO 39604 --- [  restartedMain] com.javamapper.StartupApplication        : Customer [customerId=201, customerName=I5343, invoiceId=201I89773, orderId=O8989, orderDate=Sat Oct 03 16:20:30 IST 2020]
2020-09-12 19:02:54.936  INFO 39604 --- [  restartedMain] com.javamapper.StartupApplication        : EntityReader [developerId=102, developerName=Anil Kumar, belongingProject=Sales, isActive=false, developerGrade=A, entityNames=[Customer, Employee, Address, PaymentDetail, Payment], entityColumns={customer=cid,name,orderId,invoiceId,addressId, employee=eid,name,salary,deptId, address=addrId,addrDesc1,addrDesc2,pinCode,state,country}]
2020-09-12 19:02:54.936  INFO 39604 --- [  restartedMain] com.javamapper.StartupApplication        :     [-----@------ End CommandLineRunner ----------]
2020-09-12 19:02:54.939  INFO 39604 --- [  restartedMain] com.javamapper.StartupApplication        : RandomReader [stringValue=aee065b0f844584916930d60f04af31c, intValue=1253535971, longValue=7470874127727158402, intRangeValue=26, longRangeBtwinValue=545, uuidValue=f4da3851-c39d-40b9-a6c9-23c48277023f, intRangeBtwinValue=22]
2020-09-12 19:02:54.939  INFO 39604 --- [  restartedMain] com.javamapper.StartupApplication        : GlobalConst [email=solutionrunnerblog@gmail.com, devName=Anil Kumar]
2020-09-12 19:02:54.940  INFO 39604 --- [  restartedMain] com.javamapper.StartupApplication        : Developer [devName=Anil Kumar, devRating=8, experience=7, devSSOID=SSO50523, emailId=solutionrunnerblog@gmail.com, designation=Lead Eng., skills=ExprienceDetailLog [skillExpertice=Java, skills=[Skill [skillName=Java, lastUsedDate=10/03/2020T16:20:30:717 UTC+05:30, experienceInSkill=4, ratingInSkill=7, projectsUsedSkill=true, depthUsedSkillRating=6], Skill [skillName=React, lastUsedDate=10/03/2020T16:20:30:717 UTC+05:30, experienceInSkill=4, ratingInSkill=7, projectsUsedSkill=true, depthUsedSkillRating=7]], projectWithDetail={0=Project [projectName=Ctrix UI Solutions, skillNames=[Java, React, Docker, SpringBoot], teamSize=4, startDate=10/03/2016T16:20:30:717 UTC+05:30, endDate=10/03/2018T16:20:30:717 UTC+05:30], 1=Project [projectName=Toxit Org., skillNames=[Java, JavaScript, Kubernete, SpringBoot], teamSize=6, startDate=10/03/2016T16:20:30:717 UTC+05:30, endDate=10/03/2018T16:20:30:717 UTC+05:30]}]]
