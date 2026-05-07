import java.util.*;
public class sumOfnNaturals {
    public static int sumOfFirstnNaturals(int n){
        return (n*(n+1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int result=sumOfFirstnNaturals(n);
        System.out.println("Sum of first "+n+" natural numbers is: "+result);
    }
}
