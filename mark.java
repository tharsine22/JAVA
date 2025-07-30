import java.util.Scanner;
class main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mark");
        int a = sc.nextInt();
        if(a<=40){
            System.out.println("fail");
        }
        else if (a>41 && a<=60){
        System.out.println("average");
        }
        else if (a>61 && a<=80){
        System.out.println("good");
        }
        else if (a>81 && a<=100){
        System.out.println("best");
        }
        else{
        System.out.println("invalid");
        }
    }
}      
