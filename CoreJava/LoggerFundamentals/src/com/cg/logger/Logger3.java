package com.cg.logger;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;

public class Logger3 {

	private static Logger logger = Logger.getRootLogger();

	public static void main(String[] args) throws IOException {

		PropertyConfigurator
				.configure("C:\\Users\\Ev ision\\Documents\\TrainingShailesh\\module1\\coreJava\\log4j.properties");
		int n1 = 10, n2 = 120;
		int result = add(n1, n2);
		System.out.println("Result : " + result);

		result = add(n1, n2, 30, 40);
		System.out.println("Result : " + result);
	}

	public static int add(int... numbers) {
		logger.info("number of args: " + numbers.length);
		int res = 0;
		for (int num : numbers) {
			res += num;
		}
		return res;
	}
}
