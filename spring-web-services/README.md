#####   在继续构建RESTful Web服务之前，建议您了解以下注释-

#####   休息控制器

            @RestController
            
            批注用于定义RESTful Web服务。它提供JSON，XML和自定义响应。
            其语法如下所示-
            @RestController
            public class ProductServiceController { }
            
#####   请求映射

            @RequestMapping
            
            批注用于定义请求URI来访问REST端点。
            我们可以定义Request方法来消耗和产生对象。默认请求方法是GET。
            
            @RequestMapping(value = "/products")
            public ResponseEntity<Object> getProducts() { }
#####   请求正文

            @RequestBody
            
            批注用于定义请求正文内容类型。
            public ResponseEntity<Object> createProduct(
                @RequestBody Product product) {
            }
#####   路径变量

            @PathVariable
            
            批注用于定义自定义或动态请求URI。
            请求URI中的Path变量定义为大括号{}，如下所示-   
            public ResponseEntity<Object> updateProduct(
                @PathVariable("id") String id) {
            }
#####   请求参数
                @RequestParam
                
                批注用于从请求URL读取请求参数。默认情况下，它是必需的参数。
                我们还可以为请求参数设置默认值，如下所示：    
                public ResponseEntity<Object> getProduct(
                   @RequestParam(value = "name", required = false, defaultValue = "honey") String name) {
                }
                
#####   控制器建议

              @ControllerAdvice是注释，用于全局处理异常。
              @ExceptionHandler是用于处理特定异常并将自定义响应发送到客户端的注释。
              
#####   您可以使用以下代码创建@ControllerAdvice类以全局处理异常-

              @ControllerAdvice
                 public class ProductExceptionController {
              }
          
#####   您可以定义一个扩展RuntimeException类的类
            
            public class ProductNotfoundException extends RuntimeException {
               private static final long serialVersionUID = 1L;
            }
            
#####   您可以定义@ExceptionHandler方法来处理如图所示的异常。

            此方法应用于编写Controller Advice类文件
            
            @ExceptionHandler(value = ProductNotfoundException.class)
            
            public ResponseEntity<Object> exception(ProductNotfoundException exception) {
            }
        
#####   使用下面给出的代码从API引发异常

            @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
            public ResponseEntity<Object> updateProduct() { 
               throw new ProductNotfoundException();
            }
        
#####   您可以定义ProductNotFoundException异常类应扩展RuntimeException。

            public class ProductNotfoundException extends RuntimeException {
               private static final long serialVersionUID = 1L;
            }
            
#####   下面给出了用于全局处理异常的Controller Advice类
            
            @ControllerAdvice
            public class ProductExceptionController {
               @ExceptionHandler(value = ProductNotfoundException.class)
               public ResponseEntity<Object> exception(ProductNotfoundException exception) {
                  return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
               }
            }