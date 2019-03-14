package com.itlin05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 	使用打印流复制文件：
 * 	数据源：D:\\JAVA file\\javafile\\myIO(高级)\\src\\com\\itlin05\\PrintWriterDemo.java
 * 	目的源：D:\\PrintWriterDemo.java
 */
public class PrintWriterDemo3 {
	public static void main(String[] args) throws IOException {
		//创建输入流对象
		BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA file\\javafile\\myIO(高级)\\src\\com\\itlin05\\PrintWriterDemo.java"));
		//创建打印流对象
		PrintWriter pw = new PrintWriter(new FileWriter("D:\\PrintWriterDemo.java"),true);
		//写出数据
		String line;
		while((line = br.readLine()) != null) {
			pw.println(line);
		}


		//释放资源
		pw.close();
		br.close();
	}

}
