import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arry = new int[n];

        for (int i = 0; i < n; i++) {
            arry[i] = scanner.nextInt();
        }
        System.out.println(minValue(arry));
    }

    public static int minValue(int[] arry) {
        int minval = arry[0];
        for (int i = 1; i < arry.length; i++) {
            if (arry[i] < minval) {
                minval = arry[i];
            }
        }
        return minval;
    }
}