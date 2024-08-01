package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class HelloController {
    @GetMapping("/hello")
    public String hello(HttpServletRequest request){
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        System.out.println(name+" "+surname+", hello!");
        return "hello";
    }
    @GetMapping("/goodbye")//required = false допускает null
    public String goodbye(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "surname", required = false) String surname){
        System.out.println("Hello, "+name+" "+surname);
        return "goodbye";
    }

}
