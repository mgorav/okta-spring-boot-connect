package com.gonnect.okta;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloOktaController {

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";
    }

    @PreAuthorize("#oauth2.hasScope('gaurav.malhotra@nike.com')")
    @GetMapping("/protected/")
    public String helloWorldProtected(Principal principal) {
        return "Hello VIP " + principal.getName();
    }
}
