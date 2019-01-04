package com.pccu.homework;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader = null;
		FileWriter writer = null;
		try {
			reader = new FileReader("src/abstract1.txt");
			writer = new FileWriter("src/clonedabstract1.txt");
			int flag = 0;
			while ((flag = reader.read()) != -1) {
				writer.write(flag);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {	
					e.printStackTrace();	
				}
			}
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}






