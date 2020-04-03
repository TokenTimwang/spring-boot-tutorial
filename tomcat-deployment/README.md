##### 1.传统的部署方式是使Spring Boot Application 

##### 2.@SpringBootApplication类扩展SpringBootServletInitializer类。

##### 3.Spring Boot Servlet Initializer类文件允许您使用Servlet容器在启动应用程序时对其进行配置。

##### 4.mvn package 或者 gradle clean build

##### 5.运行Tomcat服务器，并将WAR文件部署在webapps目录下

##### 6.http://localhost:8080/tomcat-deployment-0.0.1-SNAPSHOT/  tomcat-deployment-0.0.1-SNAPSHOT:表示jar包名字