import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DailyReport {
    public static void main(String[] args) throws Exception {

        Burger[] order = new Burger[11];
        int totalOrder = 0;
        double totalPrice = 0;

        // ? Read Input.txt
        try {
            File inputFile = new File("src/input.txt");
            Scanner file = new Scanner(inputFile);

            System.out.printf("%n                             ABC BURGER DAILY SALES REPORT%n%n");
            System.out.printf("NUM  CODE   DESCRIPTION                       PRICE(RM)  QUANTITY    TOTAL PRICE(RM)  %n");

            // ? Create array of object to store value

            for (int i = 0; i < 11; i++) {
                if (file.hasNext()) {
                    String desc = file.next();
                    int quantity = file.nextInt();
                    order[i] = new Burger(desc, quantity);
                } else {
                    totalOrder = i;
                    System.out.println(totalOrder);
                    break;
                }

                MenuList menu = MenuList.valueOf(order[i].getCode());
                double tempPrice = menu.getPrice() * order[i].getQuantity();

                System.out.printf("%-4d %-8s %-30s %11.2f %10d %15.2f%n",
                        i + 1, order[i].getCode(), menu.getDesc(), menu.getPrice(), order[i].getQuantity(), tempPrice);

                totalPrice += tempPrice;
            }
            file.close();

        } catch (FileNotFoundException error) {
            System.out.println("File not found: " + error.getMessage());
        }

        System.out.println();
        System.out.println("Total Items Sold = " + order[totalOrder - 1].getTotalItem() + " burgers");
        System.out.println("Total Income     = RM" + totalPrice);

    }

}
