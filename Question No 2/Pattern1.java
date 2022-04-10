import java.util.Scanner;

public class PrintNumberPattern {

    static void display2DMatrix(int[][] matrix) {
        for (int row = 0; row< matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] != 0) {
                    System.out.printf("%3d ",matrix[row][col]);
                } else {
                    System.out.print("    ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        int num = new Scanner(System.in).nextInt();
//        int num = 10;
        int[][] matrix = new int[num][num];

        int counter = 0;

        int maxCount = (num * (num + 1)) / 2;

        int left= 0;
        int bottom = num - 1;
        int right = num-1;
        int top = 0;

        while (counter < maxCount) {

            //Diagonal
            for (int row = top, col = left; col <= bottom + top; row++, col++) {
                matrix[row][col] = ++counter;
            }

            //Bottom to up
            for (int row = bottom - 1; row >= top; row--) {
                matrix[row][right] = ++counter;
            }

            right--;

            //Right to left
            for (int row = top, col = right; col > left; col-- ) {
                matrix[row][col] = ++counter;
            }

            left+=2;
            bottom-=2;
            top++;

        }

        display2DMatrix(matrix);
    }
}
