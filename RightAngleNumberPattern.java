import java.util.Scanner;
public class RightAngleNumberPattern {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter no of rows:");
    int a = sc.nextInt();
    for(int i=1;i<=a;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    sc.close();
    }
}
