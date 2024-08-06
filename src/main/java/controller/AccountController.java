package controller;

import entity.Account;
import entity.AccountType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class AccountController {
    @ModelAttribute("account")
    public Account modelAccount(){
        return new Account();
    }

    @ModelAttribute("accountTypes")
    public AccountType[] getTypes(){
        return AccountType.values();
    }
    @GetMapping("/account")
    public String showAccountPage(Model model){
        return "account";
    }

    @PostMapping("/account")
    public String saveAccount(Account account){
        System.out.println(account);
        return "redirect:/account";
    }
}
