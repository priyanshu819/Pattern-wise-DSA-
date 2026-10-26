
import java.util.ArrayList;
import java.util.List;
public class a_56_merge_intervel {
    public static void main(String[] args) {
        int arr[][]={{1,3},{2,6},{8,10},{15,18}};
        int ans[][]=merge(arr);
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                System.out.println(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int [][] merge(int[][] intervals){
        List<int[]> list=new ArrayList<>();
        // sort the intervals based on the start time
        java.util.Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int start1=intervals[0][0];
        int end1=intervals[0][1];
        for( int i=1; i<intervals.length; i++){
            int start2=intervals[i][0];
            int end2=intervals[i][1];
            if(end1>=start2){
                end1=Math.max(end1,end2);
                continue;
            }
            list.add(new int[]{start1,end1});
            start1=start2;
            end1=end2;
        }
        list.add(new int[]{start1,end1});
        return list.toArray(new int[list.size()][]);
    }
}
