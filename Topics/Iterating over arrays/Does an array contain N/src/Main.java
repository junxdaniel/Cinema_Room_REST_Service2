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
        int n = scanner.nextInt();

        System.out.println(isPresent(array, n));
    }

    public static boolean isPresent(int[] array, int n) {
        for (int elemnt : array) {
            if (elemnt == n) {
                return true;
            }
        }
        return false;
    }
}