import javax.swing.JOptionPane;
import java.util.Scanner;

public class Week03 {

    public static void main(String[] args) {

        JOptionPane jop = new JOptionPane();
        jop.showMessageDialog(null, "Hello World");
        String name = jop.showInputDialog("Please Enter your name");
        String syob = jop.showInputDialog("Please Enter Year Of Birth");
        int yob = Integer.parseInt(syob);
        float berat = Float.parseFloat(jop.showInputDialog("Weight"));
        float tinggi = Float.parseFloat(jop.showInputDialog("Height"));

        // Person p = new Person(name,yob,berat,tinggi);
        Person p = new Person("ali", 1999, 99, 1.99f);
        p.calcBmi();
        // jop.showMessageDialog(null,p.toString());
        System.out.println(p.toString());
        System.exit(0);

        BmiApp ba = new BmiApp();
        ba.runApp();
        System.exit(0);

    }
}
