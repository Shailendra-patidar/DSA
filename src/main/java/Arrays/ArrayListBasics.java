package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(10);
        arr.add(15);
        System.out.println(arr.get(2)); // arr[2]
        arr.set(2,0);   // arr[2] = 0
        System.out.println(arr);

        int n = arr.size(); //arr.length
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        for (int ele : arr){
            System.out.print(ele+" ");
        }

        System.out.println();
        arr.add(78);    //20 10 0 78
        arr.add(1,30);
        arr.addFirst(50);
        arr.addLast(100);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);

        // Reverse array without using function
        int i=0;
        int j= arr.size()-1;
        while (i<j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);

    }
}
