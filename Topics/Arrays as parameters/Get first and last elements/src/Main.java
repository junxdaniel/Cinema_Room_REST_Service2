import java.util.*;

public class Main {

    // write a method here
    public static int[] getFirstAndLast(int[] args) {
        int[] retval = new int[2];
        retval[0] = args[0];
        retval[1] = args[args.length - 1];
        return retval;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}