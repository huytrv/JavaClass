package week4;

public class W4 {
	public static int Max(int a, int b) {
		if (a > b) return a;
		return b;
	}
	public static int MinArr(int[] a) {
		int n = a.length;
		int min = a[0];
		for (int i=0; i<n; i++)
			if (a[i] < min) min = a[i];
		return min;
	}
}
