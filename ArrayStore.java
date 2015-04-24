package package_01;

public class ArrayStore {

	public void testException() throws ArrayStoreException {

		try {

			Object[] a = new Integer[2];
			a[0] = 1.5;

		} catch (ArrayStoreException e) {
			throw e;
		}

	}

}
