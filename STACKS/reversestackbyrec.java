import java.util.Stack;

public class reversestackbyrec {
	public static void displaystack(Stack <Integer> st){
		if(st.size()==0) return;
	
		int top = st.pop();
		System.out.println(top);
		displaystack(st);
		st.push(top); 
	}
	public static void pushatbottom(Stack<Integer> st, int x){
	       if(st.isEmpty()){
			st.push(x);
			return;
		   }
		int top = st.pop();
		pushatbottom(st,x);
		st.push(top);
	}
	public static void reversestack(Stack<Integer> st){
		Stack <Integer> rt = new Stack<>();
		while(st.size()>0){
			rt.push(st.pop());
		} 
		 System.out.println(rt);
	}
	public static  void  revertackbyrec(Stack<Integer> st){
	 
	 if(st.size()<=1){
		 return;
	 }
	 int top = st.pop();
	  revertackbyrec(st);
	  pushatbottom(st, top);
	}
	public static void main(String[] args) {
		Stack <Integer> st = new Stack<>();
	   st.push(1);
	   st.push(4);
	   st.push(7);
	   st.push(6);
	   System.out.println( "original stack : " + st);
   displaystack(st);
	 pushatbottom(st, 90);
	 reversestack(st);
	 revertackbyrec(st);
  System.out.println("recur");  
  
	}
}
