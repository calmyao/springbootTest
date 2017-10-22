# springbootTest
## springboot入门
- springboot简化了基于Spring的应用开发,只需要"run"就能创建一个独立的,生产级别的Spring应用,springboot为Spring平台及第三方库提供开箱即用
的设置（提供默认设置），这样我们就可以简单的开始。多数Spring Boot应用只需要很少的Spring配置。
- 我们可以使用SpringBoot创建java应用，并使用java –jar 启动它，或者采用传统的war部署方式。
- Spring Boot 主要目标是：
  * 为所有 Spring 的开发提供一个从根本上更快的入门体验
  * 开箱即用，但通过自己设置参数，即可快速摆脱这种方式。  
  * 提供了一些大型项目中常见的非功能性特性，如内嵌服务器、安全、指标，健康检测、外部化配置等
  * 绝对没有代码生成，也无需 XML 配置。
## 入门详解
 - 父工程版本控制
 
    	<parent>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-parent</artifactId>
         <version>1.4.4.RELEASE</version>
	    </parent>
 - springboot依赖
 
       <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
       </dependency>
     
 - springboot启动成功后会出现一个spring的标志,如果不需要这个标志我们可以取消
 
           .   ____          _            __ _ _
         /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
        ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
         \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
          '  |____| .__|_| |_|_| |_\__, | / / / /
         =========|_|==============|___/=/_/_/_/
         :: Spring Boot ::        (v1.4.4.RELEASE)
   
       SpringApplication application = new SpringApplication(Application.class);
       //取消spring的标志
       application.setBannerMode(Mode.OFF);
       application.run(args);
      
     
 - springboot自动热部署
 
   由于Spring Boot应用只是普通的Java应用，所以JVM热交换（hot-swapping）也能开箱即用。不过JVM热交换能替换的字节码有限制，想要更彻底的解决方案可以使用   Spring Loaded项目或JRebel。 spring-boot-devtools 模块也支持应用快速重启(restart)。
       
       <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
       </dependency>
  
欢迎加本人QQ(1209211943),来讨论java相关技术学习
