package BinarySearch.Questions;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
    static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7};
        int x = 5;
        int k = 2;

        System.out.println(FindClosetElements(arr,2,5));

    }
    public static List<Integer> FindClosetElements(int arr[], int k , int x){

        int low = 0;
        int high = arr.length-k;

        while(low<high){
            int mid = low+(high-low)/2;
            if(x-arr[mid]>arr[mid+k]-x){
                low = mid+1;
            }else{
                high = mid;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i<k; i++){
            ans.add(arr[low+i]);
        }
        return ans;




    }
}
