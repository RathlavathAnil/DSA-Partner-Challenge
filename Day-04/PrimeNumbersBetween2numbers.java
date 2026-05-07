import java.util.*;
public class PrimeNumbersBetween2numbers {
    public static boolean isPrime(int n){
        if (n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to check: ");
        int start=sc.nextInt();
        System.out.println("Enter a number until you want to check: ");
        int end=sc.nextInt();
        System.out.println("Prime numbers between from "+start+" to "+end+": ");
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
}
