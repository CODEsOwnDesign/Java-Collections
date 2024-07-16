package cloud.yebei.java.collections.arrays;

/**
 * new type[] {comma-delimited-list}
 * <p>
 * To demonstrate, the following line shows how to call a method
 * and pass to it an anonymous array of String objects:
 */

public class AnonymousArray {
	public static void main(String[] args) {
		// Calling method with an anonymous array
		new AnonymousArray().method(new String[]{"Leonardo", "da", "Vinci"});
	}

	public void method(String[] names) {
		for (String name : names) {
			System.out.println(name);
		}
	}
}
