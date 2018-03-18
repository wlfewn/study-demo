package my.spring.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


@RestController
public class TestSessionController {

    @RequestMapping("/session")
    public Map<String,String> getSession(HttpServletRequest httpServletRequest){
        Map<String,String> map = new HashMap<>();
        map.put("sessionId",httpServletRequest.getSession().getId());
        map.put("url",httpServletRequest.getRequestURL().toString());
        return map;
    }

}
