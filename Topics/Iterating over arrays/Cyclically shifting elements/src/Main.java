import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }

        cycArray(arr);
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]);
            System.out.print(' ');
        }

    }

    public static void cycArray(int[] arr) {
        int temp;
        temp = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
    }
}