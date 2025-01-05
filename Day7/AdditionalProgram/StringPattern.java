package Day7.AdditionalProgram;

public class StringPattern {
    public static void main(String[] args) {
        String[]str={"a","abc","bc","d"};
        String word="abc";
        int count=0;
        for(String ans:str){
            if(word.contains(ans)){
                count++;
            }
        }
        System.out.println(count);
    }
}
