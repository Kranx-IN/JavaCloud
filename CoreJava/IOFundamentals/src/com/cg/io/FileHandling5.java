package com.cg.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling5 {

	public static void main(String[] args) {
		String pathname = "C:\\Users\\Ev ision\\Documents\\files\\file1.txt";
		File file = new File(pathname);

		FileReader fr = null;
		BufferedReader br = null;

		if (file.exists()) {
			System.out.println(file.getName() + " Yes file is present");
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);

				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
				// e.printStackTrace(); //should be used only for debugging
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} finally {

				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {

					}
				}
				
				if (fr != null) {
					try {
						br.close();
					} catch (IOException e) {

					}
				}
			}
		} else
			System.out.println(file.getName() + "file is not present");

	}

}
