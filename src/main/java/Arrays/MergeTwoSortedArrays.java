package Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,9};
        int[] b = {3,5,7,10,13,17};
        int[] c = new int[a.length+b.length];
       merge(c,a,b);
       for (int ele : c){
           System.out.print(ele+" ");
       }
    }

public  static  void merge(int[] c, int[] a, int[] b){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                c[k++] = a[i++];
            }
            else {
                c[k++] = b[j++];
            }
        }
        while(i< a.length){
            c[k++] = a[i++];
        }
        while (j<b.length){
            c[k++] = b[j++];
        }
}

}
