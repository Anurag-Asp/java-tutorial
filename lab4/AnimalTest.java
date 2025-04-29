interface Animal {
    void bark();
}


class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}


public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(); 
    }
}