package controller;

import entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @PostMapping("/authorization")
    public String authorization(Model model, Person person) {
        System.out.println(person);
        model.addAttribute("person", person);
        return "redirect:/demo"; //return "model";
    }

    @GetMapping("/authorization")
    public String welcomePage() {
        return "authorization";
    }
}
