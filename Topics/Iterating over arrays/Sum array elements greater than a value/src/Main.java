
import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];  // creating an array with the specified length

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }
        int n = scanner.nextInt();  // reading the number n

        System.out.println(addElements(array, n));

    }

    public static int addElements(int[] arry, int n) {
        int total = 0;
        for (int elemt : arry) {
            if (elemt > n) {
                total += elemt;
            }
        }
        return total;
    }
}