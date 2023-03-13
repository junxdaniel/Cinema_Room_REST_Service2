import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] income = new int[len];
        for (int i = 0; i < len; i++) {
            income[i] = scanner.nextInt();
        }
        int[] taxes = new int[len];
        for (int i = 0; i < len; i++) {
            taxes[i] = scanner.nextInt();
        }

        System.out.println(mostTax(income, taxes));
    }

    public static int mostTax(int[] inc, int[] tax) {
        int retval = 1;
        double maxTax = inc[0] * tax[0] / 100.0;
        for (int i = 1; i < inc.length; i++) {
            if (inc[i] * tax[i] / 100.0 > maxTax) {
                maxTax = inc[i] * tax[i] / 100.0;
                retval = i + 1;
            }
        }
        return retval;
    }
}