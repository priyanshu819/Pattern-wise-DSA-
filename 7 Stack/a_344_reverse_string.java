import java.util.*;
public class a_344_reverse_string {
    public static void main(String[] Args){
        char c[]={'h','e','l','l','o'};
        reverseString(c);
        System.out.println(Arrays.toString(c));
    }
    static void reverseString(char[] s){
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length; i++){
            st.push(s[i]);
        }
        int j=0;
        while(!st.isEmpty()){
            char c=st.peek();
            st.pop();
            s[j]=c;
            j++;
        }
    }
}
