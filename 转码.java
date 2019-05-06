package com.webserver.core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 转码
 * @author ta
 *
 */
public class Demo {
	public static void main(String[] args) throws Exception {
		FileInputStream fis 
			= new FileInputStream("http.txt");
		InputStreamReader isr
			= new InputStreamReader(fis,"GBK");
		BufferedReader br
			= new BufferedReader(isr);
		
		
		FileOutputStream fos
			= new FileOutputStream("http_utf8.txt");
		OutputStreamWriter osw
			= new OutputStreamWriter(fos,"UTF-8");
		BufferedWriter bw
			= new BufferedWriter(osw);
		PrintWriter pw
			= new PrintWriter(bw);
		
		String line = null;
		while((line = br.readLine())!=null) {
			pw.println(line);
		}
		System.out.println("转码完毕!");
		pw.close();
		br.close();
		
	}
}

