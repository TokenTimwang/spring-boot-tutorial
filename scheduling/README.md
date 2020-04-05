#####   `调度是在特定时间段内执行任务的过程。Spring Boot为在Spring应用程序上编写调度程序提供了良好的支持。`

#####   2.显示了如何每天从每天的9:00 AM开始到9:59 AM结束每分钟执行任务

        此处显示了用于从应用程序启动起每秒执行任务
        @Component
        public class Scheduler {
           @Scheduled(cron = "0 * 9 * * ?")
           public void cronJobSch() {
              SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
              Date now = new Date();
              String strDate = sdf.format(now);
              System.out.println("Java cron job expression:: " + strDate);
           }
        }

#####   3.固定速率计划程序用于在特定时间执行任务。它不等待上一个任务的完成。

            @Component
            public class Scheduler {
               @Scheduled(fixedRate = 1000)
               public void fixedRateSch() {
                  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            
                  Date now = new Date();
                  String strDate = sdf.format(now);
                  System.out.println("Fixed Rate scheduler:: " + strDate);
               }
            }
#####   4.固定延迟调度程序用于在特定时间执行任务。它应该等待上一个任务完成。
           
            在这里，initialDelay是在初始延迟值之后第一次执行任务之后的时间。
            从应用程序启动完成3秒后，每秒执行一次任务
            
            @Component
            public class Scheduler {
               @Scheduled(fixedDelay = 1000, initialDelay = 3000)
               public void fixedDelaySch() {
                  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                  Date now = new Date();
                  String strDate = sdf.format(now);
                  System.out.println("Fixed Delay scheduler:: " + strDate);
               }
            }
            
#####   5.启用HTTPS
            
            您需要按照以下步骤在Spring Boot应用程序中配置HTTPS和端口443- 
            获取SSL证书–创建自签名证书或从证书颁发机构获取一个证书
            启用HTTPS和443端口
            
            keytool -genkey -alias tomcat -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore keystore.p12 -validity 3650
            Enter keystore password:
               Re-enter new password:
               What is your first and last name?
               [Unknown]:
               What is the name of your organizational unit?
               [Unknown]:
               What is the name of your organization?
               [Unknown]:
               What is the name of your City or Locality?
               [Unknown]:
               What is the name of your State or Province?
               [Unknown]:
               What is the two-letter country code for this unit?
               [Unknown]:
               Is CN = Unknown, OU=Unknown, O = Unknown, L = Unknown, ST = Unknown, C = Unknown correct?
               [no]: yes
               
             此代码将生成一个名为keystore.p12的PKCS12密钥库文件，并且证书别名为tomcat。
             
#####   6.配置HTTPS

            application.properties文件中提供服务器端口443，密钥库文件路径，密钥库密码，密钥库类型和密钥别名。遵守此处给出的代码
            
            server.port: 443
            server.ssl.key-store: keystore.p12
            server.ssl.key-store-password: springboot
            server.ssl.keyStoreType: PKCS12
            server.ssl.keyAlias: tomcat





