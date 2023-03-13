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

        System.out.println(sumArray(array));
    }

    public static int sumArray(int[] arry) {
        int total = 0;
        for (int elemnt : arry) {
            total += elemnt;
        }
        return total;
    }
}