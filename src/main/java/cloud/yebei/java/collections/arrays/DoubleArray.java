package cloud.yebei.java.collections.arrays;

public class DoubleArray {
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("Original array 1 size: " + array1.length);
		System.out.println("New array 1 size: " + doubleArray(array1).length);
		System.out.println("Original array 2 size: " + array2.length);
		System.out.println("New array 2 size: " + doubleArray(array2).length);
	}

	static int[] doubleArray(int[] originalArray) {
		int length = originalArray.length;
		int[] newArray = new int[length * 2];
		System.arraycopy(originalArray, 0, newArray, 0, length);
		return (newArray);
	}
}
