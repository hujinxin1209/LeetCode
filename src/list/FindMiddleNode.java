package list;

// 求链表的中间节点
public class FindMiddleNode {
	public static Node<Integer> find(Node<Integer> n){
		if(n == null) {
			return null;
		}
		Node<Integer> fast = n;
		Node<Integer> slow = n;
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	
	public static void main(String[] args) {
		Node<Integer> n = ReverseList_77.initNode1();
		ReverseList_77.print(n);
		Node<Integer> n1 = find(n);
		System.out.println(n1.value);
	}
}
