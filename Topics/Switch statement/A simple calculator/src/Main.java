import javax.swing.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String word1 = scanner.nextLine();
        String[] elements = word1.split(" ");
        long number1 = Long.valueOf(elements[0]);
        long number2 = Long.valueOf(elements[2]);
        switch (elements[1]) {
            case "+":
                System.out.println(number1+number2);
                break;
            case "-":
                System.out.println(number1-number2);
                break;
            case "/":
                if (number2 == 0) System.out.println("Division by 0!");
                else System.out.println(number1/number2);
                break;
            case "*":
                System.out.println(number1*number2);
                break;
            default:
                System.out.println("Unknown operator");
                int q = 'q';  // 1
                char ch2 = q; // 2
                short s = 1;  // 3
                char ch3 = s; // 4
        }
    }
}