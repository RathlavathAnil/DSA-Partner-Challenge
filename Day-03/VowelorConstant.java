import java.util.*;;
public class VowelorConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Charcater to check(Vowel or Constant)");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.print(ch+" is a Vowel");
            }else{
                System.out.println(ch+" is COnstant Character");
            }
        }
    }   
}
