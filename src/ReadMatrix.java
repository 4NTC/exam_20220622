import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
  Given a string as standard input parse the string into a matrix

  args[0]: "{{1,2,3},{1,2,3},{1,2,3}}"

  RESULT: {
    {1, 2, 3},
    {1, 2, 3},
    {1, 2, 3}
  }
 */
public class ReadMatrix extends SumTwoMatrix{

  public static void main(String[] args) {

    String input = "{{1,2,3,5}, {4, 5,6,5},{7,8,9,5}}";

    String line = "(\\{\\d+(,\\s*\\d+)*\\})";

    Pattern matrix = Pattern.compile("\\s*\\{" + line + "(?:\\s*,?\\s*" + line + ")*\\}\\s*");
    Matcher matcher = matrix.matcher(input);

    if (matcher.matches()) {

      System.out.println(matcher.group(0));

      Pattern matrixLine = Pattern.compile(line);
      matcher = matrixLine.matcher(input);

      int lines = 0;
      int row = 0;

      //Create Matrix

      while (matcher.find()) {

        if (row == 0) {
          Pattern number = Pattern.compile("\\d+");
          Matcher numMatcher = number.matcher(matcher.group());
          while (numMatcher.find()) {
            row++;
          }
        }
        lines++;
      }

      int[][] matrixArr = new int[lines][row];

      //Insert Elements

      matcher = matrixLine.matcher(input);

      int index = 0;

      while (matcher.find()) {

        Pattern number = Pattern.compile("\\d+");
        Matcher numMatcher = number.matcher(matcher.group());

        int[] lineArray = new int[row];
        int i = 0;
        while (numMatcher.find()) {
          lineArray[i] = Integer.parseInt(numMatcher.group());
          i++;
        }
        matrixArr[index] = lineArray;
        index++;
      }


      printSpecialFormat(matrixArr);

    } else {
      System.out.println("Matrix Not Valid");
    }

  }

}