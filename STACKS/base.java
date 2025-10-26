//import java.util.Stack;     specially for the stack inbuilt
import java.util.*;
public class base {
 public static void main(String[] args) {
	Stack <Integer> st = new Stack<>();
	//stack push operation
	st.push(5);
	st.push(4);
	st.push(3);
	st.push(7);
	st.push(8);
	//printing stack from bottom to top 
	System.out.println(st);
	System.out.println(st.peek());
	//stack pop operation removes top most element
	st.pop();
	System.out.println( "new stack after pop : " + st);
	while(st.size()>2){
		System.out.println( "now :"+st.size());
		 st.pop();
	}
	System.out.println("new 2 : " + st);
	System.out.println(st.isEmpty());
	
	
 }
}
