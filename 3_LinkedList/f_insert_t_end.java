
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
public class f_insert_t_end {
    public static void main(String[] args) {
         ListNode head = new ListNode(1);
        ListNode temp = head;
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        print_listnode(head);
        head=addAtEnd(head,10);
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
    static ListNode addAtEnd(ListNode head, int n){
        ListNode node=new ListNode(n);
        ListNode temp=head;
        while(temp.next!=null){
           temp=temp.next;
        }
        temp.next=node;
        return head;
    }
}
