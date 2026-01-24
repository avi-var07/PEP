import java.util.*;

class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println(power(n));
       

        sc.close();
    }
    static int power(int n){
        int res =1, base = 2;
        while(n>0){
            if(n%2==1)res*=base;

            base*=base;
            n=n>>1;
        }
        return res;
    }
}