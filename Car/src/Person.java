public class Person {

    private  Car car;
    private  String name;
    

    //? Composition
    public Person(String name) {  
        this.name = name;
        this.car=new Car("Axia");
    }


    //? Aggregiation
    public Person(String name, Car c) {
        this.name=name;
        this.car=c;
    }


}
