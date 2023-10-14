package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){    // 웹 어플리케이션에서 /hello라고 들어오면 이 메소드를 호출 -> 스프링이 해준다.
        model.addAttribute("data","hello!!");
        return "hello";
    }

}
