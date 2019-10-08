package renza.springframework.didemo.Controllers;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import renza.Services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {


    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception{

        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());

    }

    @Test
    public void testGreetind() throws Exception{

        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());

    }



}
