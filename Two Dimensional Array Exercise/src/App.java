/*

*AFIQ FAHMI BIN ROSLAN 
*A21EC0153

Row 01
A

Row 11

Row 21
Z
*/

public class App {
    public static void main(String[] args) throws Exception {
        // char[][] table = new char[3][];

        //*table[1] = new char[4];
        //* table[0][0] = 'A';
        //* table[0][1] = 'B';
        //* table[0][2] = 'C';
        //* table[0][3] = 'D';

        //* table[1] = new char[2];
        //* table[1][0] = 'M';
        //* table[1][1] = 'M';

        //* table[1] = new char[3];
        //* table[2][0] = 'Z';
        //* table[2][1] = 'Y';
        //* table[2][2] = 'X';

        // for (int row = 0; row < table.length; row++) {
        //     System.out.println("Row " + row);
        //     System.out.println(table[row][0]);
        //     System.out.println();
        // }

        // int[][] number = new int[3][];
        // number[0] = new int[2];
        // number[1] = new int[5];
        // number[2] = new int[4];
        // // number[3] = new int[3];
        // System.out.print("Table Length" + number.length + " ");
        // System.out.println("Row length " + number[1].length);

        // Question 2 : Excessive number of row

        Invoice[] list = new Invoice[3];
        list[0] = new Invoice("Hammer", 14.9);
        list[1] = new Invoice("Paint Brush", 15.23);
        list[2] = new Invoice("Mini Broom", 10.0);

        for (Invoice obj : list) {
            System.out.println(obj.getDesc() + " " + obj.getPrice());
        }

    }
}
