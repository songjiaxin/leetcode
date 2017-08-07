package easy;

/**
 * Created by lenovo on 2017/7/26.
 */
public class Solution557 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String newString = "";
        for(int j = 0; j < words.length; j++){
            char[] charArr = words[j].toCharArray();
            String newWord = "";
            for(int i = charArr.length - 1; i >= 0; i--){
                newWord += charArr[i];
            }
            newString += newWord + " ";
        }

        return newString.trim();
    }
}
