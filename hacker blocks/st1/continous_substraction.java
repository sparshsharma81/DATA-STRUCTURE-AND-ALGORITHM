import java.util.*;
public interface continous_substraction {
   public static long game(int[]arr){
        if(arr.length ==0) return 0;
        List<Integer>l1 = new ArrayList<>();
        for(int num:arr){
            l1.add(num);
        }
        while(l1.size()>1){
            List<Integer>newlist = new ArrayList<>();
            for(int i=0;i<l1.size()-1;i++){
                newlist.add(l1.get(i)-l1.get(i+1));
                
            }
            l1 = newlist;
        }
        return l1.get(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();           

        }
        System.out.print(game(arr));
        
    }
}
