import java.util.*;
public class Armstrongnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int original=num;
        int digits=String.valueOf(original).length();
        int sum=0;
        while (num>0) {
            int digit=num%10;
            sum+=Math.pow(digit,digits);
            num/=10;
        }
        if(original==sum){
            System.out.println(original+" is a Armstrong number.");
        }else{
            System.out.println(original+" it is not a Armstrongnumber.");
        }
    }
}
