# springboot-aop-log
springboot中使用aop统一处理日志

每一个接口请求都会打印出详细的日志

```powershell
15:35:23.153  INFO 20840 ---LogAspect  : url ==============>: http://localhost:8080/login
15:35:23.155  INFO 20840 ---LogAspect  : http_method ======>: GET
15:35:23.155  INFO 20840 ---LogAspect  : ip ===============>: 0:0:0:0:0:0:0:1
15:35:23.156  INFO 20840 ---LogAspect  : class_method =====>: com.example.springinitializr.controller.LoginController.login
15:35:23.156  INFO 20840 ---LogAspect  : Params ===========>: [charay, 123456, User{username='charay', password='123456'}]
15:35:23.164  INFO 20840 ---LogAspect  : Response ==>: User{username='charay', password='123456'}
```
