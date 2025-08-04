public class FindTheElementsInArray{
    public static void main(String[] args){
        int[] num={10,20,30,40};
        int sum = num[0];  
        for (int i = 1; i < num.length; i++) {
            if(num[i]==30){
                System.out.print(i+ "- " + num[i]);
            }
        }
    }
}
