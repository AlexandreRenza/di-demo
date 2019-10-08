package renza.springframework.didemo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import renza.Services.GreetingService;

@Controller
public class SetterInjectionController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
