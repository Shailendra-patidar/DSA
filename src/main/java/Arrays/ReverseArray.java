package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        int n = arr.length;
        int i = 0, j = n-1;
        System.out.print("Before array:");
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println();
        System.out.print("Reverse array: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+ " ");
        }
    }
}
