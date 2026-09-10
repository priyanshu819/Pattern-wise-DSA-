import java.util.*;
public class e_Three_Sum {
      public static void main(String[] Args){
        
        //int arr[]={-1,0,1,2,-1,4};
        //int arr[]={0,0,0,0};
        int arr[]={1,2,0,1,0,0,0,0};
        int tg=0;
        List<List<Integer>> ans= new ArrayList<>();
        ans=threeSum(arr,tg);
        System.out.println("O/P: "+ans);
    }
    //  int arr[]={-1,0,1,2,-1,4};
    //            {-1,-1,0,1,2,4}
    // test case 61 - i/p=[0,0,0,0], op=[0,0,0]
    // tast case 133 - i/p=[1,2,0,1,0,0,0,0], op=[0,0,0]
    //                     [0,0,0,0,0,1,1,2]  
    static List<List<Integer>> threeSum(int[] nums, int tg){
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            else{         
            int left=i+1;
            int right =nums.length-1;
            int sum=(-1)*nums[i];
            while(left<right){
                int s=nums[left]+nums[right];
                if(s==sum){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<nums.length && nums[left]==nums[left-1]){
                    left++;
                  }
                   while(right>=0 && nums[right]==nums[right+1]){
                    right--;
                  }
                }
                if(s>sum)
                    right--;

                if(s<sum)
                    left++;

                
            }
            }


        }

        return ans;
    }
}
