import java.util.*;
public class array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int low = sc.nextInt();
        
        int high = sc.nextInt();
        int[]arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
       




        int firstdiff = arr[0] - low;
        int lastdiff = high -arr[arr.length-1];
                            if(firstdiff >1){
                                    System.out.print(firstdiff + " "+ (arr[0] - 1));
                                }
        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i + 1] - arr[i] > 1) {
                System.out.println((arr[i] + 1) + " " + (arr[i + 1] - 1));
            }

        }
                            if(lastdiff > 1){
                            System.out.println((arr[arr.length-1] + 1) + " " + high);
                            }

        //0 1 2 6 75 
       


    }
}