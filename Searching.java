
public class Searching {

	public int binarySearch(Integer[] arr, int start, int end, int number) {          
		if (end < start || number <arr[start] || number > arr[end]|| arr.length == 0) {
			return -1;
		}

		if (arr[start]==number) {
			return start;
		}
			int mid = start + (end-start) / 2;			
			if (arr[mid] > number) {
				return binarySearch(arr, start, mid-1,number);			
			} else if (arr[mid] < number) {
				return binarySearch(arr, mid+1, end, number);			
			} else {
				return binarySearch(arr, start+1, mid, number);
			}			
	}

	public int linearSearch(Integer[] arr, int start, int end, int number) {
		if (arr.length == 0 || start > end) {
			return -1;
		}

		if (start <= end)
			if (arr[start] == number) {
				return start;
			} else {
				return linearSearch(arr, start + 1, end, number);
			}
		return 0;
	}
}
