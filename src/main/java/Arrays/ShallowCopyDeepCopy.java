package Arrays;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        // Shallow copy
        int[] arr = {10,34,56,43};
//        int[] x = arr;
//        x[0] = 100;
//        System.out.println(arr[0]);


        System.out.println("******************************************");
        //deep copy
        int[] deep = Arrays.copyOf(arr,arr.length);
        deep[0] = 100;
        System.out.println(deep[0]);
        System.out.println(arr[0]);

    }
}
