package com.boodapest.BOOdapest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoodapestController {

    @GetMapping("/boodapest")
    public String mainPage() {
        return "themap/boodapest";
    }
}
