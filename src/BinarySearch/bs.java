package BinarySearch;

public class bs {
    static void main(String[] args) {
        int [] arr = {10, 23, 46, 89,91,97,107,140,140,264};
        int target = 264;
        System.out.println(binarySeach(arr,target));
    }

    public static int binarySeach(int [] arr, int target){

        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid]<target) low = mid+1;
            else high = mid-1;
        }


        return -1;
    }

}
