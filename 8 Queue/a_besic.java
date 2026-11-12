import java.util.LinkedList;
import java.util.Queue;

public class a_besic {
    public static  void main(String[] Args){
        Queue <Integer> q=new LinkedList<>();

        // insertion in queue;
        //let indert number from 1 to 5
        for(int i=1; i<6; i++){
            q.add(i);
        }

        // travring q via add front to rear
        int n=q.size();
        for(int i=0; i<n; i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }

        // Add number 50 at 3;
        for(int i=1; i<n+2; i++){
            if(i==3){
               q.add(50);
               continue;
            }
            q.add(q.remove());
        }
        System.out.print(q);

        // peek at index k=4;
        int k=4;
        for(int i=1; i<n+1; i++){
            if(i==k){
                System.out.println(q.peek());
            }
            q.add(q.remove());
        }

        // to remove at any index
        k=2;
        for(int i=1; i<n; i++){
            if(i==k){
                q.remove();
                continue;
            }
            q.add(q.remove());
        }
    }
}
