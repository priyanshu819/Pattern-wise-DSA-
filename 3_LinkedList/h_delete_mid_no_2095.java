
class ListNode {
    // instance variable/Attribute/Data Member
    int data;
    ListNode next;

    // cunstructor /method/function member
    ListNode(int val) {
        this.data = val;
        next = null;
    }

}
public class h_delete_mid_no_2095 {
    public static void main(String[] args) {
        //int arr[]={1,2,3,4};
        //int arr[]={1};
        int arr[] = { 1,3,4,7,1,2,6};
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        print_listnode(head);
        head=deleteMiddle(head);
        print_listnode(head);
    }

    static void print_listnode(ListNode head) {
        ListNode temp = head;
        System.out.print("LinkdList: ");
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    static ListNode deleteMiddle(ListNode head){
        if(head.next==null){
            return null;
        }
        ListNode fast=head.next.next;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;

    
     }
    
}
