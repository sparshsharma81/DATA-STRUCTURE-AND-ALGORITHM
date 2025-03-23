public class remove_consecutive_word {
    public static String reverse(String s){
        StringBuilder str= new StringBuilder(s);
        return str.reverse().toString();
    }
    public static void main(String args[]){
        //reversing consecutive same words from a paragraph output the number of words hat remain in paragraph
        String s = "ab aa aa bcd ab";
        String[] str = s.split("\\s+");
        StringBuilder str1= new StringBuilder();
        for(String st : str){
            str1.append(reverse(st)).append(" ");
        }
        System.out.println(str1);


    }
}
