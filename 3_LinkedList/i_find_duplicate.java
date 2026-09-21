public class i_find_duplicate {
    public static void main(String[] args) {
        //int arr[]={1,3,4,2,2};
        //int arr[]={3,1,3,4,2};
        int arr[]={3,3,3,3,3};
        int ans=findDuplicate(arr);
        System.out.println("o/p: "+ans);
    }

    static int findDuplicate(int[] nums){
        int slow=nums[0];
        int fast=nums[0];
        while(true){
            slow=nums[slow];
            fast=nums[nums[fast]];


            if(slow==fast){
                slow=nums[0];
                while(slow!=fast){
                    slow=nums[slow];
                    fast=nums[fast];
                }
                return slow;
            }
        }
    }
}