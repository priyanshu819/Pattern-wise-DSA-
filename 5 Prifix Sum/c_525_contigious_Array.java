import java.util.*;

/**
 * c_525_contigious_Array
 */
public class c_525_contigious_Array {

    public static void main(String[] args) {
        int[] arr={0,1,1,1,1,1,0,0,0};
        int ans=findMaxLength(arr);
        System.out.println("o/p: "+ans);
    }
    static int findMaxLength(int[] nums){
        Map<Integer,Integer> map=new HashMap<>();
        int maxlen=0;
        int one=0;
        int zero=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1)
                one++;
            else
                zero++;
            int diff=zero-one;
            if(diff==0){
                maxlen=Math.max(maxlen,i+1);
                continue;
            }
            else{
                if(map.containsKey(diff)){
                    int len=i-map.get(diff);
                    maxlen=Math.max(maxlen,len);
                    continue;
                }
                map.put(diff, i);

            }
        }
        return maxlen;

    }
}