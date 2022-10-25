import java.security.SecureRandom;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestSearchSort {
	public static void main(String[] args) {
		int choice = 0;
		String choice1 = "";
		Integer randomArr[] = new Integer[1000];
		Integer[] copyArrB = new Integer[1000];
		Integer[] copyArrI = new Integer[1000];
		Integer[] copyArrS = new Integer[1000];
		Integer[] copyArrM = new Integer[1000];
		Integer[] copyArrQ = new Integer[1000];
		Integer[] sortArr = new Integer[1000];
		Searching search = new Searching();
		SortingAlgorithms<Integer> sort = new SortingAlgorithms<Integer>();
		int searchNumber;
		int indexNumber;
		long startM;
		long endM;
		long startN;
		long endN;
		do {
			displayMenu();
			Scanner keyboard = new Scanner(System.in);
			try {
				choice = keyboard.nextInt();
				keyboard.nextLine();
				switch (choice) {
				case 1:
					Integer[] copyArr = new Integer[1000];
					copyArr = genRandomInts(randomArr);
					System.arraycopy(copyArr, 0, copyArrB, 0, 1000);
					System.arraycopy(copyArr, 0, copyArrI, 0, 1000);
					System.arraycopy(copyArr, 0, copyArrS, 0, 1000);
					System.arraycopy(copyArr, 0, copyArrM, 0, 1000);
					System.arraycopy(copyArr, 0, copyArrQ, 0, 1000);
					System.arraycopy(copyArr, 0, sortArr, 0, 1000);
					System.out.println("Array of randomly generated integers: ");
					System.out.println();
					System.out.println(Arrays.toString(randomArr));
					System.out.println();
					break;

				case 2:
					sort.bubbleSort(sortArr, 1000);
					System.out.println();
					System.out.println(Arrays.toString(sortArr));
					System.out.println();
					System.out.println("Please enter an integer value to search: ");
					searchNumber = keyboard.nextInt();
					keyboard.nextLine();
					startM = System.currentTimeMillis();
					startN = System.nanoTime();
					indexNumber = search.binarySearch(sortArr, 0, 999, searchNumber);
					endM = System.currentTimeMillis();
					endN = System.nanoTime();
					System.out.println();
					if (indexNumber != -1) {
						System.out.println(searchNumber + " was found at index position " + indexNumber
								+ " : Recursive Binary Search");
					} else {
						System.out.println(searchNumber + " was not found : Recursive Binary Search");
					}
					System.out.println();
					System.out.println("Time taken in nanoseconds: " + (endN - startN));
					System.out.println("Time taken in milliseconds: " + (endM - startM));
					System.out.println();
					break;

				case 3:
					sort.bubbleSort(sortArr, 1000);
					System.out.println();
					System.out.println(Arrays.toString(sortArr));
					System.out.println();
					System.out.println("Please enter an integer value to search: ");
					searchNumber = keyboard.nextInt();
					keyboard.nextLine();
					startM = System.currentTimeMillis();
					startN = System.nanoTime();
					indexNumber = search.linearSearch(sortArr, 0, 999, searchNumber);
					endM = System.currentTimeMillis();
					endN = System.nanoTime();
					System.out.println();
					if (indexNumber != -1) {
						System.out.println(searchNumber + " was found at index position " + indexNumber
								+ " : Recursive Linear Search");
					} else {
						System.out.println(searchNumber + " was not found : Recursive Linear Search");
					}
					System.out.println();
					System.out.println("Time taken in nanoseconds: " + (endN - startN));
					System.out.println("Time taken in milliseconds: " + (endM - startM));
					System.out.println(); 
					break;

				case 4:
					do {
						displaySortMenu();
						choice1 = keyboard.nextLine();
						choice1 = choice1.toUpperCase();
						switch (choice1) {
						case "B":
							System.out.println();
							System.out.println(Arrays.toString(copyArrB));
							System.out.println();
							System.out.println("Bubble Sort: Simple sorting algorithm - O(n2) Complexity - In-place");
							System.out.println();
							startM = System.currentTimeMillis();
							startN = System.nanoTime();
							sort.bubbleSort(copyArrB, 1000);
							endM = System.currentTimeMillis();
							endN = System.nanoTime(); 
							System.out.println("Sorted: " + Arrays.toString(copyArrB));
							System.out.println();
							System.out.println("Time taken in nanoseconds: " + (endN - startN));
							System.out.println("Time taken in milliseconds: " + (endM - startM));
							System.out.println();
							break;

						case "I":
							System.out.println();
							System.out.println(Arrays.toString(copyArrI));
							System.out.println();
							System.out
									.println("Insertion Sort: Simple sorting algorithm - O(n2) Complexity - In-place");
							startM = System.currentTimeMillis();
							startN = System.nanoTime();
							System.out.println();
							sort.insertionSort(copyArrI, 1000);
							endM = System.currentTimeMillis();
							endN = System.nanoTime();
							System.out.println("Sorted: " + Arrays.toString(copyArrI)); 
							System.out.println();
							System.out.println("Time taken in nanoseconds: " + (endN - startN));
							System.out.println("Time taken in milliseconds: " + (endM - startM));
							System.out.println();
							break;

						case "S":
							System.out.println();
							System.out.println(Arrays.toString(copyArrS));
							System.out.println();
							System.out
									.println("Selection Sort: Simple sorting algorithm - O(n2) Complexity - In-place");
							startM = System.currentTimeMillis();
							startN = System.nanoTime();
							System.out.println();
							sort.selectionSort(copyArrS, 1000);
							endM = System.currentTimeMillis();
							endN = System.nanoTime();
							System.out.println("Sorted: " + Arrays.toString(copyArrS));
							System.out.println();
							System.out.println("Time taken in nanoseconds: " + (endN - startN));
							System.out.println("Time taken in milliseconds: " + (endM - startM));
							System.out.println();
							break;

						case "M":
							System.out.println();
							System.out.println(Arrays.toString(copyArrM));
							System.out.println();
							System.out.println(
									"Merge Sort: Recursive Divide-And-Conquer - O(n log n) Complexity - Out-of-place");
							startM = System.currentTimeMillis();
							startN = System.nanoTime();
							sort.mergeSort(copyArrM, 0, 999);
							endM = System.currentTimeMillis();
							endN = System.nanoTime();
							System.out.println();
							System.out.println("Sorted: " + Arrays.toString(copyArrM));
							System.out.println();
							System.out.println("Time taken in nanoseconds: " + (endN - startN));
							System.out.println("Time taken in milliseconds: " + (endM - startM));
							System.out.println();
							break;

						case "Q":
							System.out.println();
							System.out.println(Arrays.toString(copyArrQ)); 
							System.out.println();
							System.out.println(
									"Quick Sort: Recursive Divide-And-Conquer - O(n log n) Complexity - In-place");
							startM = System.currentTimeMillis();
							startN = System.nanoTime();
							sort.quickSort(copyArrQ, 0, 999); 
							endM = System.currentTimeMillis();
							endN = System.nanoTime();
							System.out.println();
							System.out.println("Sorted: " + Arrays.toString(copyArrQ));
							System.out.println();
							System.out.println("Time taken in nanoseconds: " + (endN - startN));
							System.out.println("Time taken in milliseconds: " + (endM - startM));
							System.out.println();
							break;

						case "R":
							System.out.println("Returning to the main menu...");
							System.out.println();
							break;

						default:
							System.out.println("Your input choice is invalid");
							System.out.println();
							break;
						}
					} while (!choice1.equals("R"));
					break;

				case 5:
					System.out.println("Exiting... Goodbye");
					keyboard.close();
					break;

				default:
					System.out.println("Please enter a choice between 1-4...");
					System.out.println();
					break;
				}
			} catch (InputMismatchException ime) {
				System.err.println("You must enter an integer value...");
				System.out.println();
			} catch (NullPointerException npe) {
				System.err.println("error...");
				System.out.println();
			}
		} while (choice != 5);
	}


	public static Integer[] genRandomInts(Integer[] arr) {
		SecureRandom random = new SecureRandom();
		for (int i = 0; i < 1000; i++) {
			int randomNumber = random.nextInt(880) + 120;
			arr[i] = randomNumber;
		}
		return arr;
	}

	public static void displayMenu() {
		System.out.println("Select your option in the menu:");
		System.out.println("1: Initialize and populate an array of 1000 random integers.");
		System.out.println("2: Perform recursive binary search.");
		System.out.println("3: Perform recursive linear search.");
		System.out.println("4. Sort the array");
		System.out.println("5: Quit");
		System.out.print(">");
	}

	public static void displaySortMenu() {
		System.out.println("B. Bubble Sort");
		System.out.println("I. Insertion Sort");
		System.out.println("S. Selection Sort");
		System.out.println("M. Merge Sort");
		System.out.println("Q. Quick Sort");
		System.out.println("R. Return to Main Menu");
		System.out.print(">");
	}
}
