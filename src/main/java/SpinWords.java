import java.util.ArrayList;
import java.util.List;

public class SpinWords {
    public String spinWords(String sentence){

        List<String> joinArray = new ArrayList<String>();
        StringBuilder reverseString = new StringBuilder();
        String[] words = sentence.split("\\W+");

        for (String s : words) {
            if (s.length() < 5) {
                joinArray.add(s);
            } else {
                joinArray.add(new StringBuilder(s).reverse().toString());
            }
        }

        for( String word : joinArray ) {
            if(joinArray.size() > 1){
                reverseString.append(word).append(" ");
            }else{
                reverseString.append(word);
            }
        }

        return reverseString.toString().trim();
    }
}
