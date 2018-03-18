package my.spring.cloud.feign.config;


import feign.Feign;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

//feign的源码解析参考http://blog.csdn.net/forezp/article/details/73480304
@Configuration //处理启用feign后,请求header的信息传递问题
public class FeignConfig {

    @Bean
    public Feign.Builder feignBuilder(){
        return Feign.builder().requestInterceptor(new RequestInterceptor(){
            @Override
            public void apply(RequestTemplate template) {
                HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                        .getRequestAttributes()).getRequest();
                Enumeration<String> headerNames = request.getHeaderNames();
                if (headerNames != null) {
                    while (headerNames.hasMoreElements()) {
                        String name = headerNames.nextElement();
                        String values = request.getHeader(name);
                        template.header(name, values);
                    }
                }
            }
        });
    }
}
