// package st1;

public class number_of_words {
    public static void main(String args[]){
        String s = "hello world how are you";
        s = s.trim();
        int count =0;
        boolean isSpace = false;
        boolean isAlphabet = false;
     
        int i=0;
        while(i<s.length()){
            while(s.charAt(i) !=' '){
                i++;
                isSpace = false;
                isAlphabet = true;
               

            }
           
                count+=1;
           
            while(Character.isSpaceChar(s.charAt(i))){
                i++;
                isSpace = true;
                isAlphabet = false;
                i++;

            }
        }
        System.out.print(count);
    }
    }

