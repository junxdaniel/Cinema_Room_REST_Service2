import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int value;

        String line = scanner.nextLine();
        int n = scanner.nextInt();

        String[] elem = line.split(" ");
        value = Math.abs(Integer.parseInt(elem[0]) - n);
        list.add(Integer.valueOf(elem[0]));
        for (int i = 1; i < elem.length; i++) {
            if (Math.abs(Integer.parseInt(elem[i]) - n) == value) {
                list.add(Integer.valueOf(elem[i]));
            } else if (Math.abs(Integer.parseInt(elem[i]) - n) < value) {
                list.clear();
                list.add(Integer.valueOf(elem[i]));
                value = Math.abs(Integer.parseInt(elem[i]) - n);
            }
        }
        Collections.sort(list);
        for (Integer i : list) {
            System.out.print(i + " ");
        }

        //System.out.println(n);
    }
}