import java.util.*;

class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the end range: ");
        int end= sc.nextInt();

        boolean ans[] = Sieve(end);

        for(int i=2;i<=end;i++)if(ans[i])System.out.print(i+" ");
        sc.close();
    }
    static boolean[] Sieve(int end){
        boolean primes[] = new boolean[end+1];
        Arrays.fill(primes, true);
    
        for(int i=2;i*i<=end;i++){
            if(primes[i]){
                for(int j=i*i;j<=end;j+=i)primes[j]=false;
            }
        }
        return primes;
    }
}