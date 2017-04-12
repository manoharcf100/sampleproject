package com.test.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferFileSystem {

	public static void main(String[] args) throws IOException {
        
		/*File file = new File("buffer.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Course Founder Technology");
		bw.newLine();
		bw.write("Bangalore,India");
		bw.close();
		System.out.println("Data write successfully done..");
		
		System.out.println(file.length());*/
		
		File file = new File("buffer.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String oneLine = null;
		while((oneLine = br.readLine()) != null ){
			System.out.println(oneLine);
		}
		br.close();
		
	}

}
