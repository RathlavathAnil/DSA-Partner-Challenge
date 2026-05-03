import java.util.Scanner;
public class IndianRupeestoUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you IndianRupeesAmount:");
        int IndianRupee=sc.nextInt();
        double USD=IndianRupee/83.3;
        System.out.println(IndianRupee+" In US Dollars "+USD);
    }
}
