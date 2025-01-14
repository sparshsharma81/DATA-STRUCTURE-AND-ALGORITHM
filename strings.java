import java.util.*;
public class strings {
    public static void main(String args[])
        String str = "College wallah";
        System.out.println(str); //we can directly print this..not like array
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);



        //char at and length() functions in string
        //for string --- string.length()

        //in order to find the index of the string at specific position ---
        //.charAt(3) --- this will print the character at index 3

        //indexOf('character') --- this will give the index of the first occuring in String
        /*
         compareTo() --- this will give 0 if both of the strings are equal
         str.compareTo(gtr) -- this will return greater than 0 if str is lexographically greater than gtr
         str.compareTo(gtr) -- return smaller than 0 --- if str is smaller than gtr lexiographically


         .contains() -- this will
         .StartsWith() 
         .endsWith()
         .toLowerCase() 
         .toUpperCase();
         concat

         in java strings are immutable meaning that strings can not be changed
         s2.concat('abcd'); --- this line is logic less and nothing happens with it
         String s3 = s2.concat('a') --- this is valid
         in Strings --- this is valid --- str = str + '2'
         Sout("abc"+10+20) --- output -- abc1020
         Sout(10+20+"abc") --- 30abc ---  basically it goes from left to right so first 10+20 
         then it is converted to String
         str.substring(0,3) -- this will print first 2 characters of string


         generally strings are immutable but if we do like str+='b';
         this means that a new string is created and the str points towards the new string
         which increase the space compexicity 
         --we can increase this string performance using string builder--
         this is basically a type of character array...



         comparision
         str.equals() and ==


         String s1 = "Hello";
         String s2 = "Hello";

         String s3 = new String("Hello");
         sout(s1==s2) ---- this will print true;
         sout(s1==s3) --- this will print false;

         the reason behind the false of this when s1 == s2 -- it will point towards the address 
         the address of s1 and s2 are same..meaning s1 and s2 are pointing towards same address



         and when we create a new String s3 --- it will point towards a new address and s1==s3 is false
         because both of their address are different

         instead of this we use str.equals(str2)
         s1.equals(s2) -- this will check the value of string instead of address
         //this will first check the address and then if address are different then values..


         */

    
}
