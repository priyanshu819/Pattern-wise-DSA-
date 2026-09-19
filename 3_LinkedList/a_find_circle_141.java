class ListNode{
    // instance variable/Attribute/Data Member
    int data;
    ListNode next;
    // cunstructor /method/function member
    ListNode(int val){
        this.data=val;
        next=null;
    }
}
public class a_find_circle_141 {
    public static void main(String[] args) {
        int arr[]={3,2,0,-4};
        ListNode head=new ListNode(3);
        ListNode temp=head;
        for(int i=1; i<arr.length; i++){
            temp.next=new ListNode(arr[i]);
            temp=temp.next;
        }
        temp.next=head.next;
        boolean ans=hasCycle(head);
        System.out.println("o/p: "+ans);
    }

    static boolean hasCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }

        return false;
    }
    
}