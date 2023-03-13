package Spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.Context.xml");
        Car car = context.getBean("myCar", Car.class);
        Person person = context.getBean("myPersonCar", Person.class);
        person.callYourCar();
        context.close();
    }
}
