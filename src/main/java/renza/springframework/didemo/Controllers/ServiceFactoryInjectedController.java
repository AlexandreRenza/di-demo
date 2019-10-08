package renza.springframework.didemo.Controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import renza.Services.GreetingRepository;
import renza.Services.GreetingService;
import renza.config.GreetingServiceConfig;

public class ServiceFactoryInjectedController {

    private GreetingService greetingService;


    public ServiceFactoryInjectedController(@Qualifier("") GreetingService greetingService){

        this.greetingService = greetingService;

    }

    public String sayHello(){

        return greetingService.greetingServiceFactory(greetingService);
    }



}
