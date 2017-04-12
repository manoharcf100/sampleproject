package com.test.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
      
		File file = new File("test");
		boolean createdFlag = file.mkdir();
		if(createdFlag){
			System.out.println("Directory is created successfully.");
		}else{
			System.out.println("Directory is NOt created");
		}
		
		File file1 = new File("abc/def");
		boolean createdFlag1 = file1.mkdirs();
		if(createdFlag1){
			System.out.println("Directory is created successfully.");
		}else{
			System.out.println("Directory is NOt created");
		}
		
		File file2 = new File("sample.txt");
		boolean createdFlag2 = file2.createNewFile();
		if(createdFlag2){
			System.out.println("Directory is created successfully.");
		}else{
			System.out.println("Directory is NOt created");
		}
		
	}

}
