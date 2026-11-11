import java.util.*;

public class i_503_next_greater {
    public static void main(String[] Args){
        int[] arr={1,2,3,4,3};
        int ans[]=nextGreaterElements(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] nextGreaterElements(int[] nums){
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int res[]=new int[n];
        for(int i=n-1; i>=0; i--){
            st.push(nums[i]);
        }
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                 res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }
            st.push(nums[i]);
        }

        return res;

    }
}
