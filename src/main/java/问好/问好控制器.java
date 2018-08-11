package 问好;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class 问好控制器 {

    @RequestMapping("/")
    public String index() {
        return "Spring Boot问好!";
    }

}