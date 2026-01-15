package BinarySearch.Questions;

public class LowerBound {
    static void main(String[] args) {
        int [] arr = {10, 23, 46, 89,91,97,107,140,140,264};
        int target = 2;
        System.out.println(lowerbound(arr,target));
    }
    public static int lowerbound(int[] arr, int target){
        int lb = arr.length, low = 0, high = lb-1;

        while(low<=high){
            int mid = (high-low)/2+low;

            if(arr[mid]>= target){
                high = mid-1;
                lb = Math.min(lb,mid);
            }else{
                low = mid+1;
            }
        }
        return lb;

    }
}
