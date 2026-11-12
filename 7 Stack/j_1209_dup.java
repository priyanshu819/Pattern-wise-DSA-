import java.util.Stack;
class Pair{
    
    char ch;
    int num;
    

    Pair(char ch, int num){this.ch=ch; this.num=num;}
}
public class j_1209_dup {
    public static void main(String[] Args){
        String s="deeedbbcccbdaa";
        String ans=removeDuplicates(s,3);
        System.out.println("o/p: "+ans);
  }
  static String removeDuplicates(String s, int k){
    int n=s.length();
     Stack<Pair> st=new Stack<>();
        for(int i=0; i<n; i++){
            char t=s.charAt(i);
            if(st.isEmpty()){
                st.push(new Pair(t,1));
                continue;
            }
            if(st.peek().ch!=t){
                st.push(new Pair(t,1));
                continue;}
            if(st.peek().num<k-1){
                st.peek().num+=1;
                continue;
            }
            st.pop();

            
        }
        String res="";
        while(!st.isEmpty()){
            char t=st.peek().ch;
            int p=st.peek().num;
            while(p--!=0){
                res=res+t;

            }
            st.pop();

        }

        return res;

  }
}
