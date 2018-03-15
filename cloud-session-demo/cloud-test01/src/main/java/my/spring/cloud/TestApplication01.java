package my.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient //启动EnableEureka客户端,进行服务注册
@SpringBootApplication
public class TestApplication01
{
    public static void main( String[] args )
    {
        SpringApplication.run(TestApplication01.class,args);
    }
}
