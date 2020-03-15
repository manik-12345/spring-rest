package  me.manik;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
    @RequestMapping("/name")
    public String getName(){
        return "Synergyforce Employers";
    }
}

