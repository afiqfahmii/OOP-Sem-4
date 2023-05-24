import java.util.Scanner;

public class AppArray2D {

    public static void main(String[] args) {
        // coursemark ==> quiz1(5m) quiz2(5m) test1(20m) labtest(20m) assg(10m) :
        // total(60m)
        // double[] courseMark = new double[5];
        Scanner s = new Scanner(System.in);

        Student s1 = new Student("Afiq","A20",30);
        Student s2 = new Student("Fahmi","A21",20);
        Student s3 = new Student("Afak","A22",10);

        //? Another Style
        // Student st[]={new Student("Afiq","A20",30),new Student("Fahmi","A21",20),new Student("Afak","A22",10)};

        Student[] sList = new Student[3];
        sList[0]=s3;    
        sList[1]=s2;
        sList[2]=s1;
        sList[3]=new Student("Waffi","A23",40);
        // double[] courseMark = { 4.5, 4.0, 16.5, 15.0, 7.5 };
        // double[][] courseMarkAll = { { 1.1, 1.2, 1.3, 1.4, 1.5 }, { 2.1, 2.2, 2.3, 2.4, 2.5 },
        //         { 3.1, 3.2, 3.3, 3.4, 3.5 } };

        // double[][] courseMarkAllStud = new double[3][5]; // [ROW][COLUMN]
        // // Task 4
        // double[][] cmas = new double[3][5]; // [ROW][COLUMN]

        // System.out.println("Course Mark : " + courseMarkAllStud + "\n"); // Print Address
        // System.out.println("Course Mark : " + courseMarkAllStud[0] + "\n"); // Print Address
        // System.out.println("Course Mark : " + courseMarkAllStud[0][0] + "\n"); // Print Value

        // // Assign Values

        // courseMarkAllStud[0][0] = 4.5;
        // courseMarkAllStud[0][1] = 1.5;
        // courseMarkAllStud[0][2] = 2.5;
        // courseMarkAllStud[0][3] = 3.5;
        // courseMarkAllStud[0][4] = 5.5;

        // courseMarkAllStud[1][0] = 6.5;
        // courseMarkAllStud[1][1] = 8.5;
        // courseMarkAllStud[1][2] = 45.5;
        // courseMarkAllStud[1][3] = 1.5;
        // courseMarkAllStud[1][4] = 10.5;  

        // courseMarkAllStud[2][0] = 0.5;
        // courseMarkAllStud[2][1] = 3.5;
        // courseMarkAllStud[2][2] = 5.5;
        // courseMarkAllStud[2][3] = 7.5;
        // courseMarkAllStud[2][4] = 8.5;

        // // ? Task 3 :Use for loop to print all element

        // for (int i = 0; i < courseMarkAllStud.length; i++) {
        //     for (int j = 0; j < courseMarkAllStud[i].length; j++) {
        //         System.out.print(courseMarkAllStud[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // // ? Enhanced For Loop

        // // for (double[] cmas : courseMarkAllStud) {
        // // for (double x : cmas) {
        // // System.out.print(x + " ");
        // // }
        // // System.out.println();
        // // }

        // for (double cm : courseMark) {
        //     System.out.println(cm);
        // }

        // // ? Task 4 Ask User To Enter Value

        // for (int row = 0; row < cmas.length; row++) {

        //     for (int col = 0; col < cmas[row].length; col++) {
        //         System.out.print("Enter a value: ");
        //         cmas[row][col] = s.nextDouble();
        //     }
        // }
        // for (int i = 0; i < cmas.length; i++) {
        //     for (int j = 0; j < cmas[i].length; j++) {
        //         System.out.print(cmas[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // // ? Task 5 For Each Sum their Coursemark and print out

        // double sum1 = 0;
        // for (int i = 0; i < cmas.length; i++) {
        //     for (int j = 0; j < cmas[i].length; j++) {
        //         sum1 += cmas[i][j];
        //     }
        // }
        // System.out.println("\nSum is:" + sum1);

        // // ? Task 6 Search for the student with the highest coursemark, print the coursemark, print the student position

        // double sum[] = { 0, 0, 0 };
        // double highest = 0;
        // int row = 0;
        // int column = 0;
        // for (int i = 0; i < cmas.length; i++) {

        //     for (int j = 0; j < cmas[i].length; j++) {
        //         sum[i] += cmas[i][j];
            
        //     if (sum[i] > highest){
        //         highest = sum[i];
        //         row = i;
        //         column = j;
        //     }
        // }
        // }
        // System.out.println("\nHighest is:" + highest);
        // System.out.println("at position (" + row + ", " + column + ")");


        // ? Create Ragged Array


    }
}
