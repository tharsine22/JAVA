import java.util.Scanner;
class main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a=10,b=20,c=30;
        if(a>b && a>c){
            System.out.println("a is greater");
        }
        else if (b>a && b>c){
        System.out.println("b is greater");
        }
        else{
        System.out.println("c is greater");
        }
    }
}
