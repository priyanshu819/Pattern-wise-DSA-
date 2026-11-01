import java.util.*;
public class c_20_valid_paretnesis {
    public static void main(String[] Args){
        String s="([)]";
        boolean ans=isValid(s);
        System.out.println("o/p: "+ans);
    }
    static boolean isValid(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
                continue;
            }
            else if(st.isEmpty())
                   return false;
            else{
                    if((s.charAt(i)==')' && st.peek()=='(') || (s.charAt(i)=='}' && st.peek()=='{')|| (s.charAt(i)==']' && st.peek()=='[')){
                        st.pop();
                        continue;
                    }
                   
            }
        }
        return st.isEmpty();
    }
}
