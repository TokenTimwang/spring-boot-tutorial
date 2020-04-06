#####   1.开启更新机制

        需要给加载变量的类上面加载@RefreshScope，
        在客户端执行/refresh的时候就会更新此类下面的变量值。
        
        @SpringBootApplication
        @RestController // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
        @RefreshScope
        public class CloudClientApplication {
        
            public static void main(String[] args) {
                SpringApplication.run(CloudClientApplication.class, args);
            }
        
            @Value("${welcome.message}")
            private String welcomeTest;
        
            @RequestMapping(value = "/message")
            public String welcomeTest(){
                return this.welcomeTest;
            }
        }
        
#####   2.启动类没有变化，添加@EnableConfigServer激活对配置中心的支持
            
           @SpringBootApplication
           @EnableConfigServer
           public class CloudServerApplication {
           
               public static void main(String[] args) {
                   SpringApplication.run(CloudServerApplication.class, args);
               }
           
           }