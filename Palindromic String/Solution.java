import java.util.*;

class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        System.out.println(palindrome(s.toLowerCase().toCharArray(), 0, s.length()-1));
        sc.close();
    }

    static boolean palindrome(char str[], int left, int right){
        if(left>=right)return true;

        if(str[left]!=str[right])return false;
        
        return palindrome(str, left++, right--);
    
    }
}

