# study-demo
无聊自己构建的学习项目，估计会乱七八糟的  


### cloud-session-demo 说明
* cloud-session-demo是微服务下使用spring session 来实现session共享
* register-center 是服务注册中心
* spring-session 是封装成模块的spring session
* cloud-test01与cloud-test02是两个测试项目
1. 先启动register-center
2. 配置本机的redis
3. redis启动成功后再启动cloud-test01与cloud-test02
4. 访问http://localhost:8080/session与http://localhost:8081/session 
	如果看到的session id一致即说明spring session 生效  


### cloud-session-zuul-demo说明
1. 基于cloud-session-demo,添加了zuul模块,模块里有具体的配置说明
2. 依次启动项目后,访问http://localhost:5555/session/session 
	如果能看到一致的session id，即说明zuul配置生效

### cloud-session-feign-demo说明
* feign学习思路：先弄清楚使用场景，再动手实现，最后有空看下别人的源码分析加深下印象
* feign官网 http://cloud.spring.io/spring-cloud-static/Dalston.SR5/single/spring-cloud.html#spring-cloud-feign
* feign使用场景及简单介绍 http://blog.csdn.net/neosmith/article/details/52180852
* feign其他使用方法 https://www.jianshu.com/p/81044b437ff8
* feign源码分析 http://blog.csdn.net/forezp/article/details/73480304

1. 基于cloud-session-demo，新增了cloud-test03与spring-feign模块
2. cloud-test03模块，可以使用feign调用cloud-test01或cloud-test02的接口
3. spring-feign模块,即feign的配置，想法是做成中间层插件
4. 依次启动register-center、cloud-test01、cloud-test02、cloud-test03后，访问localhost:8082/session(即cloud-test03) 
	如果能看到一致的session id，即说明feign配置成功
	
