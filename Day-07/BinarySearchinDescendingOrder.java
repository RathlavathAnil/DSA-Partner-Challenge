public class BinarySearchinDescendingOrder {
    public static void main(String[] args) {
        int[] arr={41,39,35,32,29,27,24,18,16,13,10,8,5,2,0,-1};
        int target=0;
        System.out.println(binarySearchDesecendingOrder(arr, target));
    }
    static int binarySearchDesecendingOrder(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                start=mid+1;
            }else if(target>arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
