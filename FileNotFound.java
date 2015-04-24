package package_01;

import java.io.*;

public class FileNotFound {

	public void testException() throws FileNotFoundException {

		try {
			FileInputStream myFile = new FileInputStream("d:/test.txt");
		} catch (FileNotFoundException e) {
			throw e;

		}

	}

}
