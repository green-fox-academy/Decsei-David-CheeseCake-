public class RotateMatrix {

  public static void main(String[] args) {
    int[][] matrix = new int[][]
        {{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};

    rotateMatrix(matrix);

    for (int i = 0; i < matrix.length; i++)
    {
      for (int j = 0; j < matrix.length; j++)
        System.out.print( matrix[i][j] + " ");
      System.out.println();
    }
  }

  public static void rotateMatrix(int[][] matrix) {

    for (int i = 0; i < matrix.length / 2; i++)
    {
      for (int j = i; j < matrix.length - i - 1; j++)
      {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[matrix.length - 1 - j][i];
        matrix[matrix.length - 1 - j][i] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
        matrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[j][matrix.length - 1 - i];
        matrix[j][matrix.length - 1 - i] = temp;
      }
    }
  }
}
