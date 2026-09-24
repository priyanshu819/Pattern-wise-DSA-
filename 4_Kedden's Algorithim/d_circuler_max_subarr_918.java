public class d_circuler_max_subarr_918 {
    public static void main(String[] args) {
        //int a[]={1,-2,3,-2};
        // int a[]={5,-3,5};
        // int a[]={-3,-2,-3};
        int a[]={3,-2,5};
        int ans=maxSubarraySumCircular(a);
        System.out.println("o/p: "+ans);
    }

    // i/p: 3,-2,5  ,o/p: 8
    static int maxSubarraySumCircular(int[] nums){
        int best=nums[0];
        int ans=nums[0];
        int n=nums.length;
        for(int i=1; i<n; i++){
            int v1=best+nums[i];
            int v2=nums[i];
            best=Math.max(v1,v2);
            ans=Math.max(ans,best);
        }
        if(nums[0]==nums[n-1]){
            int ans2=nums[n-1];
            best=nums[n-1];
            for(int i=0; i<n-1; i++){
                int v1=best+nums[i];
                int v2=nums[i];
                best=Math.max(v1,v2);
                ans2=Math.max(ans2,best);
            }
            ans=Math.max(ans,ans2);
        }
        return ans;
    }
   
   
}
