package cloud.yebei.java.collections.arrays;

public class ArrayReflection {
	public static void main(String[] args) {
		printTypes(args);
	}

	private static void printTypes(Object object) {
		Class<?> type = object.getClass();
		if (type.isArray()) {
			Class<?> elementType = type.getComponentType();
			System.out.println("Array of: " + elementType);
			System.out.println("Length: " + java.lang.reflect.Array.getLength(object));
		}
	}
}
