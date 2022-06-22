
/*
  Given two string as standard input parse them as matrix,
  Then sum both matrix
  And pretty print on stdout the result matrix
  Then print the sum of matrix result values
 */
public class MatrixCombined extends ReadMatrix{

  public static void main(String[] args) {

    String input1 = args[0];
    String input2 = args[1];

    //String input1 = "{{1,2,3},{1,2,3},{1,2,3}}";
    //String input2 = "{{1,2,3},{1,6,3},{1,2,3}}";

    int[][] matrix1 = createMatrix(input1);
    int[][] matrix2 = createMatrix(input2);

    System.out.println("First Matrix: ");
    printSpecialFormat(matrix1);

    System.out.println("Second Matrix: ");
    printSpecialFormat(matrix2);

    System.out.println("MatrixSum :");
    if (sameDimension(matrix1, matrix2)) {
      int[][] sumMatrix = sumTwoMatrix(matrix1, matrix2);
      printSpecialFormat(sumMatrix);
      System.out.println("Elements sum in MatrixSum: ");
      SumMatrixValues.sumMatrix(sumMatrix);
    } else {
      System.out.println("Matrix1 and Matrix2 have different dimension: Invalid Sum");
    }
  }

}