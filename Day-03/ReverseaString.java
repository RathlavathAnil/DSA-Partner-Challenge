import java.util.*;
public class ReverseaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String word=sc.nextLine();
        String reversedstring="";
        for(int i=word.length()-1;i>=0;i--){
            reversedstring=reversedstring+word.charAt(i);
        }
        System.out.println("Reversed String: "+reversedstring);
    }
}
