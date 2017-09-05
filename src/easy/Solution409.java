package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenovo on 2017/8/26.
 */
public class Solution409 {
    public int longestPalindrome(String s) {
        char[] charArr = s.toCharArray();
        int[] lowercase = new int[26];
        int[] uppercase = new int[26];
        for(char c : charArr){
            if(c >= 'a' && c <= 'z'){
                lowercase[c - 'a'] ++;
            }
            if(c >= 'A' && c <= 'Z'){
                uppercase[c - 'A'] ++;
            }
        }

        int even = 0;
        int odd = 0;

        for(int num : lowercase){
            even += num / 2;
            if(num % 2 > 0){
                odd = 1;
            }
        }

        for(int num : uppercase){
            even += num / 2;
            if(num % 2 > 0){
                odd = 1;
            }
        }

        return 2 * even + odd;

    }

    public int longestPalindrome2(String s) {
        char[] charArr = s.toCharArray();
        Set<Character> charSet = new HashSet<Character>();
        int num = 0;
        for(char c : charArr){
            if(charSet.contains(c)){
                num += 2;
                charSet.remove(c);
            }else {
                charSet.add(c);
            }
        }

        if(charSet.size() > 0){
            num ++;
        }

        return num;
    }
}
