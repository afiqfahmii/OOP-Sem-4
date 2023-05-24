public class Exercise {
    public static void main(String[] args) throws Exception {

        // String[] nama = new String[5];
        String[] nama = { "Ahmad", "Fadli", "Fandi", "Kamal", "Jamal" };

        for(int i=0; i<nama.length;i++){
        System.out.println("\nPrint all name : " + nama[i]);
        }

        // Second Method
        for (String n : nama) {
            System.out.println("\n " + n + "");
        }

        displayName(nama);

    }

    private static void displayName(String[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println("\nPrint all name : " + x[i]);
        }
    }
}
