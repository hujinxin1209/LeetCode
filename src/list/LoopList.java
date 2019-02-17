package list;


public class LoopList {
	public static boolean isLoop(Node<Integer> head) {
		if(head == null || head.next == null) return false;
		Node<Integer> q = head.next;
		Node<Integer> p = head.next.next;
		while(p != null) {
			if(q == p) return true;
			q = q.next;
			p = p.next.next;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
	}
}
