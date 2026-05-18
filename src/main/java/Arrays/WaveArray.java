package Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8};
        for (int i = 0; i < arr.length-1; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for (int e : arr){{
            System.out.print(e+" ");
        }}
    }
}
