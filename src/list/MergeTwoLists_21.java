package list;

// merge two sorted list
public class MergeTwoLists_21 {
	public static Node<Integer> mergeTwoLists1(Node<Integer> n1, Node<Integer> n2){
		if(n1 == null) return n2;
		if(n2 == null) return n1;
		if(n1.value < n2.value) {
			n1.next = mergeTwoLists1(n1.next, n2);
			return n1;
		} else {
			n2.next = mergeTwoLists1(n1, n2.next);
			return n2;
		}
	}
	
	public static Node<Integer> mergeTwoLists2(Node<Integer> n1, Node<Integer> n2){
		if(n1 == null) return n2;
		if(n2 == null) return n1;
		Node<Integer> head = null;
		if(n1.value <= n2.value) {
			head = n1;
			n1 = n1.next;
		} else {
			head = n2;
			n2 = n2.next;
		}
		Node<Integer> temp = head;
		while(n1 != null && n2 != null) {
			if(n1.value <= n2.value) {
				temp.next = n1;
				n1 = n1.next;
			} else {
				temp.next = n2;
				n2 = n2.next;
			}
			temp = temp.next;
		}
		if(n1 == null) {
			temp.next = n2;
		}
		if(n2 == null){
			temp.next = n1;
		}
		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> n1 = ReverseList_77.initNode();
		Node<Integer> n2 = ReverseList_77.initNode1();
		ReverseList_77.print(n1);
		ReverseList_77.print(n2);
		Node<Integer> n3 = mergeTwoLists2(n1, n2);
		ReverseList_77.print(n3);
	}
}
