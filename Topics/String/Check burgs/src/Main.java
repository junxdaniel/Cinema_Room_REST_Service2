import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String city = scanner.nextLine();

        System.out.println(city.endsWith("burg"));
    }
}