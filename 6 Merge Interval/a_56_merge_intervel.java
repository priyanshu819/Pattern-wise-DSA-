

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

    static int [][] merge(int[][] intervals)
}
