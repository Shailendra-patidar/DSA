package MultiDimensionalArray;

public class ForEachLoop {
    public static void main(String[] args) {
        int[][] arr = {{2,5,3,1},{9,4,0,7},{7,2,5,2}};
//        for (int[] ele : arr){
//            for(int e : ele){
//                System.out.print(e+" ");
//            }
//            System.out.println();
//        }

        //******************************************

        for (int i = 0; i < arr.length; i++) {
            for (int ele : arr[i]){
                System.out.print(ele);
            }
            System.out.println();
        }
    }

}
