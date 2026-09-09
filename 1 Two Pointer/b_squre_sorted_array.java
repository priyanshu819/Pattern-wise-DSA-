import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
   sorted : [ -2, -1, 0, 3, 4]


             [4, 1, 0, 9, 16]
*/

public class b_squre_sorted_array {
    
    public static void main(String[] args) {
        int[] arr={-4,-1,0,3,10};

        int[] ans =sortedSquares(arr);

        System.out.println("Arrray");
        for(int i=0; i<arr.length; i++){
            System.out.print(ans[i] +" ");
        }
        
    }
    static int[] sortedSquares(int[] nums) {
        List<Integer> neg =new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            }
            else{
                pos.add(nums[i]);
            }
 
        }
        int l=neg.size();
        int m=pos.size();

        // If Neg was Zero then 
        
        if(l==0){
            for(int i=0; i<pos.size(); i++){
                int a=pos.get(i)*pos.get(i);
                pos.set(i,a);
            }
            
            int[] ans=new int[m];
            for(int i=0; i<m; i++){
                ans[i]=pos.get(i);
            }
            return ans;
        }

         // If pos was Zero then 
        
        if(m==0){
            for(int i=0; i<neg.size(); i++){
                int a=neg.get(i)*neg.get(i);
                neg.set(i,a);
            }
            Collections.reverse(neg);
            int[] ans=new int[l];
            for(int i=0; i<l; i++){
                ans[i]=neg.get(i);
            }
            return ans;
             
            
        }
        // if both pressentint

        int[] ans=new int[l+m];
        
        // Squre neg element 
        for(int i=0; i<l; i++){
            int a=neg.get(i)*neg.get(i);
             neg.set(i,a);
        }

        // Reverse the  neg element
        Collections.reverse(neg);

        // squre pos element 
        for(int i=0; i<m; i++){
            int a=pos.get(i)*pos.get(i);
            pos.set(i,a);
        }
        
        // Now Insert values into new array
        int i=0;
        int j=0;
        int p=0;
        while(i<l && j<m){
            if(neg.get(i)<pos.get(j)){ // neg=1,16   , pos= 0, 9, 100
                ans[p]=neg.get(i);
                i++;
                p++;

            }
            else{
                ans[p]=pos.get(j);
                p++;
                j++;
            }
        }

        while(i<l){
           ans[p]=neg.get(i);
           i++;
           p++;
        }
        while(j< m){
           ans[p]=pos.get(j);
           j++;
           p++;

        }

      return ans;
    }
}
