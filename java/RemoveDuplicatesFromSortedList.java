package sy.leetcode;

//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
 
public class RemoveDuplicatesFromSortedList {

	public ListNode deleteDuplicates(ListNode head) {
		ListNode p = new ListNode(0);
		p = head;
			while((p != null) && (p.next != null))  {
			if(p.val == p.next.val) {
				p.next = p.next.next;	
			}
			else p = p.next;

		}
		return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
