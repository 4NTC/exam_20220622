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

    int lines = sumMatrix.length;
    int rows = sumMatrix[0].length;

    int lineNum = 0;

    System.out.println("{");

    for (int[] arrayLine: sumMatrix) {

      if (lineNum < lines - 1) {
        System.out.println(printLine(arrayLine, rows) + ",");
      } else {
        System.out.println(printLine(arrayLine, rows));
      }

      lineNum++;
    }

    System.out.println("}");
  }

  private static String printLine(int[] array, int rows) {

    int rowNum = 0;

    String line = "";

    for (int num: array) {
      if (rowNum < rows - 1) {
        line += num + ", ";
      } else {
        line += num;
      }
      rowNum++;
    }
    return "{" + line +"}";
  }

  public static boolean sameDimension(int[][] matrix1, int[][] matrix2) {
    return (matrix1[0].length == matrix2[0].length) && (matrix1.length == matrix2.length);
  }

  public static int[][] sumTwoMatrix(int[][] matrix1, int[][] matrix2) {

    int[][] sumMatrix = new int[matrix1.length][matrix1[0].length];

    for (int i = 0; i<matrix1.length; i++) {
      for (int j = 0; j<matrix1[0].length; j++) {
        sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
      }
    }

    return sumMatrix;
  }

}