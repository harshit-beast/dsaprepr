public class pracc {
	public static class Node{
		int data;
		Node left ; 
		Node right; 
		Node(int data){
			this.data = data;
		}
	}
	
	// prinitng or display a tree 
	public static  void display(Node root){
		if(root==null){
			return ;
		}
		 System.out.print(root.data + " ->");
		if(root.left!=null) System.out.print(root.left.data + "  ");
		if(root.right!=null) System.out.println(root.right.data);
		System.out.println();
		 display(root.left);
		 display(root.right);
		 
	}
	// size
	public static int size(Node root){
		if(root==null) return 0;
		
		return 1 + size(root.left)+size(root.right);
	}
	
	// maximum value of tree node 
	public static int maxvalue(Node root){
		if(root==null)return 0 ;
		int a = root.data;
		int b =  maxvalue(root.left);
		int c =  maxvalue(root.right);
		return Math.max(a,Math.max(b, c));
	}
	///height of tree node 
	/// public static int
	public static int height(Node root){
		if(root==null){
			return 0;
		}
		if(root.left==null)return 0;
		if(root.right==null)return 0;
		return 1+ Math.max(height(root.left),height(root.right));
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
	    root.left = b;
		root.right = c;
		Node d = new Node(4);
		Node e = new Node(5);
		b.left = d;
		b.right = e;
		display(root);
		System.out.println(size(root));
		System.out.println("max value :"+maxvalue(root));
		System.out.println("height of tree is : " + height(root));
		
	}
}
