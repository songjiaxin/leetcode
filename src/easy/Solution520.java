package easy;

/**
 * Created by lenovo on 2017/8/6.
 */
public class Solution520 {
    public boolean detectCapitalUse(String word) {
        char[] charArr = word.toCharArray();
        if(word.length() <= 1){
            return true;
        }

        char c = charArr[0];
        char[] restArr = word.substring(1, word.length()).toCharArray();
        if((isCapital(c) && (allCapital(restArr) || allNotCapital(restArr))) || !isCapital(c) && allNotCapital(restArr)){
            return true;
        }else {
            return false;
        }

    }

    boolean isCapital(char c){
        if(c >= 'A' && c <= 'Z'){
            return true;
        }else {
            return false;
        }
    }

    boolean allCapital(char[] charArr){
        for(char c : charArr){
            if(!isCapital(c)){
                return false;
            }
        }
        return true;
    }

    boolean allNotCapital(char[] charArr){
        for(char c : charArr){
            if(isCapital(c)){
                return false;
            }
        }
        return true;
    }

}
