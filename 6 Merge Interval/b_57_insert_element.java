import java.util.*;
public class b_57_insert_element {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval={4,8};
        int [][] ans=insert(arr, newInterval);
        System.out.println(Arrays.deepToString(ans));
    }
    static int[][] insert(int[][] intervals, int[] newInterval){
        boolean insert =false;
        List<int[]> list=new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            int start=intervals[i][0];
            if(insert==true && start>=newInterval[0]){
                list.add(newInterval);
                insert=true;
            }
            list.add(intervals[i]);
        }
        // ater insertion it will be mearge
    }
}
 