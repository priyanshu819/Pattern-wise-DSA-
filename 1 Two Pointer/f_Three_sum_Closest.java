import java.util.*;
public class f_Three_sum_Closest {

    public static void main(String[] args) {
      //int  arr[]={-1,2,1,-4};
      //int arr[]={0,0,0};
      //int[] arr={10,20,30,40,50,60,70,80,90};
      //int tg=1;
      int [] arr={-1000,-1000,-1000};
      int tg=10000;

      int ans=threeSumColesest(arr,tg);
      System.out.println("o/p: "+ans);
    }
    // i/p=[-1,2,1,-4], o/p=2
    //     [-4,-1,1,2]
    // i/p=[0,0,0] o/p=0
    //tast case 57-> i/p={10,20,30,40,50,60,70,80,90}, o/p=60
    // test case 109-> i/p={-1000,-1000,-1000}, tg=10000, o/p=-3000
    static int threeSumColesest(int[] nums, int target){
        int max=100000;
        Arrays.sort(nums);
        int ans=0;
        int n=nums.length;
        for(int i=0; i<n-2; i++ ){
            int left=i+1;
            int right=n-1;
            while(left<right){
            int sum=nums[i]+nums[left]+nums[right]; 
            int diff=Math.abs(target-sum);
            if(max>diff){
                max=diff;
                ans=sum;
            }
            if(sum==target){
                left++;
                right--;
            }
            if(sum>target)
                right--;
            if(sum<target)
                left++;
        }
        }
        return  ans;
    }  
}