public class d_circuler_max_subarr_918 {
    public static void main(String[] args) {
       //int a[]={1,-2,3,-2};
        //int a[]={5,-3,5};
         int a[]={-3,-2,-3};
        //int a[]={3,-2,5};
        //int a[]={2,-2,2,7,8,0};
        //
        
        //int a[]={6,9,-3};

        int ans=maxSubarraySumCircular(a);
        System.out.println("o/p: "+ans);
    }



    // i/p: 3,-2,5  ,o/p: 8
    // i/p: 2,-2,2,7,8,0, o/p:19
    //i/p:[6,9,-3], o/p:15
    static int maxSubarraySumCircular(int[] nums){
        int best=nums[0],ans=nums[0];
        int maxbest=nums[0], maxans=nums[0];
        int total_Sum=nums[0];
        for(int i=1; i<nums.length; i++){
            // For Count max
            maxbest=Math.max(nums[i],nums[i]+maxbest);
            maxans=Math.max(maxans,maxbest);

            // For min Count
            best=Math.min(nums[i],best+nums[i]);
            ans=Math.min(ans,best);

            total_Sum=total_Sum+nums[i];

        }
        if (maxans<0)
            return maxans;

        ans=Math.max(maxans,total_Sum-ans);
        return ans;
    }
}
