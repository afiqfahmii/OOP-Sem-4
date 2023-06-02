public class App {
    public static void main(String[] args) {

        Integer a1 = 128;
        Integer a2 = 129;
        Integer a3 = 130;

        a1=a1+2;
        System.out.println("a1 : "+a1);
        System.out.println("a1==a3 ? :"+(a1==a3));
        System.out.println("a1 equals a3 ? :"+(a1.equals(a3)));


        // ----------------------------------------------------------------------------------

        // Integer a1 = 127;
        // Integer a2 = 127;

        System.out.println("Value a1 : " + a1);
        System.out.println("Value a2 : " + a2);
        System.out.println("is a1==a2: " + (a1==a2));
        System.out.println("is a1==a2: " + a1.equals(a2));

        // -----------------------------------------------------------------------------------

        // ! Integer wa = new Integer(10); // Integer wa = 10 // Integer.valueOf("10")
        Integer wa = Integer.valueOf(10); // ? Explicit boxing
        // ! Float wb = new Float(10.5);
        Float wb = Float.valueOf(10.5f);
        // ! Double wc = new Double(25.5);
        Double wc = Double.valueOf(25.5);
        // Parameter also can be inserted in a quote

        int a = wa.intValue(); // ? Explicit Unboxing

        System.out.println("Value A is :" + wa);
        System.out.println("Value B is :" + wb);
        System.out.println("Value C is :" + wc);

        System.out.println("Value a is :" + a);

    }
}
