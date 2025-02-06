import java.util.*;
class bottom_index{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = sc.nextInt();
        Stack<Integer>s1 = new Stack<>();
        for(int i=0;i<n;i++){
            int x= sc.nextInt();
            s1.push(x);
        }


        System.out.println(s1);
        // Stack<Integer>s2 = new Stack<>();


        // while(s1.size()>0){
        //     int x = s1.peek();
        //     s2.push(x);
        //     s1.pop();


        // }
        // System.out.println(s2);


        System.out.println("Now inserting.....");
        Stack<Integer>s3 = new Stack<>();
        int y = sc.nextInt();
        while(s1.size()>y){
            s3.push(s1.pop());

        }
        int x2 = sc.nextInt();
        s1.push(x2);

        while(s3.size()>0){
            s1.push(s3.pop());
        }
        System.out.println(s1);
    }
}