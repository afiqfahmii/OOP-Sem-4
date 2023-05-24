import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Vector<String> vname = new Vector<String>(); // ! More Specific
        // Vector vname = new Vector();
        // Integer x = new Integer(10);

        // vname.add(new Double(12.5));
        // vname.add(x);
        vname.add("Ali");
        vname.add("Azhan");
        vname.add(1, "abdul");
        vname.set(1, "Amir");

        // String result = vname.remove(1);
        boolean result = vname.remove("Ali");
        System.out.println("Result is : " + result);
        System.out.println("vname capacity : " + vname.capacity());
        System.out.println(vname);

    }
}
