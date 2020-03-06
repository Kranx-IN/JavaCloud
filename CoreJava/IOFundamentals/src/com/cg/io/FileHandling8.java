package com.cg.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileHandling8 {

	public static void main(String[] args) {
		Employee emp = readObject();
		System.out.println(emp);
	}
	
	public static Employee readObject() {
		try(ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("C:\\Users\\Ev ision\\Documents\\files\\file5.txt"))){
			Employee emp = (Employee)ois.readObject();
			return emp;
		}catch(IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}

}
