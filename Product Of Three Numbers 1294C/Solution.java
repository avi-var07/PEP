import java.util.*;

class Solution{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();
            product(n);
        }

 
        sc.close();
    }
    static void product(int n){
        int a = n, b=n,c=n;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                a=i;
                break;
            }
        }
        n/=a;

        for(int i=2;i*i<=n;i++){
            if(n%i==0&&i!=a)b=Math.min(b,i);
        }

        c = n/b;

        if(a!=b&&b!=c&&c>1){
            System.out.println("YES");
            System.out.println(a+" "+b+" "+c);
        }
        else System.out.println("NO");
    }
}