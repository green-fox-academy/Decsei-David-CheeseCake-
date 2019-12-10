import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(aj));

        int[] ajCopy = {3, 4, 5, 6, 7};
            System.out.println(Arrays.toString(ajCopy));

        int rev = aj.length;
        for (int i = 0; i < aj.length ; i++) {
            aj[i] = ajCopy[rev-1];
            rev--;
        }
        System.out.println(Arrays.toString(aj));
        }
    }