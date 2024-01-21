import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		int size = 10;
		int[] array = new int[size];
		System.out.println("Original Array: ");
		for(int i = 0; i<size; i++) {
			array[i] = (int)(Math.random()*100);
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Steps: ");
		sort(array, 0, size-1);
		System.out.println("");
		System.out.println("Sorted Array: ");
		for(int i = 0; i<size; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static int place (int a[], int start, int end) {
		int pivot = a[end];
		int i = (start - 1);
		for(int j = start; j<=end-1; j++) {
			if(a[j]<pivot) {
				i++;
				int x = a[i];
				a[i] = a[j];
				a[j] = x;
			}
		}
		int x = a[i+1];
		a[i+1] = a[end];
		a[end] = x;
		return i+1;
	}
	
	public static void sort(int a[], int start, int end) {
		if(start<end) {
			int p = place(a, start, end);
			sort(a, start, p-1);
			sort(a, p+1, end);
			for(int i = 0; i<a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println("");
		}
	}
}


