package MultiDimensionalArray;

public class FindTheMinimumElementOutOfAllTheMaximumElementOfEachRow {
    public static void main(String[] args) {
        int[][] arr = {{2,5,9,3},{6,3,58,1},{0,5,4,99}};
        int sum = 0;
        int minRowElement = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                max = Math.max(max, arr[i][j]);
            }
            if(minRowElement>max){
                minRowElement = max;
            }
        }
        System.out.println(minRowElement);
    }
}
