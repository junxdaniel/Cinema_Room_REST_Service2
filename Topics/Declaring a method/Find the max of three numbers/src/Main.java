import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        int retval;
        if (a >= b) {
            if (a >= c) {
                retval = 1;
            } else {
                retval = 3;
            }
        } else if (b >= c) {
            retval = 2;
        } else {
            retval = 3;
        }
        return retval;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}