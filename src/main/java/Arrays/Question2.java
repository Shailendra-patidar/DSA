package Arrays;

public class Question2 {
    public static void main(String[] args) {
        int[] x = {2,5,6,5,9};
//        int k = x[0];
        //Approach 1
//        for (int i = 0; i < x.length-1; i++) {
//            for (int j = i+1; j < x.length; j++) {
//                if(x[i] == x[j]){
//                    k = x[i];
//                }
//            }
//        }
//        System.out.println("Duplicate element is: "+k);

        //Approach 2
//        for (int i = 0; i < x.length-1; i++) {
//            if (x[i+1] == k){
//                k = x[i+1];
//                break;
//            }
//            else{
//                k = x[i];
//            }
//        }
//        System.out.println("Duplicate element is: "+ k);

        //Approach 3
//        int i = 0;
//        int j = x.length-1;
//        while(i<j){
//            if (x[i] == x[j]){
//                System.out.println("Duplicate Element is: "+x[i]);
//            }
//            i++;
//            j--;
//        }
    }
}
