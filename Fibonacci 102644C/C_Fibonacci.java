import java.util.*;

public class C_Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        long n = sc.nextLong();

        System.out.println(fibo(n));
        sc.close();
    }
    static long fibo(long n){
        if(n==0||n==1)return n;
        long res[][] = {{1,0},{0,1}};
        long base[][] = {{1,1},{1,0}};
        n=n-1;
        while(n>0){
            if(n%2==1)res=multiply(res,base);

            base = multiply(base, base);
            n=n>>1;
        }
        return res[0][0];
    }
    static long[][] multiply(long arr1[][], long arr2[][]){
        int MOD = 1000000007;
        long a = (arr1[0][0]*arr2[0][0]%MOD+ arr1[0][1]*arr2[1][0]%MOD)%MOD;
        long b = (arr1[0][0]*arr2[0][1]%MOD +arr1[0][1]*arr2[1][1]%MOD)%MOD;

        long c = (arr1[1][0]*arr2[0][0]%MOD+arr1[1][1]*arr2[1][0]%MOD)%MOD;
        long d = (arr1[1][0]*arr2[0][1]%MOD +arr1[1][1]*arr2[1][1]%MOD)%MOD;

        long res[][] = {{a,b},{c,d}};
        return res;
    }
}

