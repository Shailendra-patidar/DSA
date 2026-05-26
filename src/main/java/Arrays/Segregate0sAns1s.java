package Arrays;

public class Segregate0sAns1s {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,0};
        int numberOfZeros = 0;
        for (int ele : arr){
            if (ele == 0){
                numberOfZeros++;
            }
        }
        System.out.print("Before segregation: ");
        for (int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for (int i = 0; i < numberOfZeros; i++) {
            arr[i] = 0;
        }
        for (int i = numberOfZeros; i < arr.length; i++) {
            arr[i] = 1;
        }
        System.out.print("After segregation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
