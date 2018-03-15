package my.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * cloud-test01的翻版
 */
@EnableEurekaClient
@SpringBootApplication
public class TestApplication02
{
    public static void main( String[] args )
    {
        SpringApplication.run(TestApplication02.class,args);
    }
}
