package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping(path = "/demo")
    public String showPage(){
        return "hello";
    }
}
