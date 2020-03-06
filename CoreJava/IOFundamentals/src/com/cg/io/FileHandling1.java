package com.cg.io;

import java.io.File;

public class FileHandling1 {

	public static void main(String[] args) {
		String pathname = "C:\\Users\\Ev ision\\Documents\\files";
		File file = new File(pathname);
		if (file.exists())
			System.out.println(file.getName() + " Yes file is present");
		else
			System.out.println(file.getName() + "file is not present");
	}

}
