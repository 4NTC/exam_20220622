
/*
  Given a single matrix of ints prints on standard output the sum of all int contained in the matrix
  A: {
    {2, 4, 6},
    {2, 4, 6},
    {2, 4, 6}
  }

  RESULT: 36
 */
public class SumMatrixValues {

  public static void main(String[] args) {

    int[][] matrix = {
        {2, 4, 6},
        {2, 4, 6},
        {2, 4, 6}
    };

    sumMatrix(matrix);

  }

  private static void sumMatrix(int[][] matrix) {

    int[] lineSum = new int[matrix.length];

    int index = 0;

    for (int[] line: matrix) {
      lineSum[index] = sumValues(line);
      index++;
    }

    System.out.println("Sum of all int contained in the matrix: " + sumValues(lineSum));

  }

  private static int sumValues(int[] lineSum) {

    int sum = 0;

    for (int num : lineSum) {
      sum += num;
    }

    return sum;
  }

}