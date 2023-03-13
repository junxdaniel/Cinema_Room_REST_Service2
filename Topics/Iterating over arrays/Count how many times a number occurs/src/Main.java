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

        System.out.println(countChr(array, n));

    }

    public static int countChr(int[] array, int n) {
        int count = 0;
        for (int elemnt : array) {
            if (elemnt == n) {
                count++;
            }
        }
        return count;
    }
}