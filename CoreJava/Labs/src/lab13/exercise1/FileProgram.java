package lab13.exercise1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//13.1: Write a program to do the following operations using Thread:
//1.Create an user defined Thread class called as “CopyDataThread .java” .
// 	This class will be designed to copy the content from one file “source.txt ” to another
//	file “target.txt” and after every 10 characters copied, “10 characters are copied”
//	message will be shown to user.(Keep delay of 5 seconds after every 10 characters
//	read.)
//2.Create another class “FileProgram.java” which will create above thread. Pass
//	required File Stream classes to CopyDataThread constructor and implement the
//	above functionality.

public class FileProgram {

	public static void main(String[] args) {
		File sourceFile = new File("C:/Users/evision/Documents/ShaileshEclipseWorkspace/Labs/source.txt.txt");
		File targetFile = new File("C:/Users/evision/Documents/ShaileshEclipseWorkspace/Labs/target.txt.txt");

		try {
			FileInputStream fis = new FileInputStream(sourceFile);
			FileOutputStream fos = new FileOutputStream(targetFile);
			CopyDataThread cdt = new CopyDataThread(fis, fos);
			Thread t = new Thread(cdt);
			t.start();

		} catch (FileNotFoundException e) {
			System.out.println("fnf" + e.getMessage());
		}

	}

}
