package BinarySearch.Questions;

public class SearhInRotatedSortedArray {
    static void main(String[] args) {
        int arr [] = {3,4,5,6,7,0,1,2};
        System.out.println(findInSortedArray(arr,4));
    }















    public static int findInSortedArray(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        int p = 0;
        while (low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) p = mid;
            if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]) p = mid-1;

            if(arr[mid]>arr[arr.length-1]){
                low = mid+1;
            }else if(arr[mid]<arr[arr.length-1]){
                high = mid-1;
            }


        }
        return bs(arr,target,0,p)+bs(arr,target,p+1,arr.length-1)+1;
    }
    public static int bs(int [] arr,int target, int low, int high){

        while(low<= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target) return mid;
            if(arr[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}
