import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int n = scanner.nextInt();
        int r = 0;
        while (n != 0) {
            int digit = n % 10;          // Get last digit
            r = r * 10 + digit; // Append digit
            n = n / 10;             // Remove last digit
        }
        System.out.println("Reversed number is: " + r);
}
}
