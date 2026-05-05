import java.util.*;;
public class SumOf2numbers {
    public static int Sumof2num(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second number: ");
        int num2=sc.nextInt();
        int result=Sumof2num(num1, num2);
        System.out.println("Sum of "+num1+" and "+num2+" is: "+result);
    }
}
