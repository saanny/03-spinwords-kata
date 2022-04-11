import java.util.ArrayList;
import java.util.List;

public class SpinWords {
    public String spinWords(String sentence){

        List<String> wordsArray = new ArrayList<String>();
        StringBuilder reverseString = new StringBuilder();
        String[] splitWords = sentence.split("\\W+");

        for (String splitWord : splitWords) {
            if (splitWord.length() < 5) {
                wordsArray.add(splitWord);
            } else {
                wordsArray.add(new StringBuilder(splitWord).reverse().toString());
            }
        }

        for( String word : wordsArray ) {
            if(wordsArray.size() > 1){
                reverseString.append(word).append(" ");
            }else{
                reverseString.append(word);
            }
        }

        return reverseString.toString().trim();
    }
}
