import java.util.*;
public class LargestUnitl0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int larger=0;
        while (true) {
            System.out.println("Enter a number('To Exit enter 0'): ");
            int number=sc.nextInt();
            if(number==0){
                break;
            }
            if(number>larger){
                larger=number;
            }
        }
        System.out.println("Largest Number is: "+larger);
    }    
}
