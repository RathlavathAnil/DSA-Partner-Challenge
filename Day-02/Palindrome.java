import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word you want to check the it is palindromwe or not:");
        String word=sc.nextLine();
        String reversedword="";
        for(int i=word.length()-1;i>=0;i--){
            reversedword=reversedword+word.charAt(i);
        }
        if(word.equals(reversedword)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
