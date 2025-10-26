public class Arrays {
	//creating an arrray
	//array as function
	public static void marks(int marks[]){
		for(int i = 0 ; i<marks.length; i++){
			marks[i] = marks[i] + 1;
			
		}
	}
	
	
	//LINEAR SEARCH 
	public static int linearSearch(int array[], int target  ){
	
	 for(int i =0 ; i<=array.length; i++){
		if(array[i]==target){
			return i;
		}
	 }
		return -1;
	}
	
	public static int smallest(int array[]){
		//int largest = Integer.MIN_VALUE;//-infinity
		int smallest = Integer.MAX_VALUE; //+ infinity
		
		//for(int i = 0 ; i<array.length; i++){
		//	if (array[i]>largest) {
		//		largest =array[i];
		//	}
		//}
		//return largest ;
		
		for(int i =0 ; i<array.length; i++){
			if (array[i]<smallest) {
				smallest = array[i];
			}
		}
		return smallest;
	}

		//public static int binarySearch(int array [], int key ){
		//	int start = 0;}
		//	int end = array.length -1;
		//	for(int i = 0; i<array.length; i++){
				
		//	}
		//}
	
		//pairs in aray 
		public static void  printpairs(int array[]){
			int totalpairs = 0;
			for(int i = 0 ; i<array.length; i++){
				int current = array[i];
				 
				for(int j = i+1; j<array.length; j++){
					System.out.print("("+current +"," + array[j]+")");
					totalpairs++;
				}
				System.out.println();
			}
			 System.out.println("toatal pairs are :" +totalpairs);
		}
	
	    //subarray
		public static void printsubarrays(int array[]){
			for(int i = 0; i<array.length; i++){
				int current = array[i];
				for(int j = i; j<array.length; j++){
					int end = j;
					for(int k = current ; k<end; k++){
						System.out.print(array[k] + " "  );
					}
					System.out.println();
				}
				System.out.println();
			}
		}
		
	 public static void main(String[] args) {
		//declarartion of array 
		//int marks[] = new int[50];
		
		//int number[] = {2,5,5};
		int numbers[] ={1,2,3,4,5,6,7,8,9};
		//String name[] = {"harshit","ankit"};
		//int marks[] ={91,23,94};
		
		//for(int i = 0 ; i<marks.length; i++){
		//	System.out.println(marks[i]);
		//}
		
 
		//marks(marks);
		////print updated array 
		//for(int i = 0 ; i<marks.length; i++){
		//	System.out.println(marks[i]);
		//}
		
		//}
		//linear search 
		//int rollno[] = {12,13,19,20};
	    // int target = 20;
		//int index = linearSearch(rollno,target);
		//if(index == -1){
		//	System.out.println("NOT FOUND ");
		//}
		//else{
		//	System.out.println("found " + index);
		//	System.out.println(rollno[index]);
			
		//}
		
		//int num[] ={1,2,4,6,8};
		//System.out.println("LARGEST NUMBER OF THE ARRAY : " + largest(num));
		//System.out.println(smallest(num));
		
		
		//pairs in array 
		
		//printpairs(numbers);
		printsubarrays(numbers);
	 }
	}
    
	

