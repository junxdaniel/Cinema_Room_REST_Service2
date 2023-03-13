import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int greatestNo;
        int row = 0;
        int col = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        greatestNo = matrix[row][col];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > greatestNo) {
                    greatestNo = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(row + " " + col);
    }
}