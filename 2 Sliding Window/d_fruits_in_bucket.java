import java.util.*;;
public class d_fruits_in_bucket {
    public static void main(String[] args) {
       // int arr[]={1,2,1};
        int arr[]={1,2,3,2,2};
       int ans=totalFruit(arr);
       System.out.println("o/p: "+ans);
        
    }
    //case 1: i/p=[1,2,1], op=3
    // case 2: i/p=[1,2,3,2,2], op=4
    static int totalFruit(int[] fruits) {
        Map<Integer,Integer> map=new  HashMap<>();
       int res=-1;
       int low=0;
       int high=0;

       for(high=0; high<fruits.length; high++){
           map.put(fruits[high],map.getOrDefault(fruits[high], 0)+1);

           while(map.size()>2){
              map.put(fruits[low],map.get(fruits[low])-1);
              if(map.get(fruits[low])==0)
                map.remove(fruits[low]);
            low++;
           }

           if(map.size()==2 || map.size()<2){
             int len =high-low+1;
             if(len>res)
                res=len;
           }

       }
       return res;
    }
}