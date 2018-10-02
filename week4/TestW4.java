package week4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestW4 extends W4 {
	@Test
	public void testMax() {

		int result1 = W4.Max(12, 8);
		assertEquals(result1, 12);
		int result2 = W4.Max(0, -1);
		assertEquals(result2, 0);
		int result3 = W4.Max(0, 0);
		assertEquals(result3, 0);
		int result4 = W4.Max(1, -1);
		assertEquals(result4, 1);
		int result5 = W4.Max(43534534, 234234823);
		assertEquals(result5, 234234823);
	}
	@Test
	public void testMinArr() {
		int[] a1 = new int[] {5, 6, 2, 8, 1};
		int result1 = W4.MinArr(a1);
		assertEquals(result1, 1);
		int[] a2 = new int[] {-4, -12, 23, 8, 1, 6, 9, 23, 45};
		int result2 = W4.MinArr(a2);
		assertEquals(result2, -12);
		int[] a3 = new int[] {5, 6, 2, -8, 1, 23, 123, -123, 3};
		int result3 = W4.MinArr(a3);
		assertEquals(result3, -123);
		int[] a4 = new int[] {-15, 6, 0, -20, 8, 1};
		int result4 = W4.MinArr(a4);
		assertEquals(result4, -20);
		int[] a5 = new int[] {80, -123, -234, -453, -23, -289, 234, -3, -45, 34};
		int result5 = W4.MinArr(a5);
		assertEquals(result5, -453);
	}
}
