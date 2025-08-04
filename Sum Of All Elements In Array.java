public class SumOfAllElementsInArray{
    public static void main(String[] args){
        int[] num={10,70,50,40,70};
        int sum=num[0];  
        for (int i = 1; i < num.length; i++) {
        sum += num[i];
        }
        System.out.println("The sum of all elements in the array is:"+sum);
    }
}
