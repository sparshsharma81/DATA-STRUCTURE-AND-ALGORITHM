import java.util.*;
public class square_root_without_in_buildfunction {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        //1 4 9 16 24 36 49 64 81 100
        //now the logic is adding perfect square is always an odd number
        float second = (2*n) - 1;
        float first = ((n+1)*(n+1) - (n*n));
        if(first == second ){
            System.out.println("Yes");
        }
        // for(int i = 1; i<=a/2;i+=2){
        //     if(a - i = 0;)
        // }
       
        }
}
