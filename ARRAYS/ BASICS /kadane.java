/**
 * kadane
 */
public class kadane {
       public static int maxsubarr(int array[]){
		int sum =0;
		int max = array[0];
		for(int i =0; i<array.length; i++){
			sum = sum + array[i];
		 
			if (sum<0){
				sum =0;
			}
			max = Math.max(max,sum);
		}
		return max;
	   }
	public static void main (String args[]){
		int array[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxsubarr(array));
		
	}
}