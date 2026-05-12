import java.util.*;
public class minValue {
    static int minvalueinarr(int[] arr){
        int minval=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minval){
                minval=arr[i];
            }
        }
        return minval;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int result=minvalueinarr(arr);
        System.out.println("Minimum Value from a array: "+result);
    }
}
