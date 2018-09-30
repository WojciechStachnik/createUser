package pl.akademiakodu.createUser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.createUser.model.Person;

@Controller
public class PersonController {

    @GetMapping("/")
    public String homePage(Model model){
        Person person = new Person();
        model.addAttribute("person", person);
        return "home";

    }
}
