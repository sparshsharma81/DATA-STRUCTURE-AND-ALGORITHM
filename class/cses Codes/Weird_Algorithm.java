// package DATA-STRUCTURE-AND-ALGORITHM.class.cses Codes;

import java.math.BigInteger;
import java.util.*;

public class Weird_Algorithm {

    public static void odd(long a){
       System.out.print((a*3)+1);
    }
    public static void even(long a){
        // return a/2;
        System.out.print(a/2);
    }
    
    public static void main(String args[]){
                               //now this is weird algorithm question

                                                /*
                                                Weird Algorithm

                                        Task
                                        Submit
                                        Results
                                        Statistics
                                        Tests

                                            
                                            
                                        

                                        

                                            


                                        CSES - Weird Algorithm




                                        addEventListener("DOMContentLoaded", function (e) {
                                            const mathElements = document.getElementsByClassName("math");
                                            const macros = {};
                                            for (let element of mathElements) {
                                                katex.render(element.textContent, element, {
                                                    displayMode: element.classList.contains("math-display"),
                                                    throwOnError: false,
                                                    globalGroup: true,
                                                    macros,
                                                });
                                            }
                                        });


                                        Time limit: 1.00 s
                                        Memory limit: 512 MB



                                        Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
                                        $$ 3 \rightarrow 10 \rightarrow 5 \rightarrow 16 \rightarrow 8 \rightarrow 4 \rightarrow 2 \rightarrow 1$$
                                        Your task is to simulate the execution of the algorithm for a given value of n.
                                        Input
                                        The only input line contains an integer n.
                                        Output
                                        Print a line that contains all values of n during the algorithm.
                                        Constraints

                                        1 \le n \le 10^6

                                        Example
                                        Input:
                                        3

                                        Output:
                                        3 10 5 16 8 4 2 1
                                                */



         Scanner sc= new Scanner(System.in);
         long n =  sc.nextLong();

        // BigInteger b1 = new BigInteger(sc.next());
        while(n!=1){
            if(n%2 == 0) {
                System.out.print(n/2);
                n/=2;                
                // even(n);

            }
            if(n%2!=0){
                System.out.print(3*n +1);
                n = 3*n +1;

            } 
        }



    }
}
