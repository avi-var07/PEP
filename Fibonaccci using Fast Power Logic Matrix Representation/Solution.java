import java.util.*;

class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        
        System.out.println(fibo(n-1));
        sc.close();
    }
    static int fibo(int n){
        int res[][] = {{1,0},{0,1}};
        int base[][] = {{1,1},{1,0}};

        while(n>0){
            if(n%2==1)res = multiply(res,base);

            base = multiply(base, base);
            n=n>>1;
        }
        return res[0][0];

    }
    static int[][] multiply(int arr1[][], int arr2[][]){
        int a = arr1[0][0]*arr2[0][0] + arr1[0][1]*arr2[1][0];
        int b = arr1[0][0]*arr2[0][1] + arr1[0][1]*arr2[1][1];
        int c = arr1[1][0]*arr2[0][0] + arr1[1][1]*arr2[1][0];
        int d = arr1[1][0]*arr2[0][1] + arr1[1][1]*arr2[1][1];
        
        int res[][] = {{a,b},{c,d}};

        return res;

    }
}