package us.mattgreen.thanks.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TheVeryThankfullController {

    @RequestMapping("/verythankful")
    public List<Thanks> getThanks() {
        List<Thanks> thanks = new ArrayList<>();
        thanks.add(new Thanks("A big Dinner",3));
        thanks.add(new Thanks("Detriot winning", 1));
        thanks.add(new Thanks("Packers Success",4));
        thanks.add(new Thanks("Interesting Students", 3));

        return thanks;
    }

}
