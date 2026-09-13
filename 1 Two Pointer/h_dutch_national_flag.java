public class h_dutch_national_flag {
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        
        System.out.print("i/p: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sortColors(arr);

        System.out.print("o/p: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    static void sortColors(int[] nums){
            int n=nums.length;
            int low=0;
            int mid=0;
            int high=n-1;
            while(mid<=high){
                if(nums[mid]==0){
                    swap(nums,low,mid);
                    low++;
                    mid++;
                }
                else if(nums[mid]==1){
                    mid++;
                    continue;
                }
                else{
                    swap(nums,mid,high);
                    high--;
                }
            }
    }
    static void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}