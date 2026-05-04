import java.util.*;
public class FactorsOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.println(num+" Factors are: ");
        for(int i=1;i<num+1;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
