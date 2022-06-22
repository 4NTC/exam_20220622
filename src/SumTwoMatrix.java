import java.util.Arrays;

/*
  Given two matrix of ints prints on standard output the sum of both matrix
  A: {
    {1, 2, 3},
    {1, 2, 3},
    {1, 2, 3}
  }

  B: {
    {1, 2, 3},
    {1, 2, 3},
    {1, 2, 3}
  }

  RESULT:
  {
    {2, 4, 6},
    {2, 4, 6},
    {2, 4, 6}
  }

  Result matrix must be printed and formatted as previously shown
 */
public class SumTwoMatrix {

  public static void main(String[] args) {

    int[][] matrix1 = {
        {1, 2, 3},
        {1, 2, 3},
        {1, 2, 3}
    };

    int[][] matrix2 = {
        {1, 2, 3},
        {1, 2, 3},
        {1, 2, 3}
    };

    if (sameDimension(matrix1,matrix2)) {
      int[][] sumMatrix = sumTwoMatrix(matrix1, matrix2);
      printSpecialFormat(sumMatrix);
    } else {
      System.out.println("Matrix1 and Matrix2 have different dimension: Invalid Sum");
    }

  }

  public static void printSpecialFormat(int[][] sumMatrix) {

    System.out.println("{");

    for (int[] line: sumMatrix) {

      //printLine(line);
      System.out.println(Arrays.toString(line));

    }

    System.out.println("}");
  }

  private static void printLine(int[] line) {

    System.out.print("{");

    for (int num: line) {
      System.out.print(num + ", ");
    }

    System.out.println("}");
  }

  private static boolean sameDimension(int[][] matrix1, int[][] matrix2) {
    return (matrix1[0].length == matrix2[0].length) && (matrix1.length == matrix2.length);
  }

  private static int[][] sumTwoMatrix(int[][] matrix1, int[][] matrix2) {

    int[][] sumMatrix = new int[matrix1.length][matrix1[0].length];

    for (int i = 0; i<matrix1.length; i++) {
      for (int j = 0; j<matrix1[0].length; j++) {
        sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
      }
    }

    return sumMatrix;
  }

}