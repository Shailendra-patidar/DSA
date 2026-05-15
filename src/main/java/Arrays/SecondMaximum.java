package Arrays;

public class SecondMaximum {
    public static void main(String[] args) {
        int[] arr = {5,3,10,9,7,9};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> smax && arr[i]!= max) smax = arr[i];

        }
        System.out.println("Second maximum element is: "+smax);

    }
}
