import java.util.*;
public class c_longest_substring_ex_k_le {
    public static void main(String[] args) {
        String str="aabacbebebe";
        int k=3;
        // String str="aaaa";
        // int k=2;
        // String str="aabaaab";
        // int k=2;
        int ans=longestKSubstr(str,k);
        System.out.println("o/p: "+ans);
       
    }
    //case -1 : s="aabacbebebe", k=3
    //case -2: s="aaaa", k=2
    // case -3: s="aabaaab", k=2
    static int longestKSubstr(String s, int k){
        // create a hashmap
        Map<Character,Integer> map=new HashMap<>();
       int res=-1;
       int low=0;
       int high=0;
       for(high=0; high<s.length(); high++){
          char ch=s.charAt(high);
          map.put(ch,map.getOrDefault(ch,0 )+1);
          while(map.size()>k){
            ch=s.charAt(low);
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0)
                map.remove(ch);
            low++;
          }
          if(map.size()==k){
            int len=high-low+1;
            if(res<len)
                res=len;
          }
      }
      return res;
    }
}
