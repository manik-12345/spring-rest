package  me.manik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class BlogController {
    @RequestMapping("/name")
    public String getName(){
        return "Synergyforce Employers";
    }
}

