interface Move {

    void normalMove();

    void panicMove();

    void alternativeMove();

}

abstract class Animal {
    protected String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println("Zzz...");
    }

    public abstract void makeSound();

    public abstract void move();
}

// fish,squid,snake,human
// Define method
class Cat extends Animal implements Move {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
    }

    @Override
    public void move() {
    }

    @Override
    public void normalMove() {
        System.out.println(this.name + ": walk on 4 legs ");
    }

    @Override
    public void panicMove() {
        System.out.println(this.name + ": hide");
    }

    @Override
    public void alternativeMove() {
    }

}

class Snake extends Animal {
    public Snake(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
    }

    @Override
    public void move() {
    }

}

class Human extends Animal {
    public Human(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
    }

    @Override
    public void move() {
    }

}

class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
    }

    @Override
    public void move() {
    }

}

class Squid extends Animal {
    public Squid(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
    }

    @Override
    public void move() {
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Cat cat = new Cat("Kucing");
        cat.makeSound();

        Squid sq1 = new Squid("Sotong");
        sq1.makeSound();

        Fish f1 = new Fish("Siakap");
        f1.makeSound();

        Snake s1 = new Snake("Anaconda");
        s1.makeSound();

        Human h1 = new Human("Afiq");
        h1.makeSound();

    }
}
