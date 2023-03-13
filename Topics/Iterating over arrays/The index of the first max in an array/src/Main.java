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

        System.out.println(findMax(array));
    }

    public static int findMax(int[] array) {
        int retval = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[retval]) {
                retval = i;
            }
        }
        return retval;
    }
}