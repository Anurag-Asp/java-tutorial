public class PatternPrinting {
    public static void main(String[] args) {
        int rows = 3; 

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1) + " ");
            }

            for (int k = 1; k <= rows - i; k++) {
                System.out.print("  ");
            }

            for (int l = 1; l <= rows - i + 1; l++) {
                System.out.print("# ");
            }

            System.out.println(); 
        }
    }
}