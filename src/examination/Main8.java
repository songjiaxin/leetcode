package examination;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by lenovo on 2017/9/10.
 * 括号匹配深度
 */
public class Main8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        int deep = 0;
        int max = 0;
        for(char c : arr){
            if(c == '('){
                stack.push('(');
                deep = deep + 1;
                if(deep > max){
                    max = deep;
                }
            }else if(c == ')'){
                stack.pop();
                deep--;
            }
        }
        System.out.println(max);
    }
}
