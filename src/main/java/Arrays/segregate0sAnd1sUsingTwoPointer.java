package Arrays;

public class segregate0sAnd1sUsingTwoPointer {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,0};
        int n = arr.length;
        int i=0;
        int j = n-1;
        while(i<j){
            if (arr[i]==1 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            } else if (arr[i]==0 && arr[j]==0) {
                i++;
            } else if (arr[i]==1 && arr[j]==1) {
                j--;
            }
            else {
                i++;
                j--;
            }
        }
        for (int e : arr){
            System.out.print(e+" ");
        }
    }
}
