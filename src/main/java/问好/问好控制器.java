package 问好;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class 问好控制器 {

    @RequestMapping("/")
    public String 索引() {
        return "Spring Boot问好!";
    }

}