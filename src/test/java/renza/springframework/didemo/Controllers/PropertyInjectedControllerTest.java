package renza.springframework.didemo.Controllers;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import renza.Services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{

        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();

    }

    @Test
    public void testGreeting() throws Exception{

        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());

    }





}
