
public class Node {
	private String data;
	private Node next;
	
	public Node(String data) {
		this.data = data;
	}
	
	public String getData() {
		return this.data;
	}
	
	public Node getNextNode() {
		return this.next;
	}	
	
	public void setNextNode(Node node) {
		this.next = node;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Node");
		
	}
}
