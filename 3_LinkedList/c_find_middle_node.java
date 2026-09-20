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
public class c_find_middle_node {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode temp=head;
        int arr[]={1,2,3,4,5,6};
        for(int i=1; i<arr.length; i++){
            temp.next=new ListNode(arr[i]);
            temp=temp.next;
        }
        ListNode ans=middleNode(head);
        System.out.println("middileNode: "+ans.data);
    }
    static ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}