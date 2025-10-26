public class function2 {
	
	//prime num function
	// public static boolean isprime(int n ){
	//	for(int i = 2; i<= n-1; i++){
	//		if (n%i==0) {
	//			return false;
	//		}
			
	//	}
	//	return true ;
	// }

	
	//optimized approcah 
	//public static boolean isPrime(int n ){
	//	for(int i =2; i<=Math.sqrt(n); i++){
	//		if (n%i == 0) {
	//			return false ;
	//		}
	//	}
	//	return true ;
	//}
	
	//public static void primeInrange(int n){
	//	for(int i = 2; i<=n; i++){
	//		if(isPrime(i)){
	//			System.out.println(i);
	//		}
	//	}
	//}
	
	//FUNCTION TO CONVERT BINARY TO DECIMAL 
	public static void binToDec(int n ){
		int pow = 0;
		int binNum = n;
		int myNum = binNum;
		int decnum = 0;
		
		while (binNum>0) {
			int lastdigit = binNum%10;
			decnum = decnum + (lastdigit*(int)Math.pow(2, pow));
			pow++; 
			binNum =binNum/10;
		}
		 
		System.out.println("binary to decimal of " + myNum+ " = "+ decnum);
	}
	
	//FUNCTION TO CONVERT DECIMAL TO BINARY 
	public static void DecTobin(int n ){
		int pow = 0;
	     int binNum = 0;
		 int myNum = n;
		 while(n>0){
			int rem = n%2;
			binNum = binNum + (rem*(int)Math.pow(10, pow));
			pow++;
			n =n/2;
		 }
		 System.out.println("decimal to binary of " + myNum + " = " + binNum);
	}
	public static void main(String[] args) {
		
	//	//System.out.println(isPrime(4));
	//	primeInrange(12);
	//}
	 binToDec(101);
	 DecTobin(7);
	
	}
}
