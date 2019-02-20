package list;

// 删除链表倒数第n个节点
public class RemoveNthNodeFromList {
	public static Node<Integer> remove(Node<Integer> head, int n){
		if(head == null)
			return head;
		Node<Integer> fast = head;
		Node<Integer> slow = head;
		for(int i = 0; i < n; i++) {
			fast = fast.next;
		}
		if(fast == null)
			return head.next;
		while(fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> n = ReverseList_77.initNode();
		ReverseList_77.print(n);
		Node<Integer> n1 = remove(n, 3);
		ReverseList_77.print(n1);
	}
}
