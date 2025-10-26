import java.util.*;
public class product {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("value of a : ");
		int a  = sc.nextInt();
		System.out.print("value of b : ");
		int b = sc.nextInt();
		int c = a*b;
		System.out.print("value of product is : ");
		System.out.println(c);
		
		//area of circle 
		double pi = 3.14 ;
		System.out.print("ENTER RADII OF CIRCLE ");
		int r = sc.nextInt();
		double A  = pi*r*r ;
		System.out.print("AREA: ");
		System.out.println(A);
		
		sc.close();
	}
}
