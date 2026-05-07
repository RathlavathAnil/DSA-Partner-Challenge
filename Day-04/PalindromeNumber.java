import java.util.*;
public class PalindromeNumber {
    public static boolean isPalindrome(int n){
        int original=n;
        int reversed_num=0;
        while(n>0){
            int digit=n%10;
            reversed_num=reversed_num*10+digit;
            n=n/10;
        }
        return reversed_num==original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        if(isPalindrome(n)){
            System.out.println(n+" is a Palindrome Number");
        }else{
            System.out.println(n+" is not a Palindrome Number");
        }
    }
}
