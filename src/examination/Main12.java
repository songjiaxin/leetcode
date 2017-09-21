package examination;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/18.
 * 200000个字符串，计算包含u51的个数
 */
public class Main12 {
    public static void main(String args[]) throws Exception{
        Scanner scan=new Scanner(System.in);
        String[] strArr= new String[200000];

        int i = 0;
        while (scan.hasNext()){
            strArr[i] = scan.nextLine();
            i++;
        }
        count c1 = new count(0, i, strArr);
        count c2 = new count(1, i, strArr);
        count c3 = new count(2, i, strArr);
        c1.start();
        c2.start();
        c3.start();
        c1.join();
        c2.join();
        c3.join();
        System.out.println(c1.getNum() + c2.getNum() + c3.getNum());

    }
}

class count extends Thread{
    public int start;
    public int end;
    public String[] strArr;
    public int num = 0;
    public count(int start, int end, String[] strArr){
        super();
        this.start = start;
        this.end = end;
        this.strArr = strArr;
    }
    int isWant(String str){
        if(str.indexOf("u51") != -1){
            return 1;
        }else {
            return 0;
        }
    }

    public void run(){
        for(int i = start; i <end; i+=3){
            num += isWant(strArr[i]);
        }
    }

    public int getNum(){
        return num;
    }
}