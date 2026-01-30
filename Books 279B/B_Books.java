/*When Valera has got some free time, he goes to the library to read some books. Today he's got t free minutes to read. That's why Valera took n books in the library and for each book he estimated the time he is going to need to read it. Let's number the books by integers from 1 to n. Valera needs ai minutes to read the i-th book.

Valera decided to choose an arbitrary book with number i and read the books one by one, starting from this book. In other words, he will first read book number i, then book number i + 1, then book number i + 2 and so on. He continues the process until he either runs out of the free time or finishes reading the n-th book. Valera reads each book up to the end, that is, he doesn't start reading the book if he doesn't have enough free time to finish reading it.

Print the maximum number of books Valera can read.

Input
The first line contains two integers n and t (1 ≤ n ≤ 105; 1 ≤ t ≤ 109) — the number of books and the number of free minutes Valera's got. The second line contains a sequence of n integers a1, a2, ..., an (1 ≤ ai ≤ 104), where number ai shows the number of minutes that the boy needs to read the i-th book.

Output
Print a single integer — the maximum number of books Valera can read.

Examples
InputCopy
4 5
3 1 2 1
OutputCopy
3
InputCopy
3 3
2 2 3
OutputCopy
1
 */

import java.util.*;

class B_Books{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter number of Elements: ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int arr[] = new int[n];
        //System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();


        System.out.println(count(arr, k));
        sc.close();
    }
    static long count(int arr[], int k){
        int l = 0, r= 0, n= arr.length;

        long sum = 0, ans=0;
        while(r<n){
            sum+=arr[r];
            while(sum>k){
                sum-=arr[l];
                l++;
            }
            ans = Math.max(ans, r-l+1);
            r++;
        }
        return ans;
    }
}