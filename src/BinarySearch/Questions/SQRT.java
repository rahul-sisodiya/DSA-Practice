package BinarySearch.Questions;

public class SQRT {
    static void main(String[] args) {
        int n = Integer.MAX_VALUE;
        for(int i = 0; i<=n ; i++)
            System.out.println(i + "  ------>   "+sqrt(i));
    }
    public static int sqrt(int n){
        int low = 0;
        int high = n;

        while(low<=high){
            long mid = low + (high-low)/2;
            if(mid*mid==n) return (int)mid;
            else if(mid*mid>n){
                high = (int)mid-1;
            }else{
                low = (int)mid+1;
            }
        }
        return high;
    }
}
