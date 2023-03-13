import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int total;
        int hundredths;
        int tens;
        int ones;

        int number = scanner.nextInt();
        hundredths = number / 100;
        tens = (number - hundredths * 100) / 10;
        ones = number - hundredths * 100 - tens * 10;
        total = hundredths + tens + ones;
        System.out.println(total);
    }
}