import java.util.*;
public class MinMaxnumbers {
    public static int Maxnum(int a,int b,int c){
        if(a>b&&a>c){
            return a;
        }else if(b>a&&b>c){
            return b;
        }else{
            return c;
        }
    }
    public static int Minnum(int a,int b,int c){
        if(a<b&&a<c){
            return a;
        }else if(b<a&&b<c){
            return b;
        }else{
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second number: ");
        int num2=sc.nextInt();
        System.out.println("Enter third number: ");
        int num3=sc.nextInt();
        int minresult=Minnum(num1, num2, num3);
        System.out.println("Minimum no from "+num1+","+num2+" and "+num3+" is: "+minresult);
        int maxresult=Maxnum(num1, num2, num3);
        System.out.println("Maximum no from "+num1+","+num2+" and "+num3+" is:"+maxresult);
    }
}
