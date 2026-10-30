import java.util.Arrays;

public class d_gfg_check_overlap {
  public static void main(String[] args) {
     int arr[][]={{1, 3}, {5, 7}, {2, 4}, {6, 8}};
     boolean ans=isIntersect(arr);
     System.out.println(ans);
  }  
  static boolean isIntersect(int[][] intervals){
     Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
     int start1=intervals[0][0];
     int end1=intervals[0][1];
     for(int i=1; i<intervals.length; i++){
         int start2=intervals[i][0];
         int end2=intervals[i][1];
         if(end1>=start2)
            return true;
         start1=start2;
         end1=end2;
     }
     return false;
  }
}
