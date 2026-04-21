import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a country of your choice: ");
        String country = scanner.nextLine();
        scanner.close();
    }
}