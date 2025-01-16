public class String_builder {
    public static void main(String[] args) {
        
        //it works on character array
        //StringBuilder();
        /*
         StringBuilder(String str);
         StringBuilder(int capacity);


         */
        StringBuilder str = new StringBuilder(26);
        //in this we will enter the capacity of our string
        //java -- strings are immutable whereas StringBiuilder are mutable
        str.append("java coding"); 
        

        str.setCharAt(0, 'a');
        str.setCharAt(1, 'd');
        str.insert(2,'a');
        // str.delete(0, 2);
        System.out.println(str);
    }
}
