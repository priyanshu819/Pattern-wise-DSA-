
public class g_Three_sum_multiplicitly {
     public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,4,5,5};
        int tg=8;
        int ans=threeSumMultiplicitly(arr,tg);
        System.out.println("o/p: "+ans);
     }
     //i/p=[1,1,2,2,3,3,4,4,5,5], tg=8, o/p=20
     static int threeSumMultiplicitly(int[] arr, int target){
        int ans=0;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            int left =i+1;
            int right=arr.length-1;
            while(left<right){
                sum=arr[i]+arr[left]+arr[right];
                if(sum==target){
                    System.out.println("a[i]:"+arr[i]+" "+"a[left]:"+arr[left]+" "+"a[right]:"+arr[right]+ "-> TRUE");
                    
                    ans++;
                    left++;
                    right--;
                   
                               
                }
                if(sum>target){
                    System.out.println("a[i]:"+arr[i]+" "+"a[left]:"+arr[left]+" "+"a[right]:"+arr[right]);
                    right--;}
                if(sum<target)
                    {
                System.out.println("a[i]:"+arr[i]+" "+"a[left]:"+arr[left]+" "+"a[right]:"+arr[right]);
                left++;
            }
          }
        }
        return ans;
     }   
}