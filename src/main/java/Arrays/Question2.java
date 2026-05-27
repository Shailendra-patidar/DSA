package Arrays;

public class Question2 {
    public static void main(String[] args) {
        int[] x = {2,5,6,2,9};
        int k = 0;
        for (int i = 0; i < x.length-1; i++) {
            for (int j = i+1; j < x.length; j++) {
                if(x[i] == x[j]){
                    k = x[i];
                }
            }
        }
        System.out.println("Duplicate element is: "+k);
    }
}
