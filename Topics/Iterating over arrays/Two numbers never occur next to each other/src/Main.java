import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(notAdjacent(array, m, n));
    }

    public static boolean notAdjacent(int[] array, int m, int n) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == m && array[i + 1]  == n) {
                return false;
            } else if (array[i] == n && array[i + 1] == m) {
                return false;
            }
        }
        return true;
    }
}