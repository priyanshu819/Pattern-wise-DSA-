/*
Problem 88
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

*/


public class c_Merge_Sorted_Array {

    public static void main(String[] args) {
        // Test case -1
        // int [] nums1={1,2,3,0,0,0};
        // int [] nums2={2,5,6};
        // int m=3;
        // int n=3;

        // test case 3
        // int [] nums1={0};
        // int [] nums2={1};
        // int m=0;
        // int n=1;

        //Test case 45
        int [] nums1={2,0,0,0};
        int [] nums2={1,2,3};
        int m=1;
        int n=3;

        System.out.println("Before Merge Array: ");
        for(int i=0; i<nums1.length; i++){
            System.out.print(nums1[i]+" ");
        }
        System.out.println();
        merge(nums1,m,nums2,n);
        System.out.println("After Merge Array: ");
        for(int i=0; i<nums1.length; i++){
            System.out.print(nums1[i]+" ");
        }


    }

    /*

      Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
      Output: [1,2,2,3,5,6]

      //Test case 45
        int [] nums1={2,0,0,0};
        int [] nums2={1,2,3};
        int m=1;
        int n=1;
*/
     static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        if(m==0){
                for(int p=0; p<n; p++){
                    nums1[p]=nums2[p];
                }
        }
        // if(m==1){
        //         for(int p=0; p<n; p++){
        //             nums1[p]=nums2[p];
        //         }
        // }
        else{
            while(i>=0 && j>=0){
            if(nums1[i]<nums2[j]){
                nums1[k]=nums2[j];
                j--;
                k--;
            }
            else{
                nums1[k]=nums1[i];
                i--;
                k--;
            }
        }
       if(i<0){
        while(j>=0){
               if  (nums1[i+1]<=nums2[j]){
                   nums1[k]=nums2[j];
                     j--;

               } 
               else{
                   nums1[k]=nums1[i+1];
                   k--;
                   for(int s=j; s>=0;s--){
                    nums1[k]=nums2[s];
                    k--;
                   }
               }
                

         }
        }
    }
}}

/*
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i < 0 || nums2[j] >= nums1[i]) {
                nums1[k--] = nums2[j--];
            } else {
                nums1[k--] = nums1[i--];
            }
        }
    }
*/