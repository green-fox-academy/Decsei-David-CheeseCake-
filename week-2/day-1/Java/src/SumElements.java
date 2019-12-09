import java.lang.reflect.Array;

public class SumElements {
    // - Create an array variable named `r`
//   with the following content: `[54, 23, 66, 12]`
// - Print the sum of the second and the third element
    public static void main(String[] args) {
        int[] r={54,23,66,12};
        int sum = 0;

        for (int value : r) {
            sum += value;
        }
        System.out.println(sum);
    }
}
