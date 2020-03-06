package com.cg.io;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling7 {
	public static void main(String[] args) {
		Employee emp = new Employee(1000, "Shailesh", 5000);
		writeObject(emp);

	}

	public static void writeObject(Employee emp) {
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\Ev ision\\Documents\\files\\file5.txt"))) {
			oos.writeObject(emp);
			System.out.println("Object written successfully.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
