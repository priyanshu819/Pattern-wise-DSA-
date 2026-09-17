public class g_minimun_window_subs {
    public static void main(String[] args) {
        // String s="ADOBECODEBANC";
        // String t="ABC";
        // String s="a"; //->97
        // String t="a";
        // String s="a";
        // String t="aa";
        String s="ab";
        String t="a";
        // String s="abc";
        // String t="ab";
        String ans=minWindow(s,t);
        System.out.println("o/p: "+ans);
    }
    // case 1: s = "ADOBECODEBANC", t = "ABC", o/p="BANC"
    // case 2: s = "a",  t = "a",   o/p="a"
    // case 3: s="a",  t="aa",  o/p=""
    // case 4: s="ab", t="a",   o/p="a"
    // case 5: s="abc", t="ab", o/p="ab"
    static String minWindow(String s, String t){
        int have[]=new int[128];
        int need[]=new int[128];
        int low=0;
        int res=1000000;
        int start=-1;
        int high=0;
        //traverse t
        for(int i=0; i<t.length(); i++){
            need[t.charAt(i)]+=1;
        }
        for( high=0; high<s.length(); high++){
            have[s.charAt(high)]+=1;
            while(is_true(have,need)){
                int len= high-low+1;
                if(len<res){
                    res=len;
                    start=low;
                }
                have[s.charAt(low)]-=1;
                low++;
            }
        }
        if(start>-1)
            return s.substring(start,start+res);
        else
            return "";
    } 
    static boolean is_true(int[] have,int[] need){
        for(int i=0; i<128; i++){
             if(have[i]<need[i])
                return false;
        }
        return true;
     }  
    }

