import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.next().charAt(0);
        char secondChar = (char) ((int) firstChar - 32);
        System.out.println(secondChar);
    }
}
