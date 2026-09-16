public class f_longest_repeat_charc_replac {
    public static void main(String[] args) {
        //String str="AABABBA";
        //int k=1;
        //String str="ABAB";
        //int k=2;
        String str="BAAAB";
        int k=2;

        int ans=characterReplacement(str,k);
        System.out.println("o/p: "+ans);
    }

    // case 1: i/p=AABABBA, k=1, o/p=4
    // case 2: i/p=ABAB, k=2, o/p=4
    // case 32: i/p:BAAAB, k=2, o/p=5
    static int characterReplacement(String s, int k){
        int low=0;
        int high=0;
        int res=-1;
        int[] arr=new int[256];
        for(high=0; high<s.length(); high++){
            char ch=s.charAt(high);
            arr[ch]+=1;
            int len =high-low+1;
            int max=findMax(arr);
            int diff=len-max;
            while(diff>k){
                ch=s.charAt(low);
                arr[ch]-=1;
                low++;
                len=high-low+1;
                max=findMax(arr);
                diff=len-max;
            }
            len=high-low+1;
            if(len>res)
                res=len;
        }
        return res;
    }

    static int findMax(int[] arr){
        int max=-1;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1])
                max=arr[i];
        }
        return max;
    }
}
