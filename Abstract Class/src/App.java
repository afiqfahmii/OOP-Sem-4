class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println("Zzz...");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Animal a1 = new Animal("Cat");
        a1.sleep();

    }
}
