package easy;

import java.util.*;

/**
 * Created by lenovo on 2017/3/24.
 */
public class Solution500 {
    public static void main(String args[]){
        String [] words = {"Hello", "Alaska", "Dad", "Peace"};
        String [] result = findwords(words);
        for(int i =0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    private static Set<String> line1 = new HashSet<String>(){
        {
            add("q");
            add("w");
            add("e");
            add("r");
            add("t");
            add("y");
            add("u");
            add("i");
            add("o");
            add("p");
            add("Q");
            add("W");
            add("E");
            add("R");
            add("T");
            add("Y");
            add("U");
            add("I");
            add("O");
            add("P");
        }
    };

    private static Set<String> line2 = new HashSet<String>(){
        {
            add("a");
            add("s");
            add("d");
            add("f");
            add("g");
            add("h");
            add("j");
            add("k");
            add("l");
            add("A");
            add("S");
            add("D");
            add("F");
            add("G");
            add("H");
            add("J");
            add("K");
            add("L");
        }
    };

    private static Set<String> line3 = new HashSet<String>(){
        {
            add("z");
            add("x");
            add("c");
            add("v");
            add("b");
            add("n");
            add("m");
            add("Z");
            add("X");
            add("C");
            add("V");
            add("B");
            add("N");
            add("M");
        }
    };


    /**
     * methord1
     * @param words
     * @return
     */
    public static String[] findwords(String[] words){
        Set[] directory = {line1, line2, line3};
        List<String> resultList = new ArrayList<String>();
        for(String oneWord : words){
            int len = oneWord.length();
            if(len > 0){
                int index = -1;
                for(int i = 0; i < directory.length; i++){
                    if(directory[i].contains("" + oneWord.charAt(0))){
                        index = i;
                        break;
                    }
                }

               if(index >= 0){
                   boolean cont = true;
                   for(int j = 1; j < oneWord.length(); j ++){
                       if(!directory[index].contains("" + oneWord.charAt(j))){
                           cont = false;
                       }
                   }
                   if(cont == true){
                       resultList.add(oneWord);
                   }
               }else{
                   break;
               }

            }
        }

        String[] resultArr = new String[resultList.size()];
        resultArr =(String[]) resultList.toArray(resultArr);
        return resultArr;
    }

    public static String[] findwords2(String[] words){
        List<String> resultList = new ArrayList<String>();
        String[] resultArr = new String[resultList.size()];
        resultArr =(String[]) resultList.toArray(resultArr);
        return resultArr;
    }
}
