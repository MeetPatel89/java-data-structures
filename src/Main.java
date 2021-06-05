
public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello Main");
		Node nodeObj1 = new Node("Node One");
		Node nodeObj2 = new Node("Node Two");
		nodeObj1.setNextNode(nodeObj2);
		System.out.println(nodeObj1.getNextNode());
		System.out.println(nodeObj2);
		System.out.println(nodeObj1.getNextNode().getData());
	}
}
