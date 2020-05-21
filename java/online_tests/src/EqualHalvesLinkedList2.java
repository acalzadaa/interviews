class Nodes {
	public int value;
	public Nodes next;

	public Nodes(int value, Nodes next) {
		this.value = value;
		this.next = next;
	}
}

public class EqualHalvesLinkedList2 {

	public static void main(String[] args) {

		Nodes n6 = new Nodes(6, null);
		Nodes n5 = new Nodes(5, n6);
		Nodes n4 = new Nodes(4, n5);
		Nodes n3 = new Nodes(3, n4);
		Nodes n2 = new Nodes(2, n3);
		Nodes n1 = new Nodes(1, n2);

		split(n1);

	}

	private static void split(Nodes n1) {

		Nodes first = n1;
		Nodes second = n1.next;

		while (second != null) {
			first = first.next;

			
			second = second.next;
			if(second == null) break;
			second = second.next;
			
		}

		System.out.println("el corte es en: " + first.value);
	}

}
