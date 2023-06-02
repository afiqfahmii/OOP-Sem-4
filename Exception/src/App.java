import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = scanner.nextInt();

        try{
            checkAge(age);
        }
        catch(Exception e){
            System.out.println("Error: " + e);
        }
    }

    public static void checkAge(int age) throws Exception {
        if (age <18){
            throw new AgeException("Age must be above 18");
        }else{
            System.out.println("You good");
        }

    }
}

