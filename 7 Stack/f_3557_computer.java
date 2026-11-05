public class f_3557_computer {
    public static void main(String[] Args){
        int[] arr={1,2,3};
        int ans=countPermutations(arr);
        System.out.println("O/P: "+ans);
    }
    static int countPermutations(int[] complexity){
         int n=complexity.length;
        long ans=1;
        int mod=1000000007;
        for(int i=1; i<n; i++){
            if(complexity[i]<=complexity[0])
                return 0;
            
            ans=(ans*i)%mod;
        }
        return (int) ans;
    }
}
