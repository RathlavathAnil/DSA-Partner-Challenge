import java.util.*;
public class ParallelogramArea {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base of parallelogram: ");
        int base=sc.nextInt();
        System.out.println("Enter height of parallelogram: ");
        int height=sc.nextInt();
        int area=base*height;
        System.out.println("Area of a Parallelogram: "+area);
    }
}
