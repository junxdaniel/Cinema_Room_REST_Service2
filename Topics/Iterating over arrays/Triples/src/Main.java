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

        System.out.println(isTriple(array));
    }

    public static int isTriple(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length - 2; i++) {
            if (array[i + 2] - array[i + 1] == 1 && array[i + 1] - array[i] == 1) {
                count++;
            }
        }
        return count;
    }
}