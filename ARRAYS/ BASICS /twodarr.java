import java.util.*;
public class twodarr {
	public static boolean search2darr(int array[][],int key){
		for(int i = 0; i<array.length;i++){
			for(int j = 0; j<array[0].length; j++){
				if(array[i][j]==key){
					System.out.println("found at : "+"("+i+","+j+")");
					return true;
				}
			}
		}
		System.out.println("not found");
		return false;
	}
	
	
	public static int largestelement(int array[][]){
	int max = Integer.MIN_VALUE;
	for(int i = 0; i<array.length; i++){
		for(int j =0;j<array[0].length; j++){
			if(array[i][j]>max){
				max = array[i][j];
			}
		}
	}
	return max;
	}
	
	
	public static int smallestelement(int array[][]){
		int min = Integer.MAX_VALUE;
		for(int i =0; i<array.length; i++){
			for(int j = 0;j<array[0].length; j++){
				if(min>array[i][j]){
					min = array[i][j];
				}
			}
		}
		return min;
	}
	public static void main (String args[]){
		int arr[][] = new int[3][3];
		int n = arr.length;
		int m = arr[0].length;
		Scanner sc =new Scanner(System.in);
		for(int i =0; i<n;i++){
			for(int j =0; j<m; j++){
			arr[i][j]=sc.nextInt();
			}
		}
			 //
			for(int i =0; i<n;i++){
				for(int j =0; j<m;j++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
			//search in two arrray 
			int target = 5;
			search2darr(arr, target);
			
			
			
			//largest element in two array 
			System.out.println("largest eleemtn of 2d array is :"+largestelement(arr));
			
			//smallest element in array
			System.out.println("smallest elemtn in array : "+smallestelement(arr));
			sc.close();
		}
	}

