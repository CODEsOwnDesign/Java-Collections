package cloud.yebei.java.collections.arrays;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		float[][] bowling = new float[4][];
		for (int i = 0; i < 4; i++) {
			bowling[i] = new float[i + 1];
		}
	}
}
