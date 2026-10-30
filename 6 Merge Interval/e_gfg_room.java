import java.util.Arrays;

public class e_gfg_room {
    public static void main(String[] Args){
        int[] start={1, 10, 7}, end={4, 15, 10};
        int ans=minMeetingRooms(start,end);
        System.out.println(ans);
    }
    static int minMeetingRooms(int[] start,int[] end){
        int ans=0,i=0,j=0,room=0;
        Arrays.sort(start);
        Arrays.sort(end);
        while(i<start.length && j<end.length){
            if(start[i]<end[j]){
                room++;
                ans=Math.max(ans, room);
                i++;
            }
            else{
                room--;
                j++;
            }
        }
        
        return ans;
    }
}
