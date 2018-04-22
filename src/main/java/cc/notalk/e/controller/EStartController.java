package cc.notalk.e.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController 此注解表示返回值都是json格式
@RestController
public class EStartController {

    @GetMapping("/hw")
    public String hw() {
        return "hw";
    }
}
