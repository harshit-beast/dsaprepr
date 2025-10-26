public class pattern {
	public static void main(String[] args) {
		 //square patttern
		 
		// for(int i = 0 ; i<4; i++){
		//	for(int j = 0 ; j<4; j++){
		//		System.out.print("*");
		//	}
		//	System.out.println(" ");
		// }
		
		//Star pattern
		// for(int i = 1 ; i<=4; i++){
		//	//one line 
		//	for(int j = 1; j<=i; j++){
		//		System.out.print("*");
		//	}
		//	System.out.println(" ");
		// }
		 
		//INVERTED STAR 
		//int n = 4;
		//for(int i = 1; i<=n; i++){
		//	for(int j = 1; j<= n-i+1; j++){
		//		System.out.print("*");
		//	}
		//	System.out.println();
		//}
		
         //HALF PYRAMID PATTERN 
		// int n = 4;
		// for(int i = 1; i<=n; i++ ){
		//	for(int j = 1; j<=i; j++){
		//		 System.out.print(j);
		//	}
		//	System.out.println();
		// }
		
		//character pattern
		char ch = 'A'; 
		for(int i= 1; i<=4; i++){
			for(int j = 1; j<=i; j++){
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		
		
		}
	}