import java.util.Scanner;
public class UserInputExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = input.nextInt();
        System.out.print("Enter second number:");
        int b = input.nextInt();
        int value = a + b; 
        System.out.println("The value:" + value);
        input.close();
    }
}
