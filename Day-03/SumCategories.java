import java.util.*;
public class SumCategories {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (0 to exit): ");
        int SumOfNegativeNumbers=0;
        int SumOfPositiveEvenNumbers=0;
        int SumOfPositiveOddNumbers=0;
        while (true) {
            int num=sc.nextInt();
            if(num==0){
                break;
            }else if(num>0){
                if(num%2==0){
                    SumOfPositiveEvenNumbers+=num;
                }else{
                    SumOfPositiveOddNumbers+=num;
                }
            }else{
                SumOfNegativeNumbers+=num;
            }
        }
        System.out.println("SumOfPositiveEvenNumbers: "+SumOfPositiveEvenNumbers);   
        System.out.println("SumOfPositiveOddNumbers: "+SumOfPositiveOddNumbers);
        System.out.println("SumOfNegativeNumbers: "+SumOfNegativeNumbers);
    }
}
