import java.util.*;
public class TriangleArea {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a height of your triangle: ");
        int height=sc.nextInt();
        System.out.println("Enter a base of oyur triangle: ");
        int base=sc.nextInt();
        double area=0.5*base*height;
        System.out.println("Area of a Triangle: "+area);
    }
}
