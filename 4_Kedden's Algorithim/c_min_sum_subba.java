public class c_min_sum_subba {
    public static void main(String[] args) {
        int arr[]={5,4,-1,7,8};
        c_min_sum_subba a=new c_min_sum_subba();  
        int ans=a.minSubarraySum(arr);
        System.out.println("o/p: "+ans);
    }
    
    public int minSubarraySum(int[] arr) {
        // code here
        int bestans=arr[0];
        int ans=arr[0];
        
        for(int i=1; i<arr.length; i++){
            int v1=bestans+arr[i];
            int v2=arr[i];
            
            bestans=Math.min(v1,v2);
            ans=Math.min(ans,bestans);
            
        }
        return ans;
    }
}
