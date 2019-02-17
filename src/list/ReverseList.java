package list;

//（1）每次查看cur节点是否为NULL，如果是，则结束循环，获得结果
//（2）如果cur节点不是为NULL，则先设置临时变量next为cur的下一个节点
//（3）让cur的下一个节点变成指向pre，而后pre移动cur，cur移动到next
//（4）重复（1）（2）（3）

public class ReverseList {
	private static Node<Integer> initNode;
	
	public static Node<Integer> reverse(Node<Integer> head){
		if(head == null) {
			return head;
		}
		Node<Integer> pre = null;
		Node<Integer> cur = head;
		while(cur != null) {
			Node<Integer> next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
	}
	
	public static void initNode() {
		Node<Integer> n1 = new Node<Integer>(4, null);
		Node<Integer> n2 = new Node<Integer>(7, n1);
		Node<Integer> n3 = new Node<Integer>(3, n2);
		Node<Integer> n4 = new Node<Integer>(8, n3);
		initNode = new Node<Integer>(2, n4);
	}
	
	public static void print(Node<Integer> head) {
		System.out.println("");
		Node<Integer> node = head;
		while(node != null) {
			System.out.print(node.value);
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		initNode();
		print(initNode);
		Node<Integer> newNode = reverse(initNode);
		print(newNode);
	}
}

