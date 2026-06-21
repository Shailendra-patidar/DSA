package MultiDimensionalArray;

public class FindRowNoWithMaximumSum {
    public static void main(String[] args) {
        int[][] arr = {{2,5,4,3},{0,9,5,3},{9,6,4,7}};
        int row = -1;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            if(sum > maxsum){
                maxsum = sum;
                row = i;
            }
        }
        System.out.println("Row number with maximum sum is: "+(row+1));
        System.out.println("sum is: "+maxsum);
    }
}
