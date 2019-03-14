package com.itlin04_IOWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
/*
 * 需求：读取项目根目录下的SystemInOutDemo.java，并输出到命令行
 * 
 * 数据源：项目根目录下的SystemInOutDemo.java    BufferedReader
 * 目的地：命令行    System.out
 * 
 * 
 * 由于标准输出流是一个字节输出流，所以只能输出字节或者字节数组，但是我们读取到的数据则是字符串，如果想进行输出还需要转换成字节数组
 * 我们要想通过标准输出流输出字符串，把标准输出流转换成一种字符输出流即可，OutputStreamWriter
 * 通过构造OutputStreamWriter将字节输出流转化为字符输出流
 * OutputStreamWriter(OutputStream out) :转换流，把字节输出流转换成字符输出流
 * 
 * 
*/
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException   {
		//methodBufferedWriter();
		//methodOutputStream();
		//创建输入流对象
		BufferedReader br = new BufferedReader(new FileReader("d:\\SystemInOutDemo.java"));
		//创建输出流对象
		Writer w = new OutputStreamWriter(System.out);//多态，父类型引用指向子类对象
		//进行数据的读写
		String line;//用于存储读取到的数据
		while((line = br.readLine()) != null) {
			w.write(line);
			w.write("\r\n");//换行符
		}
		//释放资源
		w.close();
		br.close();


	}

	private static void methodOutputStream() throws FileNotFoundException, IOException {
		//创建输入流对象
		BufferedReader br = new BufferedReader(new FileReader("d:\\SystemInOutDemo.java"));
		//创建输出流对象
		OutputStream os = System.out;
		String line;//用于存储读取到的数据
		while((line = br.readLine()) != null) {
			os.write(line.getBytes());
			os.write("\r\n".getBytes());//不加这个无法完成换行
		}
		//释放资源
		os.close();
		br.close();
	}

	private static void methodBufferedWriter() throws FileNotFoundException, IOException {
		//创建输入流对象,相对路径下会报错，原因：
		BufferedReader br = new BufferedReader(new FileReader("D:\\SystemInOutDemo.java"));
		//创建输出流对象
		//OutputStream os = System.out;
//		Writer w = new OutputStreamWriter(System.out);//多态，父类型引用指向子类对象
//		BufferedWriter bw = new BufferedWriter(w);
		//或如下表示，直接创建BufferedWriter对象，匿名对象转换
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//进行数据的读写
		String line;//用于存储读取到的数据
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		//释放资源
		bw.close();
		br.close();
	}
}
