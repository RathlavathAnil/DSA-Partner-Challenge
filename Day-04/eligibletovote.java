import java.util.*;;
public class eligibletovote {
    public static String voteEligibleCheck(int age){
        if(age>=18){
            return "Your Eligible to Vote";
        }else{
            return "Your not Eligible to Vote";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        String result=voteEligibleCheck(age);
        System.out.println(result);
    }
}
