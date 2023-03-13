package Spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.Context.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        Person person = context.getBean("myPerson",Person.class);
        person.callYourPet();
        context.close();

    }



}
