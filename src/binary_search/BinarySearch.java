package binary_search;

public class BinarySearch {
	
	static int binarySearch(int[] array, int target) {
		
		
		int min = 0;
		int max = array.length - 1;
			
		int mid = (min + max) / 2;
		
		
		while(true) {
			
			mid = (min + max) / 2;
			if(min > max) {
				return -1;
			}
			if(array[mid] == target) {
				return mid;
			}
			else if(array[mid] < target) {
				min = mid + 1;
			} 
			else if(array[mid] > target) {
				max = mid - 1;
			}
			
			}
		}
	}

