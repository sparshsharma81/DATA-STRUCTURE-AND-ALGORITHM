public class String_builder {
    public static void main(String[] args) {
        
        //it works on character array
        //StringBuilder();
        /*
         StringBuilder(String str);
         StringBuilder(int capacity);


         */
        StringBuilder str = new StringBuilder(16);
        //in this we will enter the capacity of our string
        //java -- strings are immutable whereas StringBuilder are mutable
        str.append("java coding");

        str.setCharAt(0, 'a');
        System.out.println(str);
    }
}
