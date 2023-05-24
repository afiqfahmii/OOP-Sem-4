public class Demo {
    public static void main(String[] args) throws Exception {
        
        Address obj1=new Address("UTM",2002);
        Address obj2=new Address("UTM",2003);

        System.out.println("Obj1 is :"+obj1.toString());
        System.out.println("Obj2 is :"+obj2.toString());

        System.out.println("Are obj1 and obj2 is same object "+(obj1==obj2));
    }
}
