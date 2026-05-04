import java.util.*;;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Retangle Length:");
        int length=sc.nextInt();
        System.out.println("Enter Your Rectangle height: ");
        int height=sc.nextInt();
        double area=length*height;
        System.out.println("Area of Rectangle: "+area);
    }
}
