public class binar {
	//binary search
	public static int binarysearch(int array[],int key ){
		 int l = 0;
		 int u = array.length -1;
		 while (l<=u) {
			int mid = (l+ u)/2 ;
			if (array[mid] == key) {
				 return mid ;
				
			}
			else if (array[mid]<key) {
				l = mid +1;
			}
			else  {
				u = mid-1;
			}
		 }
		 
		return -1; 
	}
	
	public static void reverse(int array[]){
	int first = 0;
	int last = array.length -1;
	while(first<last){
		
		int temp = array[first];
		
		array[first] = array[last];
		 array[last] = temp;
		first++;
		last--;
	}
	
	}
	public static void main(String[] args) {
		////binary search always works with sorted list
		//int marks[] = {12,13,14,15,16,17,18,19,20,21};
	    //int check = binarysearch(marks, 29);
		//if (check == -1) {
		//	System.out.println("NOT FOUND");
		//}
		//else{
		//	System.out.println("ELEMENT FOUND ");
		//}
		 
		int number[] = {1,2,3,4,5};
		 reverse(number);
		for(int i =0; i<number.length; i++){
			System.out.print(number[i]+ " ");
		}
		 System.out.println();
		 
		
		}
	}

