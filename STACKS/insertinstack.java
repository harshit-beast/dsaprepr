import java.util.*;

public class insertinstack {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(3);
		st.push(5);
		st.push(6);
		System.out.println( "orignal stack : " +st);
		//now let insert 9 at index 0
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE INDEX AT WHICH YOU INSERT : ");
		int idx = sc.nextInt();
		System.out.println("enter element : " );
		int n = sc.nextInt();
		if(idx>st.size()){
			System.out.println("out of bond ubnable to insert in stack");
		
		}
		Stack<Integer> temp = new Stack<>();
		while(st.size()>idx){
		temp.push(st.pop());
		}
		st.push(n);
		while(temp.isEmpty()!=true){
			st.push(temp.pop());
		}
		System.out.println("new stack : " + st);
		sc.close();
		
		
		
		
	}
}
