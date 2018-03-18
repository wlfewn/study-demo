package my.spring.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@FeignClient(name = "spring-cloud-test") //name是微服务id，即配置文件中的spring.application.name
public interface SessionRemoteService {

    //也可以使用 @RequestLine()
    @RequestMapping(value = "/session")
    Map<String,String> getSession();

}
