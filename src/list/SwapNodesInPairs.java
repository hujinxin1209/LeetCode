package list;

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
