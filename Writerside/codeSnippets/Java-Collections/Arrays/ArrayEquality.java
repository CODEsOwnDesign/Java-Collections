package cloud.yebei.java.collections.arrays;

public class ArrayEquality {
	public static void main(String[] args) {

		java.awt.Button[] buttons = {
				new java.awt.Button("One"),
				new java.awt.Button("Two"),
				new java.awt.Button("Three")
		};
		java.awt.Component[] components = buttons;
		System.out.println(components == buttons); // => true
	}
}
