package 구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_2960 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int []number=new int[n+1];
        int count=0;
        for(int i=2;i<=n;i++){
            number[i]=i;
        }

        for(int i=2;i<=n;i++) {
            for (int j = i; j <= n; j+=i) {
                if (number[j]>0) {
                    number[j] = 0;
                    count++;
                    if (count == k) {
                        System.out.print(j);
                    }
                }else if(number[j] == 0) {
                    continue;
                }

            }
        }
    }
}
