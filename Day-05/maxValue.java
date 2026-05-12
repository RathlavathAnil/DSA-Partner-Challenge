import java.util.*;
public class maxValue {
    static int maXvalueinarr(int[] arr){
        int maxval=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int result=maXvalueinarr(arr);
        System.out.println("Maximum Value from a array: "+result);
    }
}
