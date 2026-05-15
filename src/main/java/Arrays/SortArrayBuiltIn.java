package Arrays;

import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        int[] arr = {23,34,45,43,2,5};
        print(arr);
        Arrays.sort(arr);
        print(arr);

    }

    public static void print(int[] x){
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");

        }
        System.out.println();
    }

}
