package lab13.exercise1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread implements Runnable {

	FileInputStream fis;
	FileOutputStream fos;

	public CopyDataThread(FileInputStream fis, FileOutputStream fos) {
		super();
		this.fis = fis;
		this.fos = fos;
	}

	@Override
	public void run() {

		try {
			int ch, count = 0;
			while ((ch = fis.read()) != -1) {
				System.out.print((char) ch);
				fos.write((char) ch);
				count++;

				if (count == 9) {
					try {
						System.out.println("10 characters copied.");
						Thread.sleep(5000);
						System.out.println("5 sec slept");
					} catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
					count = 0;
				}
			}
		} catch (IOException e) {
			System.out.println("Unable to read.");
		}
	}

}
