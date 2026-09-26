
public class a_max_sum_subar {
    public static void main(String[] args) {
        //int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        //int arr[]={1};
        int arr[]={5,4,-1,7,8};
        a_max_sum_subar a=new a_max_sum_subar();  
        int ans=a.maxSubArray(arr);
        System.out.println("o/p: "+ans);
    }
        //int arr[]={-2,1,-3,4,-1,2,1,-5,4};, op=6
        //int arr[]={1};  o/p =1
        //int arr[]={5,4,-1,7,8};  o/p=23
        public int  maxSubArray(int[] nums){
            int bestans=nums[0];
            int ans=nums[0];
            for(int i=1; i<nums.length; i++){
                int v1=bestans+nums[i];
                int v2=nums[i];
                bestans=Math.max(v1, v2);
                ans=Math.max(ans, bestans);
            }
            return ans;
        }

}
