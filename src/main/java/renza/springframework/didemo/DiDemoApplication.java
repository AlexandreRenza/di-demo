package renza.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import renza.springframework.didemo.Controllers.ConstructorInjectedController;
import renza.springframework.didemo.Controllers.MyController;
import renza.springframework.didemo.Controllers.PropertyInjectedController;
import renza.springframework.didemo.Controllers.SetterInjectionController;

@SpringBootApplication
@ComponentScan(basePackages = {"renza.Services", "renza.springframework"})
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
        //System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        //System.out.println(ctx.getBean(SetterInjectionController.class).sayHello());
        //System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
