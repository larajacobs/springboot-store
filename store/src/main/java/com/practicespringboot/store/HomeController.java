package com.practicespringboot.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller // Extra information provided to the compiler (web controller for receiving web traffic)
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "index.html"; // Return the name of the view/ user interface that needs to be returned to browser
    }
    
}
