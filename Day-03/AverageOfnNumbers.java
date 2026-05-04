import java.util.*;;
public class AverageOfnNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int num=sc.nextInt();
        double sum=0;
        for(int i=1;i<num+1;i++){
            System.out.print("Enter "+i+" number: ");
            int n=sc.nextInt();
            sum+=n;
        }
        double avg=sum/num;
        System.out.println("Average of "+num+" numbers are: "+avg);
    }
}
