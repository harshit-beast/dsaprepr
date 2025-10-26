public class sorting {
	public static void insertionsort(int array[],int n ){
		for(int i =1; i<n; i++){
			int j = i-1;
			int m = array[i];
			while (j>-1 && array[j]>m) {
				array[j+1]= array[j];
				j--;
			}
			array[j+1]=m;
		}
	}
	
	public static void bubblesort(int array[] , int n ){
		for(int i =0; i<n-1;i++){
			for(int j = 0; j<n-1-i;j++){
				if (array[j]>array[j+1]) {
					int temp ;
					temp = array[j];
					array[j]= array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		int array[] = {3,9,1,2,7};
		int n = array.length;
		insertionsort(array,n);
		for(int i =0; i<n; i++){
			System.out.print(array[i] + " ,");
		}
		System.out.println();
		bubblesort(array, n);
		for(int i =0; i<n; i++){
			System.out.print(array[i] + " ,");
		}
	}
}
