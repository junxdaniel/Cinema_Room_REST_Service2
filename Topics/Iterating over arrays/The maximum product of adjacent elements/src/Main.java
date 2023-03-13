import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] arr) {
        int temp;
        int retval = 0;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i - 1] * arr[i];
            if (retval < temp) {
                retval = temp;
            }
        }
        return retval;
    }
}