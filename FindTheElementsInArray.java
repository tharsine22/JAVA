import java.util.Scanner;
public class FindElementInArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(i + "- " + arr[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
        sc.close();
    }
}
