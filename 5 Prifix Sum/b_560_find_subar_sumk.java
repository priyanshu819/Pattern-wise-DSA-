import java.util.*;

public class b_560_find_subar_sumk {
    public static void main(String[] args) {

        //int arr[]={1,1,1}, k=2;
        int arr[]={1,2,3}, k=3;
        int ans=subarraySum(arr,k);
        System.out.println("o/p: "+ans);
        
    }
    //int arr[]={1,1,1}, k=2;
    //int arr[]={1,2,3}, k=3;
    static int subarraySum(int nums[],int k){
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        int total_sum=0;
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            total_sum+=nums[i];
            int tg=total_sum-k;
            if (map.containsKey(tg)){
                count+=map.get(tg);  
            }
             map.put(total_sum,map.getOrDefault(total_sum, 0)+1);  
        }
        return count; 
    }
}

