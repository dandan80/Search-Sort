

public class SortingAlgorithms<E> {
	public void bubbleSort(E[] arr, int length) {
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - 1 - i; j++) {
				if ((Integer) arr[j] > (Integer) arr[j + 1]) {
					E temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public void insertionSort(E[] arr, int length) {
		for (int i = 1; i < length; i++) {
			int j = i;
			E temp = arr[i];
			while (j > 0 && (Integer) arr[j - 1] > (Integer) temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			if (j != i) {
				arr[j] = temp;
			}
		}
	}

	public void selectionSort(E[] arr, int length) {
		for (int i = 0; i < length; i++) {
			int mark = i;
			for (int j = mark; j < length; j++) {
				if ((Integer) arr[mark] > (Integer) arr[j]) {
					mark = j;
				}
			}
			E temp = arr[i];
			arr[i] = arr[mark];
			arr[mark] = temp;
		}
	}

	public void mergeSort(E[] arr, int start, int end) {
		if (start >= end) {
			return;
		}
		int mid = (end + start) / 2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid + 1, end);
		merge(arr, start, mid, end);
	}

	private void merge(E[] arr, int start, int mid, int end) {
		Integer[] tempArrMerge = new Integer[end - start + 1];
		int i = start;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= end) {
			if ((Integer) arr[i] < (Integer) arr[j]) {
				tempArrMerge[k] = (Integer) arr[i];
				k++;
				i++;
			} else {
				tempArrMerge[k] = (Integer) arr[j];
				k++;
				j++;
			}
		}
		while (i <= mid) {
			tempArrMerge[k] = (Integer) arr[i];
			k++;
			i++;
		}

		while (j <= end) {
			tempArrMerge[k] = (Integer) arr[j];
			k++;
			j++;
		}
		for (int k2 = 0; k2 < tempArrMerge.length; k2++) {
			arr[k2 + start] = (E) tempArrMerge[k2];
		}
	}
	
	public void quickSort(E[] arr, int left, int right) {
		if (left >= right) {
			return;
		}
		int i = left;
		int j = right; 
		E pivot = arr[i];

		while (i < j) {

			while (i < j && (Integer) arr[j] > (Integer) pivot) {
				j--;
			}
			if (i < j) {
				arr[i++] = arr[j];
			}
			while (i < j && (Integer) arr[i] < (Integer) pivot) {
				i++;
			}
			if (i < j) {
				arr[j--] = arr[i];
			}
		}
		arr[i] = pivot;
		quickSort(arr, left, j - 1);
		quickSort(arr, i + 1, right);
		return;
	}
}
