 
public class arrimplmttnstck {
	public static class Stack{
		// array to stor ealemeent
		int arr[];
		int capacity ;
		int top = -1;
		
		Stack(int size){
			arr = new int [size];
			capacity = size;
		}
		
		//push to stack 
		void push(int x){
			//overflow
			if(top==capacity-1){
				System.out.println("Stack overFlow");
				return;
			}
			arr[++top]= x;
			
		}
		int pop(){
			//underflow
			  if(isEmpty()){
				System.out.println("underflow");
				return -1;
			  }
			return arr[top--];
		}
	   boolean isEmpty(){
	 
	    return top==-1;
     	}
		boolean isfull(){
			 return top == capacity -1;
		}
		
	 int peek(){
		return arr[top];
	 }
	}
	public static void main(String[] args) {
 
		Stack st = new Stack(4);
        st.push(5);
        st.push(7);
        st.push(9);
        st.push(11);
    

        System.out.println("Top element: " + st.peek());
        System.out.println("Pop: " + st.pop());
        System.out.println("Pop: " + st.pop());
        System.out.println("Is Empty: " + st.isEmpty());
        System.out.println("Is Full: " + st.isfull());
		 
	}
}
