import java.util.*;

public class h_739_daily_temp {
    public static void main(String[] Args){
        int arr[]={73,74,75,71,69,72,76,73};
        int[] ans=dailyTemperatures(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] dailyTemperatures(int[] temperatures){
        Stack<Integer> st=new Stack<>();
        int n=temperatures.length;
        int[] res=new int[n];
        res[n-1]=0;
        st.push(n-1);
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=0;
            }
            else{
                res[i]=st.peek()-i;
            }
            st.push(i);
        }
        return res;
    }
}
