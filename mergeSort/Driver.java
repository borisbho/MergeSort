package mergeSort;

public class Driver {

	public static void main(String[] args) {
		
		MergeSort ms = new MergeSort();
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		ms.printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		ms.printArray(arr);
	}

}
