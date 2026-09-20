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

public class g_insert_at_k {
    public static void main(String[] args) {
         ListNode head = new ListNode(1);
        ListNode temp = head;
        int k=5;
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        print_listnode(head);
        head=addAtKth(head,10,k);
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
    //int arr[] = { 1, 2, 3, 4, 5, 6 };
    static ListNode addAtKth(ListNode head, int n, int k){
        ListNode node=new ListNode(n);
        ListNode temp=head;
        int t=1;
        while(t<=k-2){
           t++;
           temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        return head;
    }
}