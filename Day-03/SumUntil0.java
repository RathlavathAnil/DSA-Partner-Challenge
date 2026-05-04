import java.util.*;
public class SumUntil0 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("Enter a number('To Exit enter 0'): ");
            int number=sc.nextInt();
            if(number==0){
                break;
            } 
            sum+=number;
        }
        System.out.println("Total Sum:"+sum);
    }
}
