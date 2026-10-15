package Utils;
import java.util.Scanner;

public class Util {
    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static int getInt() {
        return scanner.nextInt();
    }

    public static String getString() {
        return scanner.nextLine();
    }

    public static int askForInt(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    public static String askForString(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public static void flush() {
        scanner.nextLine();
    }

}
