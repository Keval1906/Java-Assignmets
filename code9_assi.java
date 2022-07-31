/*21CE038-HADIYAL KEVAL R */
public class code9_assi {
    public static void main(String[] args) {
        int[][] a = new int[][] {
                { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
        int flage = 0;
        int sumr;
        int sumc;
        int i = 0, j = 0;
        for (i = 0; i < 9; i++) {
            sumr = 0;
            sumc = 0;
            for (j = 0; j < 9; j++) {
                sumr += a[i][j];
                sumc += a[j][i];
            }
            if (sumr != 45 || sumc != 45) {
                System.out.println("NOT CORRECT");
                break;
            }
        }
        if (i == 9 && j == 9) {
            System.out.println("CORRECT");
        }
    }
}
