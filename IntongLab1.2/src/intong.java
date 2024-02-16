import java.util.Scanner;

public class intong {
    public static boolean hello(String message) {
        String[] words = message.split("\\s+");
        for (String word : words) {
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return true;
                } }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the message: ");
        String message = scan.nextLine();
        if (hello(message)) {
            System.out.println("JEJE!");
        } else { System.out.println("uWu");
        }
    }
}