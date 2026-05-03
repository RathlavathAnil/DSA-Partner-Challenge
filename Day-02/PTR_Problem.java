import java.util.Scanner;;
public class PTR_Problem {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal:");
        int principal=sc.nextInt();
        System.out.println("Enter Time in years:");
        int time=sc.nextInt();
        System.out.println("Enter rate of intrest:");
        int rate=sc.nextInt();
        int result=(principal*time*rate)/100;
        System.out.println(result);
    }
}
