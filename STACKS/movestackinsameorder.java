import java.util.*;

public class movestackinsameorder {
public static void main(String[] args) {
	Stack<Integer> st = new Stack<>();
	int n ; //size of stack
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTEER ELEMENT TO INSERT : ");
	n = sc.nextInt();
	System.out.println("ENTEER ELEMENT TO INSERT : ");
	 for(int i = 0 ; i<n; i++){
	 int x = sc.nextInt();
	 st.push(x);
	 }
	 System.out.println(st);
	 
	 //reverse order 
	 Stack <Integer> rt = new Stack<>();
	 while(st.size()>0){
		rt.push(st.pop());
	 }
	 System.out.println("reverse order stack :" + rt);
	 //cpied stack
	 
	 Stack <Integer> gt = new Stack<>();
	 while(rt.size()>0){
		gt.push(rt.pop());
	 }
	 System.out.println( "copied stack : " + gt);
	sc.close();
}	
}
