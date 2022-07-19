package in.myorg.FirstSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class demoController {
    @GetMapping("/")
    public String welcomeMessage(){
        return "Welcome to the world of sprong boot!!!";
    }

    @GetMapping("/getDate")
    public Date getDate(){
        return new Date();
    }

}
