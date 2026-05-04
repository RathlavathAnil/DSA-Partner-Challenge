import java.util.*;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of Units: ");
        int units=sc.nextInt();
        double bill=0;
        if(units<=100){
            bill=units*5;
        }else if(units<300){
            bill=(100*5)+(units-100)*7;
        }else{
            bill=(100*5)+(200*7)+(units-300)*10;
        }
        System.out.println("Total Electricity Bill: "+bill);
    }
}
