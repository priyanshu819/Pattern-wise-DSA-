
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
public class e_insert_at_sec {
    public static void main(String[] args) {
         ListNode head = new ListNode(1);
        ListNode temp = head;
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        print_listnode(head);
        head=addAtSec(head,10);
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
    static ListNode addAtSec(ListNode head, int n){
        ListNode node=new ListNode(n);
        node.next=head.next;
        head.next=node;
        return head;
    }
}
