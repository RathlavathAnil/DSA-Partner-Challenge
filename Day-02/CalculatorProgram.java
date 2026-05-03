import java.util.Scanner;
public class CalculatorProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number:");
        int num1=sc.nextInt();
        System.out.print("Enter your Second Number:");
        int num2=sc.nextInt();
        System.out.print("Enter corrrect operator(+,-,*,/,%): ");
        char op=sc.next().charAt(0);
        int result=0;
        if(op=='+'){
            result=num1+num2;
        }else if(op=='-'){
            result=num1-num2;
        }else if(op=='*'){
            result=num1*num2;
        }else if(op=='/'){
            result=num1/num2;
        }else if(op=='%'){
            result=num1%num2;
        }else{
            System.out.println("Your entered wrong Operator.Choose corrrect operator(+,-,*,/,%)");
        }
        System.out.print("Result="+ result);
    }
}
