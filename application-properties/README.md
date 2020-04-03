####    1.应用程序属性支持我们在不同的环境中工作, 
            学习如何配置和指定Spring Boot应用程序的属性。

#####   1.命令行属性:

            java –jar <JARFILE> --server.port=9090

#####   2.属性文件

            1.application.properties文件位于src/main/resources目录中
            
            2.下面给出了示例application.properties:
                server.port = 9090
                spring.application.name = demoservice
          
#####   3.YAML文件

            1.Spring Boot支持基于YAML的属性配置来运行应用程序。代替application.properties，
                我们可以使用application.yml文件。
                
            2.下面给出了示例application.yml文件:
                spring:
                   application:
                      name: demoservice
                   server:
                port: 9090
                
#####   4.外在属性

            1.-Dspring.config.location=C:\application.properties
            
            2.下面给出了示例:
            
                java -jar -Dspring.config.location=C:\application.properties application-properties-0.0.1-SNAPSHOT.jar
        
#####   5.@Value注释的使用

            1.@Value批注用于读取Java代码中的环境或应用程序属性值。读取属性值的语法如下所示-
                @Value("${property_key_name}")
                
            2.请看以下示例，该示例显示了使用@Value批注读取Java变量中的spring.application.name属性值的语法。
                @Value("${spring.application.name}")
                
#####   6.Spring Boot基于Spring活动配置文件支持不同的属性。
            例如，我们可以保留两个单独的文件进行开发和生产，以运行Spring Boot应用程序。
            
            在application.properties中的Spring活动配置文件
            
            让我们了解如何在application.properties中具有Spring活动配置文件。默认情况下，应用程序。
            
            属性将用于运行Spring Boot应用程序。
            
            如果您想使用基于配置文件的属性，我们可以为每个配置文件保留单独的属性文件
            
                application.properties
                    server.port=8082
                    spring.application.name=demoservice
                    
                application-dev.properties
                    server.port = 9090
                    spring.application.name = demoservice
                    
                application-prod.properties
                    server.port = 4431
                    spring.application.name = demoservice
            java -jar application-properties-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
            
   #####    7.用于application.yml的Spring活动配置文件
              让我们了解如何使Spring保持application.yml的活动配置文件。
              
              我们可以将Spring活动配置文件属性保留在单个application.yml文件中。
              
              无需使用单独的文件，例如application.properties。
              
              以下是一个示例代码，用于将Spring活动配置文件保留在application.yml文件中。
              
              请注意，定界符（-）用于分隔application.yml文件中的每个配置文件。
              
                spring:
                  application:
                    name: demoservice
                server:
                  port: 8080
                
                ---
                spring:
                  profiles: dev
                  application:
                    name: demoservice
                server:
                  port: 9090
                
                ---
                spring:
                  profiles: prod
                  application:
                    name: demoservice
                server:
                  port: 4431