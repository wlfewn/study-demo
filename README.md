# study-demo
无聊自己构建的学习项目，估计会乱七八糟的  


cloud-session-demo 说明
* cloud-session-demo是微服务下使用spring session 来实现session共享
* register-center 是服务注册中心
* spring-session 是封装成模块的spring session
* cloud-test01与cloud-test02是两个测试项目
1. 先启动register-center
2. 配置本机的redis
3. redis启动成功后再启动cloud-test01与cloud-test02
4. 访问http://localhost:8080/session与http://localhost:8081/session 
	如果看到的session id一致即说明spring session 生效  


cloud-session-zuul-demo说明
1. 基于spring-session-demo,添加了zuul模块,配置文件有具体说明
2. 依次启动项目后,访问http://localhost:5555/session/session 
	如果能看到一致的session id和不一致url，即说明zuul配置生效

