import java.util.*;
public class b_57_insert_element {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval={14,8};
        int [][] ans=insert(arr, newInterval);
        System.out.println(Arrays.deepToString(ans));
    }
    //int[][] arr={{1,2},{3,5},{6,7},{8,10},{12,16}};
    static int[][] insert(int[][] intervals, int[] newInterval){
        boolean insert =false;
       int[][] list=new int[intervals.length+1][2];
        List<int[]> ans=new ArrayList<>();
        int k=0;
        for(int i=0; i<intervals.length; i++){
            int start=intervals[i][0];
            if(insert==false && start>=newInterval[0]){
                list[k][0]=newInterval[0];
                list[k][1]=newInterval[1];
                insert=true;
                k++;
            }
            list[k][0]=intervals[i][0];
            list[k][1]=intervals[i][1];
            k++;
        }
        // if new interval is large intervels then
        if(insert==false){
            list[k][0]=newInterval[0];
            list[k][1]=newInterval[1];
        }
        // ater insertion it will be mearge
        int start1=list[0][0];
        int end1=list[0][1];
        for(int i=1; i<list.length; i++){
            int start2=list[i][0];
            int end2=list[i][1];
            if(end1>=start2){
                end1=Math.max(end1, end2);
                continue;
            }
            ans.add(new int[]{start1,end1});
            start1=start2;
            end1=end2;

        }      
          ans.add(new int[]{start1,end1}); 
            return ans.toArray(new int[ans.size()][]);
        }
    }
    