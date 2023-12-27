import java.util.ArrayList;
import java.util.List;

public class TestAnimal {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Animal> animals = new ArrayList<Animal>();

        //create animals
        Cat c1 = new Cat(true, false, 0);
        Cat c2 = new Cat(false, true, 1);
        Dog d1 = new Dog(true, false, 0);
        Dog d2 = new Dog(true, false, 1);
        Frog f1 = new Frog(true, false, 1);
        Frog f2 = new Frog(true, false, 1);

        //add animals to the list
        animals.add(c1);
        animals.add(c2);
        animals.add(d1);
        animals.add(d2);
        animals.add(f1);
        animals.add(f2);

        //test a few variations of sayHello method
        c1.sayHello(1);
        c2.sayHello(0);
        d1.sayHello(0);
        d2.sayHello();
        f1.sayHello();
        f2.sayHello(1);

        //test other methods
        System.out.println(c1.isMammals());
        c2.setMammals(true);
        System.out.println(c2.isMammals());
        System.out.println(d1.isCarnivorous());
        d2.setCarnivorous(false);
        System.out.println(d2.isCarnivorous());
    }
}