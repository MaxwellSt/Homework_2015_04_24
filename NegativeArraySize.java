package package_01;

public class NegativeArraySize {

	public void testException() throws NegativeArraySizeException {

		try {
			int[] a = new int[-4];
		} catch (NegativeArraySizeException e) {
			throw e;
		}
	}
}
