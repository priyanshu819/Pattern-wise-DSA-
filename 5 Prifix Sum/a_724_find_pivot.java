/**
 * a_724_find_pivot
 */
public class a_724_find_pivot {

    public static void main(String[] args) {
        //int arr[] ={1,7,3,6,5,6};
        //int arr[]={1,2,3};
        //int arr[]={2,1,-1};
        int arr[]={0,0};
        int ans=pivotIndex(arr);
        System.out.println("o/p: "+ans);

    }
    //int arr[] ={1,7,3,6,5,6};   o/p:3
    //int arr[]={1,2,3};          o/p:-1
    //int arr[]={2,1,-1};         o/p:0
    //int arr[]={0,0};            o/p:0
    static int pivotIndex(int[] nums){
        int total_sum=0;
        for(int i=0; i<nums.length; i++){
             total_sum+=nums[i];    
        }
        int prefix=0;
        for(int i=0; i<nums.length; i++){
            if(prefix==total_sum-prefix-nums[i])
                return i;
            prefix+=nums[i];
        }
        return -1;
    }
}