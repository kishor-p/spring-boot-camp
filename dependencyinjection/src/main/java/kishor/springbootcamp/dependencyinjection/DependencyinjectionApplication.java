package kishor.springbootcamp.dependencyinjection;

import kishor.springbootcamp.dependencyinjection.controllers.ConstructorInjectedController;
import kishor.springbootcamp.dependencyinjection.controllers.MyController;
import kishor.springbootcamp.dependencyinjection.controllers.PropertyInjectedController;
import kishor.springbootcamp.dependencyinjection.controllers.SetterBasedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyinjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(DependencyinjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("------Property Based Controller---------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());


		System.out.println("------Setter Based Controller---------");
		SetterBasedController setterBasedController = (SetterBasedController) ctx.getBean("setterBasedController");
		System.out.println(setterBasedController.getGreeting());

		System.out.println("------Constructor Based Controller---------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
