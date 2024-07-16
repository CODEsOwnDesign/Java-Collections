package cloud.yebei.java.collections.arrays;

public class ArrayArgs2 {
	public static void main(String[] args) {
		try {
			int i = 0;
			do {
				System.out.println("Args " + i + ": " + args[i++]);
			} while (true);
		} catch (ArrayIndexOutOfBoundsException ignored) {

		}
	}
}