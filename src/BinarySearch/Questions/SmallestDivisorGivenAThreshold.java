package BinarySearch.Questions;

public class SmallestDivisorGivenAThreshold {
    static void main(String[] args) {
        int arr[] = {44,22,33,11,1};
        int threshold = 5;
        int n = arr.length;
        int maxSum = 0;
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            maxSum += arr[i];
            if(arr[i]>maxValue) maxValue = arr[i];
        }
        int ans = maxValue;
        int low = 1;
        int high = maxValue;
        while (low <= high){
            int sum = 0;
            int mid = low + (high-low)/2;
            for (int j : arr) {
                if (j % mid == 0) {
                    sum += j / mid;
                } else {
                    sum += j / mid + 1;

                }
            }
           if(sum>threshold){
               low = mid+1;
           }else{
               ans = Math.min(ans,mid);
               high = mid-1;
           }

        }
        System.out.println(ans);
    }






}
