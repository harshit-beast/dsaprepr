
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data ;
		}
	}
public class lll {
 
	public static void main(String[] args) {
	Node n1 = new Node(4);
	System.out.println(n1.data);	
	Node n2 = new Node(5);
	n1.next = n2;
	System.out.println(n1.next.data);
	}
}
