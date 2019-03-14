package com.itlin06_InputStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * 	需求：读取键盘录入的数据，并输出到项目目录下的a.txt文件中
 * 	数据源：读取键盘录入的数据  System.in
 * 	目的地：项目目录下的a.txt FileWriter
 * 
 * 	转换流 ：需要把字节输入流转换成字符输入流，InputStreamReader
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		//methodString();
		//创建输入流对象
		InputStream is = System.in;
		Reader r = new InputStreamReader(is);//转换流
		//创建输出流对象
		FileWriter fw = new FileWriter("a1.txt");
		
		//读写数据
		char[] chs = new char[1024];
		int len;
		while((len = r.read(chs)) != -1) {
			fw.write(chs,0,len);
			fw.flush();
		}
		//释放资源
		fw.close();
		is.close();
	}

	private static void methodString() throws IOException {
		//创建输入流对象
		InputStream is = System.in;
		
		//创建输出流对象
		FileWriter fw = new FileWriter("a.txt");
		
		//读写数据
		byte[] bys = new byte[1024];
		int len;//用于存储读取到的字节个数
		while((len = is.read(bys)) != -1) {
			fw.write(new String(bys,0,len));
			//每次读取到数据都要转换成String对象，需要修改，如果我们读到的是字符数组而不是字节数组就不用经过转化步骤
			fw.flush();
		}
		//释放资源
		is.close();
		fw.close();
	}
}
