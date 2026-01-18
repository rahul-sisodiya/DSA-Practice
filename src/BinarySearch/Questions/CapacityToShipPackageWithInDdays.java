package BinarySearch.Questions;

public class CapacityToShipPackageWithInDdays {

    static void main(String[] args) {
        int [] arr = {3,2,2,4,1,4};
        int days = 3;
        System.out.println(shipWithinDays(arr,days));
    }
    public static int shipWithinDays(int [] arr, int d){
        int n = arr.length;
        int high = 0;
        int low = 0;
        for (int j : arr) {
            high += j;
            low = Math.max(low, j);
        }
        int ans = high;
        while (low<=high){
            int mid = low + (high-low)/2;
            if(canShip(arr,d,mid)){
                ans = Math.min(ans,mid);
                high = mid-1;
            }else{
                low = mid+1;
            }


        }
        return ans;
    }
    public static boolean canShip(int [] arr,int days,int capacity){
        int currentLoad = 0;
        int requiredDays = 1;
        for(int w: arr){
            if(currentLoad+w>capacity){
                requiredDays++;
                currentLoad = 0;
            }
            currentLoad += w;
        }
        return requiredDays<= days;
    }


}
