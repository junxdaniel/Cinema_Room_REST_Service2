import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        // write your code here
        long retval = 1;
        if (n == 0) {
            retval = 1L;
        } else {
            for (long i = 1; i <= n; i++) {
                retval *= i;
            }
        }
        return retval;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}