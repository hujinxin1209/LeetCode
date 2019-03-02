package list;

//Given a linked list, swap every two adjacent nodes and return its head.
//You may not modify the values in the list's nodes, only nodes itself may be changed.
//Given 1->2->3->4, you should return the list as 2->1->4->3.
public class SwapNodesInPairs {
	public Node swap(Node head) {
		if(head == null || head.next == null)
			return head;
		
		Node tmp = head.next;
		head.next = swap(tmp.next);
		tmp.next = head;
		return tmp;
	}
	
}
