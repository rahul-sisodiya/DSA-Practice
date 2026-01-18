package BinarySearch.Questions;

public class KthMissingPositiveNumber {
    static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int k = 2;
        System.out.println(findKthPositive(arr,k));


    }
    public static int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]-mid-1 < k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return k+low;
    }
}
