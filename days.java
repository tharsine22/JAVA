import java.util.Scanner;
class main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        switch(a) {
        case 1:
            System.out.println("it is monday");
            break;
         case 2:
            System.out.println("it is tuesday");
            break;
         case 3:
            System.out.println("it is wednesday");
            break;
         case 4:
            System.out.println("it is thursday");
            break;
         case 5:
            System.out.println("it is friday");
            break;
         case 6:
            System.out.println("it is saturday");
            break;
         case 7:
            System.out.println("it is sunday");
            break;
        default:
            System.out.println("invalid");
            break;
        }
    }
}
