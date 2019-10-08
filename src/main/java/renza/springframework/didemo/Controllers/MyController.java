package renza.springframework.didemo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import renza.Services.GreetingRepository;
import renza.Services.GreetingService;
import renza.Services.GreetingServiceFactory;
import renza.Services.GreetingServiceImpl;

@Controller
public class MyController {


    @Autowired
    public GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!! ");

        return greetingService.sayGreeting();
    }

}

