import java.util.Locale;
import java.util.Scanner;

record Player(String username, String email) {

    public String username() {
        return username.toUpperCase(Locale.ENGLISH);
    }

    public String email() {
        return email.toLowerCase(Locale.ENGLISH);
    }
}

class OverrideTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(scanner.next(), scanner.next());
        System.out.println(player.username() + ":" + player.email());
    }


}