package com.itlin03_IO流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException   {
		//method2();
		//创建输入流对象
		BufferedReader br = new BufferedReader(new FileReader("IODemo1.java"));
		//创建输出流对象
		//OutputStream os = System.out;
		Writer w = new OutputStreamWriter(System.out);//多态，父类型引用指向子类对象
		BufferedWriter bw = new BufferedWriter(w);
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//进行数据的读写
		String line;//用于存储读取到的数据
		while((line = br.readLine()) != null) {
			w.write(line);
			w.write("\r\n");
		}
		//释放资源
		bw.close();
		br.close();
	}
}