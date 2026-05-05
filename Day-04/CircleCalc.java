import java.util.*;
public class CircleCalc {
    public static double circumferenceofacircle(double radius){
        return 2*Math.PI*radius;
    }
    public static double areacircle(double radius){
        return Math.PI*radius*radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of a circle: ");
        double radius=sc.nextInt();

        double circumferencecal=circumferenceofacircle(radius);
        double areacal=areacircle(radius);

        System.out.println("Circumference of a circle: "+circumferencecal);
        System.out.println("Area of a Circle: "+areacal);
    }
}
