import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}