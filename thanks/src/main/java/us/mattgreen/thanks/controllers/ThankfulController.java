package us.mattgreen.thanks.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThankfulController {

    @RequestMapping("/thanks")
    public String sayThankful() {
        return "I am Thankful for my Distributed Java Class!!!";
    }

    @RequestMapping("/darn")
    public String sharingOfGrievances() {
        return "You should see my Scripting Class.";
    }
}
