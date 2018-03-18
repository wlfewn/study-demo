package my.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@EnableFeignClients //开启feign，需要手动显示声明
@SpringBootApplication
@EnableEurekaClient //需要进行服务注册，才能使用feign
public class TestApplication03
{
    public static void main( String[] args )
    {
        SpringApplication.run(TestApplication03.class,args);
    }
}
