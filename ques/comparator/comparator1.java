import java.util.*;
public class comparator1 {
    public static void main(String args[]){
        //now we are doing the comparator
        int[]arr = {112,45,5125,5,12312};
        Arrays.sort(arr,(a,b)->{
            (Integer.toString(a)-Integer.toString(b)).compareTo(Integer.toString(a) + Integer.toString(b));

        });
        for(int i : arr){
            System.out.print(i+ " ");
        }
    }
}
