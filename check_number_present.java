
import java.util.Scanner;

public class check_number_present {
    public static void main(String[] args) {
        //now we are checking the number is present in the array or not...
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the number which you want to check:");
        int target = sc.nextInt();
        System.out.println("Great///now enter the array...");
        int [] arr = new int[a];
        boolean istrue = 0;
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] == target){
                istrue = 1;
            }
        }
        System.out.println(istrue);
        
    }
}
