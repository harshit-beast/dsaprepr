public class baseimpl {
	public static class Node{
		int data;
		Node left;//null
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	public static void display(Node root){
		if(root==null){
			return;
		}
		System.out.print(root.data+ "->");
		if(root.left!=null)System.out.print(root.left.data+ " ");
		if(root.right!=null)System.out.print(root.right.data +  " ");
		System.out.println();
		display(root.left);
		display(root.right);
		
	}
	public static void main(String[] args) {
		Node root = new Node(2);
		System.out.println(root.data);
		Node a = new Node(4);
		Node b = new Node(10);
		root.left = a;
		root.right = b;
		Node c = new Node(6);
		Node d = new Node(5);
		a.left = c;
		a.right = d;
		Node e = new Node(11);
		b.right = e;
		//display
		display(root);
		
		
		
	}
}

