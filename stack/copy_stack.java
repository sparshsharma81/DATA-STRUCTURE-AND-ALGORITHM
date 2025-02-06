import java.util.*;
public class copy_stack {
    public static void main(String[] args) {
        //copy stack..basically coping all the elements from one stack to anothers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = sc.nextInt();
        Stack<Integer>s1 = new Stack<>();
        for(int i=0;i<n;i++){
            int x= sc.nextInt();
            s1.push(x);
        }


        System.out.println(s1);
        Stack<Integer>s2 = new Stack<>();


        while(s1.size()>0){
            int x = s1.peek();
            s2.push(x);
            s1.pop();


        }
        System.out.println(s2);
    }
}
