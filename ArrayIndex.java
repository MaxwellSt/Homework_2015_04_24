package package_01;

public class ArrayIndex {

	public void testException() throws ArrayIndexOutOfBoundsException {

		int[] a = new int[3];
		int b;

		try {
			b = a[3];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw e;
		}
	}
}
