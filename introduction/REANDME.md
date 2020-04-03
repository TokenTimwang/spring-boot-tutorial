## `1.实现本章将向您介绍如何在Spring Boot应用程序上执行引导`

## `2.主要方法应该是编写Spring Boot Application类。`

#####    此类应使用@SpringBootApplication进行注释。
    
#####    这是要启动的Spring Boot应用程序的入口点。
    
#####    您可以使用默认包在src / java / main目录下找到主类文件。
    
## `3.要在Spring Boot Application主类文件本身中编写一个简单的Hello World Rest Endpoint`

### 请按照以下步骤操作-

##### 首先，在类顶部添加@RestController批注。
  
##### 现在，编写带有@RequestMapping批注的Request URI方法。
  
#####  然后，Request URI方法应返回Hello World字符串。
  
## 4.创建一个可执行的JAR

##### 1.使用Maven命令mvn clean install 或者
  
#####  2.使用Gradle命令gradle clean构建
  
#####  3.在命令提示符下看到BUILD SUCCESSFUL消息
  
## 5.使用Java运行Hello World

##### 1.创建可执行的JAR文件后，可以在以下目录下找到它
  
##### 2.Gradle，您可以在build / libs目录下找到JAR文件
  
##### 3.使用命令java –jar <JARFILE>运行JAR文件。
  
##### 4.查看控制台，Tomcat在默认端口8080（http）上启动。
  
##### 5.现在，转到Web浏览器，然后单击URL [http://localhost:8080/], 您可以看到如下所示的输出-

