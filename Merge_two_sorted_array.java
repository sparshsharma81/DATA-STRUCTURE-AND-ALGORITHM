public class Merge_two_sorted_array {
    public static void main(String[] args) {
        //merge two sorted array...
        int[] a = {2,4,6,8,9,10};
        int[] b = {1,3,5,7,11};
        //now we need to merge these two arrays..
        int[]c = new int[a.length + b.length];
        int start1 = 0;
        int start2 = 0;
        int position = 0;
        while(start1 <=a.length-1 && start2<=b.length -1){
            if(a[start1] < b[start2]){
                c[position] = a[start1];
                
                start1++;
            }
            
            else{
                c[position] = b[start2];
                
                start2++;
            }
            position++;

        }
         while (start1 < a.length) {
            c[position] = a[start1];
            start1++;
            position++;
        }
        
        while (start2 < b.length) {
            c[position] = b[start2];
            start2++;
            position++;
        }
        
        
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
            
        }

    }
}
