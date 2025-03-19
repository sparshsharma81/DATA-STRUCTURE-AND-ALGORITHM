import java.util.*;
public class Main {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int[]arr = new int[a-1];
            long sum = (long) a*(a+1)/2;
            long givesum = 0;
            for(int i =0;i<a-1;i++){
                arr[i] = sc.nextInt();
            }
            for(int i =0;i<a-1;i++){
                givesum+=arr[i];
            }
            long n = sum - givesum;
            System.out.print(n);
            sc.close();
    }
}
