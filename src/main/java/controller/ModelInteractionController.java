package controller;

import entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("sessionParam") //принимает список параметров, которые нужно хранить в сессии
public class ModelInteractionController {

   /* @ModelAttribute // данная модель будет предоставляться во всех методах этого контроллера
    private void prepopulatePerson(Model model) {
        model.addAttribute("defaultUser", new Person("Lera", "Stepanova"));
    } //or*/

    @ModelAttribute("defaultUser")
    public Person person(){
        return new Person("Lera", "Stepanova");
    }
    @GetMapping("/firstModel")
    public String showNewModel(Model model) {
        model.addAttribute("sessionParam", "Wild Session Param");
        return "newModel";
    }
    @GetMapping("/secondModel")
    public String viewSecondModel(Model model){
        System.out.println(model.containsAttribute("sessionParam"));
        return "newModel";
    }
}
