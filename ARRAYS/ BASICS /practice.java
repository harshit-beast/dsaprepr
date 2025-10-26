import java.util.*;
public class practice {
	public static int linearSearch(int array[] , int target){
		
      for(int i = 0 ; i<array.length; i++){
		if (array[i] == target) {
			return i;
		}
	}	
	return -1;
}

	
	
	public static void main (String args[]){
		Scanner sc  = new Scanner(System.in);
		/*
		
		System.out.println("enter the cost :");
		float eraser = sc.nextFloat();
		float pen = sc.nextFloat();
		float pencil = sc.nextFloat();
		float total = (eraser + pen + pencil );
		
		System.out.println("TOTAL WITHOUT GST :");
		System.out.println(total);
		 
		float a = total*0.18f + total;
		System.out.println("TOTAL WITH GST : ");
		System.out.println(a);
		*/
		//int $ = 5;
		
		// conditional statement assignmenet
		//question 1
		
		//int n = sc.nextInt();
		//if (n>0) {
		//	System.out.println(+n + " number is positive");
		//}
		//else if ( n<0) {
		//	System.out.println( + n + " number is negative ");
		//} 
		
		//question 2
		//System.out.println(" ENTER THE INTEGER :  "); 
		//int n = sc.nextInt();
        //int evensum = 0;
		//int oddsum = 0;
		//int choice ;
		// do {
		//	if (n%2 == 0) {
		//		evensum += n ;
		//	}
		//	else{
		//		oddsum+= n;
		//	}
		//	System.out.println(" CHOICE : ");
		//	choice = sc.nextInt();
		// } while (choice == 1 );
		// System.out.println(evensum);
		// System.out.println(oddsum);
		 
		
		 //factorial
		// int n = sc.nextInt();
		// int c ;
		// int c = 1;
		// for(int i = n; i>1; i--){
		// c = c*i;
		// }
		// for(int i = 1; i<11; i++){
        //  c = n*i;
		//  System.out.println(c);
		// }
	 
		 
		//System.out.println(c);
		
		
		//sum upto n number 
		
    //   System.out.print("ENTER NUMBER : ");
	//   int n = sc.nextInt();
	//   int c = 0;
	//   for(int i = 1 ; i<=n; i++){
	//	c =  c+i;
	//   }
	// System.out.println(c);
	 
	// //square patttern
	// for(int i = 0 ; i<4; i++){
	//	for(int j = 0 ; j<4; j++){
	//		System.out.print("*");
	//	}
	//	System.out.println(" ");
	// }
	  
		//Inveerted square pattern 
		//int n = 4;
		//  for(int i = 1; i<=n; i++){
		//	for(int j = 1; j<=n-i+1; j++ ){
		//		System.out.print("*");
		//	}
		//	System.out.println();
		//  }
		 
		
		//half pyramid pattern
		//int n = 6;
		//for(int i = 1 ; i<=n; i++){
		//	for(int j = 1; j<=i; j++){
		//		System.out.print(j);
		//	}
		//	System.out.println();
		//}
		
		//character pattern
		//int n = 4;
		//char ch = 'A';
		//for(int i =1; i<=n; i++){
		//	for(int j = 1; j<=i; j++){
		//	System.out.print(ch);
		//	ch++;
		//	}
		//	System.out.println();
		//}
		
		// check a number is prime or not
		//linear search 
		
	 int marks[] = {12,54,89,90};
	 int index = linearSearch(marks, 99);
	 if (index == -1) {
		System.out.println("NO ELEMENT FOUND ");
	 }
	 else{
		System.out.println("ELEMENT FOUND ");
	 }
		sc.close();
	
	}
}
