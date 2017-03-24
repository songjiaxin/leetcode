package easy;

/**
 * Created by lenovo on 2017/3/23.
 */
public class Solution476 {
    public static void main(String args[]){
        int input = 5;
        int output = findComplement2(input);
        System.out.print(output);

    }

    public static int findComplement(int num){
        String a = Integer.toBinaryString(num);
        String b = Integer.toBinaryString(~num);
        int aLen = a.length();
        int bLen = b.length();

        String c = b.substring(bLen - aLen, bLen);
        int result = Integer.parseInt(c, 2);

        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);
        return result;
    }

    public static int findComplement2(int num){
        //System.out.println(Integer.toBinaryString(~num));
        //System.out.println(Integer.toBinaryString(Integer.highestOneBit(num)));

        int result =~num & (Integer.highestOneBit(num) << 1) -1;
        return result;
    }
}
