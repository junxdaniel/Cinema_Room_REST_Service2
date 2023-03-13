import java.util.*;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        // write your code here
        String[] myNumbers;
        myNumbers = str.split(" ");
        HashSet<Integer> mySet = new HashSet<>();
        for (String eachNumber : myNumbers) {
            mySet.add(Integer.parseInt(eachNumber));
        }
        return mySet;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        // write your code here
        set.removeIf(n -> n > 10 == true);
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
        /**
         System.out.println(java.lang.Thread.MIN_PRIORITY);
        System.out.println(java.lang.Thread.MAX_PRIORITY);
        System.out.println(java.lang.Thread.NORM_PRIORITY);
         */
    }
}