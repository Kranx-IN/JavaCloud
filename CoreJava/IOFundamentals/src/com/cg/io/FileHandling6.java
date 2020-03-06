package com.cg.io;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling6 {

	public static void main(String[] args) {
		DataInputStream dis = new DataInputStream(System.in);
		BufferedWriter bw = null;

		String line;
		try {
			bw = new BufferedWriter(new FileWriter("C:\\Users\\Ev ision\\Documents\\files\\file3.txt"));
			System.out.println("Enter the line to file and to quit type \"exit\": ");
			while (!(line = dis.readLine()).equalsIgnoreCase("exit")) {
				bw.write(line + "\n");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}

		}
	}

}
