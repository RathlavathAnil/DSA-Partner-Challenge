import java.util.*;
public class orderAgnoisticBS {
    public static void main(String[] args) {
        int[] arr1={2,3,4,5,6,7,8,9};
        int target1=6;
        System.out.println(orderAgnoisticBinarySearch(arr1, target1));
        int[] arr2={9,8,6,5,3,1,0};
        int target2=8;
        System.out.println(orderAgnoisticBinarySearch(arr2, target2));

    }
    static int orderAgnoisticBinarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=(arr[start]<arr[end]);
        while (start<=end) {
            int mid = start+ (end-start)/2;
            if(target==arr[mid]){
                return mid;
            }else if(isAsc){
                if(target<arr[mid]){
                end=mid-1;
                }
                else if(target>arr[mid]){
                start=mid+1;
                }
            }else{
                if(target<arr[mid]){
                start=mid+1;
                }else if(target>arr[mid]){
                end=mid-1;
                }
            }
            
        }
        return -1;
    }
}
