public class Stars {
    public static void main(String[] args) {
        int n = 10;
        int i, j, m;
        for (i = 0; i < n; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            for (m = 0; m < 2 * n - 2 * (i + 1); m++) {
                System.out.print(" ");
            }
            for (j=0;j<i+1;j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}