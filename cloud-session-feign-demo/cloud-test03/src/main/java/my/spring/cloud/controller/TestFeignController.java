package my.spring.cloud.controller;

import my.spring.cloud.feign.SessionRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestFeignController {
    @Autowired
    private SessionRemoteService sessionRemoteService;

    @RequestMapping("/session")
    public Map<String,String> session(){
        return sessionRemoteService.getSession();
    }

}
