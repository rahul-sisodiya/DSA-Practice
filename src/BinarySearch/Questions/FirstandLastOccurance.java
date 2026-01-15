package BinarySearch.Questions;

import java.util.Arrays;

public class FirstandLastOccurance {
    static void main(String[] args) {
        int arr [] = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr,target)));



    }

        public static int[] searchRange(int[] arr, int target) {
            int ans[] = {-1,-1};

            int fp = -1;
            int low = 0;
            int high = arr.length -1;

            while(low<=high){
                int mid = low+(high-low)/2;
                if(arr[mid] == target){
                    if(mid == 0) {
                        fp = 0;
                        break;
                    }
                    if(arr[mid] == arr[mid-1]){
                        high = mid-1;
                    }else{
                        fp = mid;
                        break;
                    }
                }else if(arr[mid]>target){
                    high = mid-1;
                }else if(arr[mid]<target){
                    low = mid+1;
                }
            }
            ans[0] = fp;
            low = fp;
            if(fp == -1) return ans;
            high = arr.length-1;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(arr[mid] == target){
                    if(mid ==arr.length-1) {
                        fp = mid;
                        break;
                    }
                    if(arr[mid] == arr[mid+1]){
                        low = mid+1;
                    }else{
                        fp = mid;
                        break;
                    }
                }else if(arr[mid]>target){
                    high = mid-1;
                }else if(arr[mid]<target){
                    low = mid+1;
                }
            }

            ans[1] = fp;
            return ans;

        }

}
