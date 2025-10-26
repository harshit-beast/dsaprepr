public class Advpattern {
	
	public static void Hollow_rectangle(int totalRows, int totalcols){
		for(int i = 1; i<=totalRows; i++){
			for(int j = 1; j<=totalcols; j++){
				if(i==1||j==1||i==4||j==5){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}
//HALFPYRAMID INVERTED
	public static void inverted_halfpyramid(int totalRows, int totalcols){
		for(int i = 1; i<=totalRows; i++){
			//spaces
			for(int j = 1; j<=totalRows-i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		
		}
	}
	//HALF PYRAMID WITH NUMBERS 
	public static void half_numpyramid(int totalRows , int totalCols){
		for(int i = 1; i<=5; i++){
			for(int j = 1; j<=totalRows-i+1; j++){
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	//FLOYD's TRIANGLE
	public static void FloydTriangle(int totalRows){
		int n =1;
		for(int i = 1; i<=totalRows; i++){
			for(int j = 1; j<=i; j++){
				System.out.print(  n + " " );
				n = n+1;
			}
			 
			System.out.println();
		}
	}
	//0- 1traingle 
	public static void ZeroOneTraingle(int totalRows  ){
		for(int i = 1; i<=totalRows; i++){
			for(int j = 1; j<=i; j++){
				if ((i+j)%2 == 0 ) {
					System.out.print(" 1 ");
				}
				else{
					System.out.print(" 0 ");
				}
			}
			System.out.println();
		}
	}
	
	//BUTTERFLY PATTERN 
	public static void Butterflypattern(int totalRows , int totalCols){
		int n = 4;
		//1st half
		for(int i = 1; i<=4 ; i++){
			//stars
			for(int j = 1 ; j<=i ; j++){
				System.out.print("*");
			}
			//spaces
			for(int j = 1; j<=2*(n-i); j++){
				System.out.print(" ");
			}
			for(int j = 1 ; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		//2nd half
		for(int i = 4; i>=1 ; i--){
			//stars
			for(int j = 1 ; j<=i ; j++){
				System.out.print("*");
			}
			//spaces
			for(int j = 1; j<=2*(n-i); j++){
				System.out.print(" ");
			}
			for(int j = 1 ; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	 
	
	//SOLID RHOMBUS 
	public static void Solidrhombus(int totalRows ){
		int n = 5;
		for(int i = 1; i<=5; i++){
			//spaces
			for(int j =1; j<=(n-i); j++){
				System.out.print(" ");
			}
			//stars
			for(int j = 1 ; j<=n; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	//HOLLOW RHOMBUS 
	public static void Hollow_rhombus(int totalRows){
		//spaces
		for(int i = 1; i<=totalRows; i++){
			int n = 5;
			for(int j = 1; j<=n-i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= 5; j++){
				 if(i == 1|| j==5|| i==5||j==1){
					System.out.print("*");
				 }
				 else{
					System.out.print(" ");
				 }
			}
			System.out.println();
		}
	}
	
	public static void Diamondpattern(int totalRows){
		
		for(int i = 1; i<=totalRows; i++){
			//spaces
			for(int j = 1; j<=totalRows-i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j<=(2*i)-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	
	// 2ndhalf
	  for(int i = totalRows; i>=1; i--){
		//spaces
		for(int j = 1; j<= totalRows-i; j++){
			System.out.print(" ");
		}
		for(int j = 1; j<=(2*i)-1; j++){
			System.out.print("*");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		//Hollow_rectangle(4, 5);
		//inverted_halfpyramid(4, 5);
		//half_numpyramid(5, 5);
		//FloydTriangle(5);
		//ZeroOneTraingle(5);
		//Butterflypattern(8, 8);
		//Solidrhombus(5);
		//Hollow_rhombus(5);
		Diamondpattern(4);
		
		
	
		
	}
}
