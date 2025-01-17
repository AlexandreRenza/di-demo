package renza.springframework.didemo.Controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import renza.Services.GreetingService;

@Controller
public class ConstructorInjectedController {


    private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService){

        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }


}
