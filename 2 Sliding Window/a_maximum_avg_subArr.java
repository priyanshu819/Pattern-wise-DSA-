
public class a_maximum_avg_subArr {
    public static void main(String[] args) {
        int[] arr={1,12,-5,-6,50,3};
        int k=4;
        System.out.print("i/p: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("  k: "+k);
        System.out.println();
        double ans=findMaxAverage(arr,k);
        System.out.println("o/p: "+ans);
    }

     //case -1: nums = [1,12,-5,-6,50,3], k = 4  o/p: 12.75000
    static double findMaxAverage(int[] nums, int k){
        int n=nums.length;
        double avg=0;
        double max=-1000000;
        int low=0;
        int high=k-1;
        // FInd First subarray sum
        for(int i=low; i<=high; i++){
            avg=avg+nums[i];
        }
       // This is first subarray avg
        avg=avg/k;
        while(high<n){
            if(avg>max){
                max=avg;
            }
            // window shrinking
            low++;
            high++;

            if(high==n)
                break;

            // count togtal subarrays avg
            avg=avg+(double)nums[high]/k;
            avg=avg-(double)nums[low-1]/k;
        }
      return max;
    }
}