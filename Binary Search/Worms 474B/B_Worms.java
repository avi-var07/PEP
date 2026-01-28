import java.util.*;

class B_Worms{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter number of Elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        //System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int m = sc.nextInt();

        int labels[] = new int[m];

        for(int i=0;i<m;i++)labels[i] = sc.nextInt();


        int ps[] = new int[n];

        ps[0]=arr[0];

        for(int i=1;i<n;i++)ps[i] = ps[i-1]+arr[i];

        for(int i=0;i<m;i++){
            System.out.println(binarySearch(ps, labels[i]));
        }
        sc.close();
    }

    static int binarySearch(int arr[], int target){
        int low=0, high = arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target)return mid+1;
            else if(target<arr[mid])high=mid-1;
            else low = mid+1;
        }

        return low+1;
    }
}