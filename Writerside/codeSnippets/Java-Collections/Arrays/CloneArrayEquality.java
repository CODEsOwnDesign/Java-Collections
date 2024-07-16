package cloud.yebei.java.collections.arrays;

public class CloneArrayEquality {
	public static void main(String[] args) {
		String[] alphabets = new String[]{"A", "B", "C", "D", "E", "F", "G", "H"};
		String[] clone = alphabets.clone();
		boolean isEqual = java.util.Arrays.equals(clone, alphabets);
		System.out.println("isEqual: " + isEqual); // => isEqual: true
	}
}
