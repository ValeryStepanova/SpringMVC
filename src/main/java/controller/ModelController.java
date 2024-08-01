package controller;

import entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ModelController {
    @GetMapping("/model/{id}")
    String viewModel(Model model, @PathVariable("id")Long id, @RequestParam("username")String name,
                     @RequestParam("surname")String surname){
        System.out.println(id);
        Person person = Person.builder()
                .name(name)
                .surname(surname).build();
        model.addAttribute("person", person);
        return "model";
    }
}
