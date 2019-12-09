import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DiagonalMatrix {
    // Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please insert the number of lines: ");
        int x = scan.nextInt();
        System.out.println("Please insert the number of rows: ");
        int y = scan.nextInt();
        int[][] TwoDim = new int[x][y];

        for (int i = 0; i < TwoDim.length; i++) {
            for (int j = 0; j < TwoDim.length; j++) {
                if (i == j) {
                    TwoDim[i][j] = 1;
                } else {
                    TwoDim[i][j] = 0;
                }
            }
        }
        for (int k = 0; k < x; k++) {
            for (int l = 0; l < y; l++) {
                System.out.print(TwoDim[k][l] + " ");
            }
            System.out.println();
        }
        //System.out.println(Arrays.deepToString(TwoDim));
    }
}
