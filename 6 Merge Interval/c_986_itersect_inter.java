import java.util.*;

public class c_986_itersect_inter {
    public static void main(String[] args){
        int[][] arr1={{0,2},{5,10},{13,23},{24,25}},arr2={{1,5},{8,12},{15,24},{25,26}};
        int[][] ans=intervalIntersection(arr1,arr2);
        System.out.println(Arrays.deepToString(ans));
    }
    //arr1={{0,2},{5,10},{13,23},{24,25}},arr2={{1,5},{8,12},{15,24},{25,26}}
    // o/p: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
    static int[][] intervalIntersection(int[][] firstList, int[][] secondList){
        List<int[]> list=new ArrayList<>();
        int i=0,j=0;
        while(i<firstList.length && j<secondList.length){
            int start1=firstList[i][0];
            int end1=firstList[i][1];
            int start2=secondList[j][0];
            int end2=secondList[j][1];

            if(start1<=start2){
                if(end1>=start2){
                    int s=Math.max(start1,start2);
                    int e=Math.min(end1,end2);
                    list.add(new int[]{s,e});
                }
            }
            else{
                if(end2>=start1){
                    int s=Math.max(start1,start2);
                    int e=Math.min(end1,end2);
                    list.add(new int[]{s,e});
                }
            }
            if(end1<=end2)
                i++;
            else
                j++;
        }
        return list.toArray(new int[list.size()][]);
    }
}
