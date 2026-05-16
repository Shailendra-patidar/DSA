package Arrays;

import java.util.Arrays;

public class MissingElement {
    public static void main(String[] args) {
        int[] x = {1,2,4,3,5,6,8};
        int s = 0;
        for (int i = 0; i < x.length; i++) {
           s += x[i];
        }
        int s1 = 0;
        for (int i = 0; i<(x.length)+2;i++){
            s1 += i;
        }
        System.out.println("Missing element is: "+ (s1-s));
    }
}
