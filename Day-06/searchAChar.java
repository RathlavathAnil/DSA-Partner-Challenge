import java.util.*;;
public class searchAChar {
    static boolean searchChar(String word,char ch){
        if(word.length()==0){
            return false;
        }
        for(char Char: word.toCharArray()){
            if(Char==ch){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine();
        char ch=sc.next().charAt(0);
        boolean result=searchChar(word, ch);
        System.out.println(result);

    }
}
