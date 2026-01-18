package BinarySearch.Questions;

public class PeakIndexOfMountainArray {
    static void main(String[] args) {
        int arr[] = {0,10,5,2};
        System.out.println(PeakIndex(arr));
    }
    public static int PeakIndex(int[] arr){
        int low = 1;
        int high = arr.length-2;
        while(low<=high){
            int mid = low + (high- low)/2;
            if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]) return mid;
            else if (arr[mid-1]>arr[mid]) {
                high = mid-1;
            }else {
                low = mid+1;
            }

        }
        return 0;
    }
}
