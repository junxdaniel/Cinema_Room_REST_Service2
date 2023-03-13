import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int[] box1 = new int[3];
        int[] box2 = new int[3];
        for (int i = 0; i < 3; i++) {
            box1[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            box2[i] = scanner.nextInt();
        }

        System.out.println(compBox(box1, box2));
    }

    public static String compBox(int[] b1, int[] b2) {
        String retval;

        arrySort(b1);
        arrySort(b2);

        if (b1[0] < b2[0] && b1[1] < b2[1] && b1[2] < b2[2]) {
            retval = "Box 1 < Box 2";
        } else if (b1[0] > b2[0] && b1[1] > b2[1] && b1[2] > b2[2]) {
            retval = "Box 1 > Box 2";
        } else {
            retval = "Incompatible";
        }
        return retval;
    }

    public static void arrySort(int[] arry) {
        int temp;
        for (int i = 0; i < arry.length - 1; i++) {
            for (int j = i + 1; j < arry.length; j++) {
                if (arry[i] > arry[j]) {
                    temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;
                }
            }
        }
    }

}