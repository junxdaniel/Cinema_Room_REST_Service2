import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String strInput = scanner.nextLine();

        String[] strArray = strInput.split(" ");

        System.out.println(isAlpha(strArray));

    }

    public  static boolean isAlpha(String[] array) {
        boolean retval = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                retval = false;
            }
        }
        return retval;
    }
}