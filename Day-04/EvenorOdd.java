import java.util.*;
public class EvenorOdd {
    public static String EvenorOddnum(int a){
        if(a==0){
            return "zero";
        }else  if(a%2==0){
            return "even";
        }else{
            return "odd";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        String result=EvenorOddnum(num);
        System.out.println(num+" number is: "+result);
    }
}
