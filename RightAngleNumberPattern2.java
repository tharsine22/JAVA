import java.util.Scanner;
public class RightAngleNumberPattern {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter no of rows:");
    int a = sc.nextInt();
    int n=1;
    for(int i=1;i<=a;i++){
        for(int j=1;j<=i;j++){
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
    }
    sc.close();
    }
}
