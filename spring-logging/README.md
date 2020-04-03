#####  控制台日志输出

    默认日志消息将打印到控制台窗口。默认情况下，“ INFO”，“ ERROR”和“ WARN”日志消息将打印在日志文件中。
    如果必须启用调试级别日志，请使用以下所示的命令在启动应用程序时添加调试标志-

        java –jar demo.jar --debug
    您还可以将调试模式添加到application.properties文件，如下所示：
        debug = true
        
#####   文件日志输出
#####   默认情况下，所有日志将打印在控制台窗口上，而不是文件中。
#####   如果要将日志打印到文件中，则需要在application.properties文件中设置属性logging.file或logging.path。
#####   您可以使用下面显示的属性指定日志文件路径。请注意，日志文件名为spring.log。

        logging.path = /var/tmp/
        
#####   您可以使用下面显示的属性指定自己的日志文件名-

            logging.file = /var/tmp/mylog.log
            注意 -文件大小达到10 MB后将自动旋转。

#####   日志级别

            Spring Boot支持所有记录器级别，
            
            例如“ TRACE”，“ DEBUG”，“ INFO”，“ WARN”，“ ERROR”，“ FATAL”，“ OFF”。
            
            您可以在application.properties文件中定义Root logger，如下所示-

            logging.level.root = WARN
            注 – Logback不支持“ FATAL”级别的日志。它映射到“错误”级别的日志。

#####   配置登录

            Logback支持基于XML的配置以处理Spring Boot Log配置。
            日志记录配置详细信息在logback.xml文件中配置。logback.xml文件应放在类路径下。

#####   您可以使用下面给出的代码在Logback.xml文件中配置ROOT级别日志-
    
            <?xml version = "1.0" encoding = "UTF-8"?>
            <configuration>
               <root level = "INFO">
               </root>
            </configuration>
            
#####   您可以在下面给出的Logback.xml文件中配置控制台附加程序。
        
            <?xml version = "1.0" encoding = "UTF-8"?>
            <configuration>
               <appender name = "STDOUT" class = "ch.qos.logback.core.ConsoleAppender"></appender>
               <root level = "INFO">
                  <appender-ref ref = "STDOUT"/> 
               </root>
            </configuration>
        
#####   您可以使用下面给出的代码在Logback.xml文件中配置文件追加器。
        请注意，您需要在文件追加器内部指定日志文件路径。

                <?xml version = "1.0" encoding = "UTF-8"?>
                <configuration>
                   <appender name = "FILE" class = "ch.qos.logback.core.FileAppender">
                      <File>/var/tmp/mylog.log</File>
                   </appender>   
                   <root level = "INFO">
                      <appender-ref ref = "FILE"/>
                   </root>
                </configuration>
            
#####   您可以使用下面给出的代码在logback.xml文件中定义日志模式。
        您还可以使用下面给出的代码在控制台或文件日志附加程序中定义一组受支持的日志模式-

            <pattern>[%d{yyyy-MM-dd'T'HH:mm:ss.sss'Z'}] [%C] [%t] [%L] [%-5p] %m%n</pattern>
            
#####   完整的logback.xml文件的代码如下。您必须将其放置在类路径中。

            <?xml version = "1.0" encoding = "UTF-8"?>
            <configuration>
               <appender name = "STDOUT" class = "ch.qos.logback.core.ConsoleAppender">
                  <encoder>
                     <pattern>[%d{yyyy-MM-dd'T'HH:mm:ss.sss'Z'}] [%C] [%t] [%L] [%-5p] %m%n</pattern>
                  </encoder>
               </appender>
               
               <appender name = "FILE" class = "ch.qos.logback.core.FileAppender">
                  <File>/var/tmp/mylog.log</File>
                  <encoder>
                     <pattern>[%d{yyyy-MM-dd'T'HH:mm:ss.sss'Z'}] [%C] [%t] [%L] [%-5p] %m%n</pattern>
                  </encoder>
               </appender>
               
               <root level = "INFO">
                  <appender-ref ref = "FILE"/>
                  <appender-ref ref = "STDOUT"/> 
               </root>
            </configuration>