package renza.springframework.didemo.Controllers;

import org.junit.Before;
import org.junit.Test;
import renza.Services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class SetterInjectionControllerTest {

    private SetterInjectionController setterInjectionController;

    @Before
    public void setUp() throws Exception{

        this.setterInjectionController = new SetterInjectionController();
        this.setterInjectionController.setGreetingService(new GreetingServiceImpl());

    }

    @Test
    public void testGreeting() throws Exception{

        assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectionController.sayHello());

    }



}
