import java.util.Stack;
public class e_1006_clumsy_facto {
    public static void main(String[] Args){
        int n=10;
        int ans=clumsy(n);
        System.out.println("o/p: "+ans);  
    }
    // 10*9/8+7-6*5/4+3-2*1
    static int clumsy(int n){
         Stack<Integer> st =new Stack<>();
         int count=0;
         st.push(n);
         for(int i=n-1; i>0; i--){
            if(count==4){
                count=0;
            }
            switch(count){
                case 0:
                    int ans=st.peek()*i;
                    st.pop();
                    st.push(ans);
                    count++;
                    continue;

                case 1:
                    ans=st.peek()/i;
                    st.pop();
                    st.push(ans);
                    count++;
                    continue;

                case 2:
                     
                    st.push(i);
                    count++;
                    continue;

                case 3:
                     
                    st.push(-1*i);
                    count++;
                    continue;

                default:
                    System.out.println("Error");

            }

         }

         int res=0;
         while(!st.isEmpty()){
            res+=st.peek();
            st.pop();
         }
         return res;

         /*
           if(n==1 || n==2){
            return n;
        }
        if(n==3) return 6;
        if(n==4) return 7;
        if(n % 4 == 0) return n+1; 
        if(n % 4 == 2 || n % 4 == 1) return n+2;
        return n-1;
         */
    }
}
