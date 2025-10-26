public class llimplmntstack {
	
	public static class Node {
		int data ;
		Node next;
		Node (int data ){
			this.data = data;
			this.next = null ;
		}
	}
	
	public static class Stack{
	  Node head  ;
	  int size = 0;
	  Stack(){
		 head = null;
	  }
	//  push operation 
	  void push(int x){
		Node temp = new Node(x);
		temp.next = head;
		head = temp;
		size++;
	  }
	  //pop operation 
	  int pop(){
		 int top = head.data;
		 head = head.next ;
		 size--;
		 return top ;
	  }
	  
	  
	  
	  int  stsize(){
		return size;
	  }
	  
	  
	  //display stack function 
		void displaystack(){
		Node temp = head;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
		}
	}
	public static void main(String[] args) {
		 Stack st = new Stack();
		 st.push(4);
		 st.push(5);
		 st.push(85);
		 System.out.println("original stack : ");
		 st.displaystack();
		 st.pop();
		 System.out.println("after pop ");
		 st.displaystack();
		 System.out.println("size of stack is  :");
		 System.out.println(st.stsize());
	}
}
