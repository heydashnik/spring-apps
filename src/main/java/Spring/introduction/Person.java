package Spring.introduction;

//hm...
public class Person {
    private Pet pet;
    private Car car;

    public Person(Pet pet) {
        this.pet = pet;
    }
    public Person() {
        System.out.println("Person Bean creating");
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet");
        pet.say();
    }


    public void setPet(Pet pet) {
        System.out.println("Set : Pet");
        this.pet = pet;
    }

    public Person(Car car) {
        this.car = car;
    }


    public void callYourCar() {
        System.out.println("My lovely car");
        car.model();

    }

    public void setCar(Car car) {
        System.out.println("Set : car");
        this.car = car;
    }
}
