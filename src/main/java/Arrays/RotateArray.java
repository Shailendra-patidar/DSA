package Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {2,5,7,4,8,1,3,6};
        for (int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int n = arr.length;
        int d = 4;
       int p = 0;
       int q = d-1;
       while(p<q){
           int temp = arr[p];
           arr[p] = arr[q];
           arr[q] = temp;
           p++;
           q--;
       }
        int a = d;
        int b = n-1;
        while(a < b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int m = 0;
        int k = n-1;
        while(m<k){
            int tempe = arr[m];
            arr[m] = arr[k];
            arr[k] = tempe;
            m++;
            k--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
