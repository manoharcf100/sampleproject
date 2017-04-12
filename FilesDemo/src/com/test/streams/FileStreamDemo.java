package com.test.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {

	public static void main(String[] args) throws IOException {
      
		//Writing Data in to File.
		/*String name = "Course Founder Technology 45 45 4545 345.56";
		byte all[] = name.getBytes();
		File f = new File("stream.txt");
		FileOutputStream fo = null;
		try {
			fo = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		fo.write(all);
		fo.close();
		
		System.out.println("Data write successfully...");*/
		
		//Read The data from the file/stream.txt
		File f = new File("stream.txt");
		FileInputStream fi = new FileInputStream(f);
		
		int oneByte = 0;
		while((oneByte = fi.read()) != -1){
			System.out.print((char)oneByte);
		}
		fi.close();
		
		int all[] = {12,45,677,7,7,0};
		
		System.out.println(all);
		int i=0;
		while(i != all.length){
			System.out.println(all[i]);
			i++;
		}
		
	}
     
	
}
