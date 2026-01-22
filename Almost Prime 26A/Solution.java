/*import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int ans = 0;

        for(int i=6;i<=n;i++)if(almostPrime(i))ans++;
        
        System.out.println(ans);
        
        sc.close();
    }
    static boolean almostPrime(int n){
        int countPrime=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                if(checkPrime(i))countPrime++;
            }
        }
        if(countPrime==2)return true;

        return false;
    }
    static boolean checkPrime(int n){
        if(n==2)return true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}
    */

import java.util.*;

class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println(almostPrime(n));
        
        sc.close();
    }
    static int almostPrime(int n){
        int ans =0;
        int primes[] = new int[n+1];

        for(int i=2;i<=n;i++){
            if(primes[i]==0){
                for(int j=i;j<=n;j+=i)primes[j]++;
            }
        }

        for(int ele: primes)if(ele==2)ans++;

        return ans;
    }
} 