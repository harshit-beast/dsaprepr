public class basetrav {
	public static class Node{
		int data;
		Node left ; 
		Node right; 
		Node(int data){
			this.data = data;
		}
	}
	public static void preorder(Node root){
		if(root==null){
			return;
		}
		//preorder is root left and right
		System.out.println(root.data);
	    preorder(root.left);
		preorder(root.right);
	}
	public static void Inorder(Node root){
		if(root==null){
			return;
		}
		//preorder is root left and right
		Inorder(root.left);
		System.out.println(root.data);  
		Inorder(root.right);
	}
	public static void Postorder(Node root){
		if(root==null){
			return;
		}
		//preorder is root left and right
		Postorder(root.left);
		Postorder(root.right);
		System.out.println(root.data); 
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		Node a = new Node(2);
		Node b = new Node(3);
	    root.left = a;
		root.right = b;
		Node c = new Node(4);
		Node d = new Node(5);
		a.left=c;
		a.right = d;
		Node e = new Node(6);
		Node f = new Node(7);
		b.left = e;
		b.right = f;
		 preorder(root);
		 System.out.println();
		 Inorder(root);
		 System.out.println();
		 Postorder(root);
		
	}
}
