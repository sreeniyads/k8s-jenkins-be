package learn.sreeni.demofullstack.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class FirstController {

    @GetMapping("/hello")
    public String firstMethod(){
        return "Hello Sreeni , are you ready?";
    }
}
