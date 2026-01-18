package BinarySearch.Questions;

public class MinimizedMaximumofProductsDistributedtoAnyStore {
    static void main(String[] args) {
        int n = 7;
        int [] arr = {15,10,10};
        System.out.println(minimizedMaximum(n,arr));

    }
    public static int minimizedMaximum(int n, int[] arr) {
        int m = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<m; i++){
            if(max<arr[i]) max = arr[i];
        }
        int low = 1, high = max;
        int ans = max;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(check(arr,mid,n)){
                ans = Math.min(ans,mid);
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;


    }
    public static boolean check(int [] arr, int mid , int n){
        int count = 0;
        for(int i = 0; i< arr.length ;i++){

            count += (arr[i]+mid-1)/mid;
        }
        return count<=n;
    }
}
