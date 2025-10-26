import java.util.*;
public class cond {
	public static void main(String[] args) {
		/*int a = 10 ;
		if (a>9) {
			System.out.println(a-1);
		}
		else{
			System.out.println(a);
		}
		 */
		//print largest of two number ;
		Scanner sc  = new Scanner(System.in);
		
		
		
		/*System.out.println("ENTER FIRST NUMBER : ");
		int a = sc.nextInt();
		System.out.println("ENTER SECOND NUMEBR : ");
		int b =sc.nextInt();
		
		if ( a>b) {
			System.out.println(a);
		}
		if ( a==b) {
			System.out.println(a);
		}
		if (a<=b) {
			System.out.println(a);
		}
		if(a>=b){
			System.out.println(a);
		}*/
		//largest of three 
		//int a = 8;
		//int b =9;
		//int c = 7;
		//System.out.println("MAX NUM IS : ");
		// if(a>=b && a>=c){
		//	System.out.println(a);
		// }
		// else if (b>=c) {
		//	System.out.println(b);
		// }
		// else
		// {
		//	System.out.println(c);
		// }
		
		//ternary operator
		// int a = 8;
		// String b = ((a*2)%2 == 0) ? "even" : "odd";
		// System.out.println(b);
		// int marks = sc.nextInt();
		// String d = (marks>=33)? "pass": "fail";
		// System.out.println(d);
		int a = sc.nextInt();
		int b = sc.nextInt();
		char operator = sc.next().charAt(0);
		switch (operator) {
			case '+' :
				System.out.println(a+b);
				break;
				case '-':
				System.out.println(a-b);
				break;
				
				case '/' : 
				System.out.println(a/b);
				break;
				case '*' :
				System.out.println(a*b);
				break;
				case '%' :
				System.out.println(a%b);
				break;
		
			  default:
			  System.out.println("wrong operator");
				break;
		}
		
		
		sc.close();
	}
}
