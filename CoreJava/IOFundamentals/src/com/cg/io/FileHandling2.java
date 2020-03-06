package com.cg.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandling2 {

	public static void main(String[] args) {
		String pathname = "C:\\Users\\Ev ision\\Documents\\files\\file1.txt";
		File file = new File(pathname);

		if (file.exists()) {
			System.out.println(file.getName() + " Yes file is present");
			try {
				FileInputStream fis = new FileInputStream(file);

				int ch;
				while ((ch = fis.read()) != -1) {
					System.out.print((char)ch);
				}
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
				// e.printStackTrace(); //should be used only for debugging
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} else
			System.out.println(file.getName() + "file is not present");
	}

}
