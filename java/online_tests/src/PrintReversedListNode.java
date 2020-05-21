class NodeX {
	public NodeX(int i, NodeX next) {
		this.value = i;
		this.next = next;
	}

	int value;
	NodeX next;
}

class PrintReversedListNode {

	public static void main(String[] args) {
		NodeX n3 = new NodeX(3, null);
		NodeX n2 = new NodeX(2, n3);
		NodeX n1 = new NodeX(1, n2);

		printReversed(n1);
	}

	public static void printReversed(NodeX n) {
		if(n==null) return;
		printReversed(n.next);
		System.out.print(n.value);
	}

}
