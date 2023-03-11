package Spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.Context.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        Person person = new Person(pet);
        person.callYourPet();
    }
}
