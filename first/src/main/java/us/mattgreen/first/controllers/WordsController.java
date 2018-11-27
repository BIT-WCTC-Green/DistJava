package us.mattgreen.first.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordsController {

    @RequestMapping("/fun")
    public String fun() {
        return "This is Fun";
    }

    @RequestMapping("/sad")
    public String sad() {
        return "This is Sad";
    }


}
