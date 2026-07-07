package Recursion;

public class RecursionOnArrays {
    public static void main(String[] args) {
        int[] arr = {5,4,6,57,8,9,7,3,234,5};
        recPrint(arr,0);
    }
    public static void recPrint(int[] arr, int idx){
        if(idx == arr.length) return;
        System.out.print(arr[idx]+" ");
        recPrint(arr,idx+1);
    }

}
