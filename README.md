# springboot-aop-log
springboot中使用aop统一处理日志

每一个接口请求都会打印出详细的日志

example
请求接口
http://localhost:8080/login?username=charay&password=123456

```powershell
INFO 20840 ---LogAspect  : url ==============>: http://localhost:8080/login
INFO 20840 ---LogAspect  : http_method ======>: GET
INFO 20840 ---LogAspect  : ip ===============>: 0:0:0:0:0:0:0:1
INFO 20840 ---LogAspect  : class_method =====>: com.example.springinitializr.controller.LoginController.login
INFO 20840 ---LogAspect  : Params ===========>: [charay, 123456, User{username='charay', password='123456'}]
INFO 20840 ---LogAspect  : Response ==>: User{username='charay', password='123456'}
```
