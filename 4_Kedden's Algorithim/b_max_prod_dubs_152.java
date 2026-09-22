
public class b_max_prod_dubs_152 {

    public static void main(String[] args) {
        int arr[]={2,3,-2,4};
        //int arr[]={-2,0,-1};
        b_max_prod_dubs_152 a=new b_max_prod_dubs_152();
        int ans=a.maxProduct(arr);
        System.out.println("o/p: "+ans);
        

    }
        //int arr[]={2,3,-2,4}; op=6
        //int arr[]={-2,0,-1};  op=0
        public int maxProduct(int[] nums) {
        
            int minans=nums[0];
            int maxans=nums[0];
            int ans=nums[0];
            for(int i=1; i<nums.length; i++){
                int v1=maxans*nums[i];
                int v2=minans*nums[i];
                int v3=nums[i];

                maxans=Math.max(v3,Math.max(v1,v2));
                minans=Math.min(v3,Math.min(v1,v2));
                ans=Math.max(ans,Math.max(maxans,minans));
                

            }
            return  ans;

    }
    
}
