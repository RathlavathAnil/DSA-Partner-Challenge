import java.util.*;
public class swappingNumbers {
    static void Swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Swap(arr, 0, 6);
        System.out.println(Arrays.toString(arr));
        
    }
}
