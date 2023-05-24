public class InheritApp {
    public static void main(String[] args) throws Exception {
        Human h1 = new Human("Army", 17.5, 2002);
        Person p1 = new Person("Army", 17.5, 2002, "Bangi", "0124721595", "Male");
        Student s1 =new Student("Barista", 1.77, 2002, "A21EC0153", 21, "Afiq Fahmi");

        System.out.println(h1.toString());
        System.out.println(p1.toString());
        System.out.println(s1.toString());	
    }
}
