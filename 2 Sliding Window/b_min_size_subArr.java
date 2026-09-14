
public class b_min_size_subArr {
    public static void main(String[] args) {
        //int[] arr={2,3,1,2,4,3};
        //int tg=7;
        int[] arr={1,4,4};
        int tg=4;
        int ans=minSubArrayLen(tg,arr);
        System.out.println("o/p: "+ans);
    }
  //case-1 i/p: [2,3,1,2,4,3], tg=7,  o/p=2
    //case-1 i/p: [1,4,4], tg=4,  o/p=1


    static int minSubArrayLen(int target,int[] nums){
           
        int res=1000000;
        int low=0;
        int high=0;
        int sum=0;
        int n=nums.length;

        while(high<n){
            sum=sum+nums[high];

            while(sum>=target){
                int len=high-low+1;

                if(res>len){
                    res=len;
                }
                low++;
                sum=sum-nums[low-1];
            }
            high++;
        }
        if (res==1000000)
            return 0;

        return  res;

    }
  //jay siya ram

    
}