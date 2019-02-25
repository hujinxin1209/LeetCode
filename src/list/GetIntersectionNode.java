package list;

// 40815*239185
// 239825*40815
// 不等长情况下，互补，然后进行比较
public class GetIntersectionNode {
	public Node getIntersectionNode(Node a, Node b) {
		if(a == null || b == null) return null;
		Node tmpA = a;
		Node tmpB = b;
		while(tmpA != tmpB) {
			tmpA = (tmpA == null)? b : tmpA.next;
			tmpB = (tmpB == null)? a : tmpB.next;
		}
		return tmpA;
	}
}
