import java.util.*;
public class searchRange {
    static boolean searchinRange(int[] arr,int target,int start,int end){
        for(int index=start;index<=end;index++){
            int element=arr[index];
            if(element==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={12,354,46,6,78};
        int target=12;
        System.out.println(searchinRange(arr, target, 2, 4));
    }
}
