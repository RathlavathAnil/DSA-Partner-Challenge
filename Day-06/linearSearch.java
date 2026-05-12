import java.util.*;
public class linearSearch {
    static boolean search(int[] arr,int target){
        for(int elemnt: arr){
            if(elemnt==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int targetElement=sc.nextInt();
        int[] arr={11,23,4,26,76,89};
        boolean result=search(arr, targetElement);
        System.out.println(result);

    }
}
