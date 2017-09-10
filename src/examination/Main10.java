package examination;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/10.
 * 平方根问题
 */
public class Main10 {

    public static void main(String[] args){
        int MAX = 100000;
        int[] dp = new int[MAX];
        int[] p = new int[MAX];
        int s[] = new int[MAX];

        dp[1]=1; dp[0]=0;
        for(int i=2;i<MAX;i++){
            double m=(double)i;
            double k = Math.ceil(Math.pow(m, 1.0 / 2));

            if(Math.pow(k,2.0)==m) dp[i]=1;
            dp[i]+=dp[i-1];
        }

        for(int i=0;i<MAX;i++){
            s[i]=0;
        }
        for(int i=2;i*i<MAX;i++){
            if(s[i] == 0){
                for(int j=2;j*i<MAX;j++ )
                    s[i*j]=1;
            }
        }
        int num=0;
        for(int i=2;i<MAX;i++){
            if(s[i] == 0) p[num++]=i;
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int sum=dp[m];
        for(int i=2;i<=n;i++){
            if(s[i] == 0) {
                if(i>m) continue;
                sum += dp[m/i];
                continue;
            }
            int d=i,r=1;
            for(int j=0;p[j]*p[j]<=d;j++){
                int f=0;
                while(d%p[j]==0){
                    f++;
                    d/=p[j];
                }
                if(f%2 == 1) {
                    r*=p[j];
                }
            }
            if(d>1) r*=d;
            if(r>m) continue;
            sum += dp[m/r];
        }
        System.out.println(sum);
    }
}
