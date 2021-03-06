package com.cg.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling4 {
	public static void main(String[] args) {
		String pathname = "C:\\Users\\Ev ision\\Documents\\files\\john.png";
		File file = new File(pathname);

		if (file.exists()) {
			System.out.println(file.getName() + " Yes file is present");
			try {
				FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream("C:\\Users\\Ev ision\\Documents\\files\\john2.png");

				int ch;
				while ((ch = fis.read()) != -1) {
					fos.write((char) ch);
				}
				System.out.println("File copied successfully");
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
