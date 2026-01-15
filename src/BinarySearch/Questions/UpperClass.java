package BinarySearch.Questions;

public class UpperClass {
    static void main(String[] args) {
        int [] arr = {10, 23, 46, 89,91,97,107,140,140,264};
        int target = 23;
        System.out.println(lowerbound(arr,target));
    }

    public static int lowerbound(int [] arr, int target){
        int ub = arr.length, low = 0, high = ub-1 ;
        while (low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>target){
                ub = Math.min(mid, ub);
                high = mid-1;
            }else low = mid+1;
        }
        return ub;
    }
}
