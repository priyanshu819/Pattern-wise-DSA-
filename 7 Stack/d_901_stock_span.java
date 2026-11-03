import java.util.Stack;

public class d_901_stock_span {
   
    Stack<int[]>st;
    public d_901_stock_span () {
        st=new Stack<>();
    }
    
    public int next(int price) {
        // {[], [100], [80], [60], [70], [60], [75], [85]}
        int span=1;
        while(!st.isEmpty() && st.peek()[0]<=price ){
            span+=st.pop()[1];
        }
        st.push(new int[]{price,span});
        return span;
        
    }
}
