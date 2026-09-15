import java.util.*;
public class e_longest_subs_witout_reap {
    public static void main(String[] args) {
        //String str="abcabcbb";
        //String str="pwwkew";
        //String str="bbbbb";
        String str="";

        int ans=lengthOfLongestSubstring(str);
        System.out.println("o/p: "+ans);
    }
    //case 1: i/p= abcabcbb,  o/p=3
    //case 2: i/p= pwwkew,    o/p=3
    //case 3: i/p= bbbbb,     o/p=1
    static int lengthOfLongestSubstring(String s){
        Map<Character,Integer> map=new HashMap<>();
        int res=0;
        int low=0;
        int high=0;

        for(high=0; high<s.length(); high++){
            char ch=s.charAt(high);
            map.put(ch,map.getOrDefault(ch, 0)+1);

            int k=high-low+1;
            while(map.size()<k){
                ch=s.charAt(low);
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0)
                    map.remove(ch);
                low++;
                k=high-low+1;

            }

            int len=high-low+1;
            if (len>res)
                res=len;
        }
        return res;
    }
}
