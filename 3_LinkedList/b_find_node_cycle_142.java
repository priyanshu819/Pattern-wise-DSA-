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
public class b_find_node_cycle_142 {
    public static void main(String[] args) {
        ListNode head=new ListNode(3);
        ListNode temp=head;
        int arr[]={3,2,0,-4};
        for(int i=1; i<arr.length; i++){
            temp.next=new ListNode(arr[i]);
            temp=temp.next;
        }

        // Create Cylcle
        temp.next=head.next;

        ListNode ans=detectCycle(head);
        if(ans==null)
            System.out.println("o.p: "+ans);
        else
            System.out.println("o/p: cycle connect node data at "+ans.data);
    }

    static ListNode detectCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(fast==slow){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
