import java.util.*;;
public class Productof2numbers {
    public static int productoff2num(int num1,int num2){
        return num1*num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second number: ");
        int num2=sc.nextInt();
        int result=productoff2num(num1, num2);
        System.out.println("Product of "+num1+" and "+num2+" is: "+result);
    }
}
