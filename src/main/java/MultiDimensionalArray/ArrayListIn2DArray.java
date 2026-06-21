package MultiDimensionalArray;

import java.util.ArrayList;

public class ArrayListIn2DArray {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5); a.add(1);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(9); b.add(0); b.add(8);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(3);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);

       // System.out.print(arr);

//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = 0; j < arr.get(i).size(); j++) {
//                System.out.print(arr.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }

        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(10); arr.get(arr.size()-1).add(20);

        for (ArrayList<Integer> lis: arr){
            for (int ele : lis){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
