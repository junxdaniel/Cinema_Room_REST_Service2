import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        // write your code here
        int maxLen = 0;
        int elem = 0;
        for (int i = 0; i < list.size(); i++) {
            if (maxLen < list.get(i).length()) {
                maxLen = list.get(i).length();
                elem = i;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(elem));
        }

        //list.replaceAll(list.get(elem));
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}