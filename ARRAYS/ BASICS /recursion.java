import java.util.*;
public class recursion {
	
	//to print number in decreasing order
	public static void printnum(int n ){
		if(n==1){
			System.out.println(n);
			return;
		}
		System.out.println(n+" ");
		printnum(n-1);
		
	}
	
	
	// to print number in increasing order 
	public static void printnuminc(int n){
		if(n==1){
			System.out.println(n);
			return;
		}
		printnuminc(n-1);
		System.out.println(n);
	}
	
	
	
	// factorial of a number 
	public static int fact(int n){
		if(n==0){
			return 1;
		}
		int fnminus1 = fact(n-1);
		int factofn = n*fnminus1;
		return factofn;
	}
	//sum of first n naturalnumber using recursion
	public static int sumofnnaturalnum(int n ){
		if(n==1){
			return 1;
		}
		int funcnminus1 = sumofnnaturalnum(n-1);
		int sum = n + funcnminus1;
		return sum ;
	}
	
	//fibonacci number 
	public static int fibonacci(int n ){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		int  fibonplus1 = fibonacci(n-1);
		 
		int fibonplus2 = fibonacci(n-2);
		 
	 
		int sum = fibonplus1 +fibonplus2;
		return sum  ;
	}
	
	//check if array is sorted
	public static boolean checkifsorted(int arr[],int i){
		
		
		if(i==arr.length-1){
			return true ;
		}
		 
		if(arr[i]>arr[i+1]){
			return false;
		}
	 
		 
		
	      
		return checkifsorted(arr, i+1);
		 
	}
	
	
	// last occurence of an element in array
	public static int occur(int arr[],int key  , int i){
		 
		 if(i <= 0){
			return -1;
		 }
		 if(arr[i]==key){
			return i;
		 }
		 
		return occur(arr, key,i-1);
	}
	
	// program to print x^n 
	
public static int powerofx(int x , int n ){
	if(n==0){
		return 1;
	}
		int xnm1 = powerofx(x, n-1);
		int xn = x*xnm1;
		return xn;
	}
	
	//optimized power
	public static int optimized(int x, int n ){
		 if(n == 0 ){
			return 1;
		 }
		 int halfpower = optimized(x, n/2);
		int halfpowersq = halfpower*halfpower;
		// if n is odd
		if(n%2 != 0 ){
			halfpowersq = x*halfpowersq;
		}
		return halfpowersq;
	}
	
	//tiling problem 
	public static int tilingproblem(int n){
		
		if(n==0 || n==1){
			return 1;
		}
		//vertically place
		//2 * n-1
		
		int vertical = tilingproblem(n-1);
		//horizpontal 
		//2*n-2
		int horizontal = tilingproblem(n-2);
		int totalways  = vertical + horizontal ;
		return totalways;
		
	}
	//duplicates from string
	public static void removeduplicate(String str, int idx , StringBuilder newstr  , boolean map[] ){
		if(idx == str.length()){
			System.out.println(newstr);
			return;  
		}
		char current = str.charAt(idx);
		
		if(map[current - 'a']==true){
			removeduplicate(str, idx +1, newstr, map);
		}
		
		else{
			map[current - 'a'] = true ;
			removeduplicate(str, idx, newstr.append(current), map);
		}
		
	}
	//freind pair
	public static int pairproblem(int n ){
		if(n==1 || n==2){
			return n;
		}
		int single = pairproblem(n-1);
		int pair = pairproblem(n-2);
		int total = single + pair*(n-1);
		return total;
	}
	
	
	
	public static void main(String[] args) {
		//int n = 10;
		//printnum(n);
		//System.out.println();
		//printnuminc(n);
		//System.out.println(fact(n));
		//System.out.println();
		//System.out.println("sum of first n natural number : ");
		//System.out.println(sumofnnaturalnum(5));
		
		
	//	for(int i = 0; i<=n; i++){
	//		System.out.print(fibonacci(i) + " ,");
	//	}
	//	System.out.println(fibonacci(5));
	
	
	// int i  = 0;//for first occurence of element 
	
	
	 int arr[] = {5,5,5};
	 int i = arr.length-1;    //last occurence of element 
	
	 System.out.println(checkifsorted(arr,i));
	 int key = 1;
	 
	System.out.println( occur(arr, key,i));
	 Scanner sc = new Scanner (System.in);
	 
 System.out.println(powerofx(2, 4));
 System.out.println(optimized(2, 40));
 System.out.println(tilingproblem(2));
	sc.close();
	
	
	// remove duplicates string
	String str = "appnacollege";
	StringBuilder sb = new StringBuilder("");
	
	boolean map[] = new boolean[26];
	 
	
	
	
	removeduplicate(str, 0, sb ,  map); 
	System.out.println(pairproblem(3));
	
	
	
	
}
	
	
}
