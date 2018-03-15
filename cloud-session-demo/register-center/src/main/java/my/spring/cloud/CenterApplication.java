package my.spring.cloud;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //需要使用该注解，才能看见管理界面
public class CenterApplication
{
    public static void main( String[] args )
    {
        new SpringApplicationBuilder(CenterApplication.class).web(true).run(args);
    }
}
