public class inRoHalfPyra {
    public static void main(String[] args) {
        int n = 4; // number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int s = 1; s < i; s++) {
                System.out.print("  "); // To print spaces
            }

            
            for (int j = 1; j <= n - i + 1; j++) { //To print Stars
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
