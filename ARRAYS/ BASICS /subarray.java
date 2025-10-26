public class subarray {
	
	public static void printSubarray(int array[]){
		for(int i=0; i<array.length; i++){
			int start = i; 
			for(int j = 0; j<array.length; j++){
				int end = j;
				for(int k =start ; k<=end; k++){
					System.out.print(array[k]+ " ");
				}
				//for same elment subarray next line 
				System.out.println();
			}
			//for after eery new elment subarry
			System.out.println();
		}
	}
	
	public static void maxsum(int array[]){
		 
		int currsum =0;
		for(int i =0; i<array.length; i++){
			int maxsum = Integer.MIN_VALUE;
			int start = i;
			 
			for(int j =i; j<array.length; j++){
				int end = j;
				
				for(int k = start ; k<=end; k++){
					System.out.print(array[k]+ ", ");
					currsum += array[k];
				}
				 System.out.println( " sum: "+currsum);
				if(currsum>maxsum){
					maxsum =currsum;
				}
				
			 
			}
			System.out.println();
			System.out.println( "max sum : "+maxsum);
			System.out.println();
		}
	}
		
 public static void main (String args[]){
	int group[] = { 4,8,12,};
	//printSubarray(group);
	maxsum(group);
 }
		 
}
