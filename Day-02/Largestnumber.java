import java.util.Scanner;
public class Largestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println(num1+" Greater than "+num2);
        }else if(num2>num1){
            System.out.println(num2+" Greater than "+num1);
        }else{
            System.out.print("Both are equal numbers");
        }
    }
}
