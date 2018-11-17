package arrays;

public class MinimumSwaps {

	
	public static boolean isSorted(int arr[]) {
		
		for(int i = 0; i < arr.length - 1; i ++) 
			if(arr[i] > arr[i + 1])
				return false;
		
		return true;
	}
	
	public static int minimumSwaps(int arr[]) {
		
		int swaps = 0;
		
		for(int e: arr)
			System.out.print(e + " ");
		System.out.println();
		
		while(!isSorted(arr)) {
			
			int swap = -1;
			int swapPos = -1;
			int current = 0;
			
			for(int i = 0; i < arr.length - 1; i ++)
				if(arr[i] > arr[i + 1]) {
					swap = arr[i];
					swapPos = i;
					break;
				}
			
			System.out.print("Take " + swap);
			
			int i = swapPos + 1;
			
			while(arr[i] < arr[i + 1] && swap > arr[i])
				i ++;
			
			int aux;
			if(arr[i] > arr[i + 1]) {
				aux = arr[i + 1];
				arr[i + 1] = swap;
				arr[swapPos] = aux;
			} else {
				aux = arr[i];
				arr[i] = swap;
				arr[swapPos] = aux;
			}
			
			System.out.println(" and change with " + arr[i + 1]);
			System.out.println();
			
			
			for(int e: arr)
				System.out.print(e + " ");
			System.out.println();
			//break;
			
		}
		
		return swaps;
	}
	
	public static void main(String args[]) {
		
		int arr[] = {7, 1, 3, 2, 4, 5, 6};
		int a[] = {1, 2, 3, 7, 5, 6, 7, 8, 9};
		System.out.println(minimumSwaps(arr));
	}
	
}
