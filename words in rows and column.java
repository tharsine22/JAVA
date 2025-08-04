import java.util.Scanner;
public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        String[] words = sentence.split(" ");
        int count = 0;
        for (String word : words) {
            System.out.print(word + "\t");
            count++;
            if (count % columns == 0 && count % rows == 0) {
                System.out.println();
            }
        }
        scanner.close();
    }
}
