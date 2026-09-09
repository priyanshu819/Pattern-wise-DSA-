import java.util.HashMap;
import java.util.Map;
public class a_two_sum {
    public static void main(String[] args) {
        int[] arr={3,2,4};
        int target=6;
        int[] ans=twoSum(arr,target);
        System.out.println("Nums: "+ans[0]+" , "+ans[1]);
        

    }
    static int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> map=new HashMap<>();
       for(int i=0; i<nums.length; i++){
        int find=target-nums[i];
        if(map.containsKey(find)){
            return new int[] {map.get(find),i};
        }
        map.put(nums[i],i);
    }
    return null;
    }
}
