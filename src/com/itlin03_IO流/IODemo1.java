package com.itlin03_IO流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 	 IO流分类：
 * 	流向：
 * 		输入流    读取数据    FileReader    Reader
 * 		输出流    写出数据    FileWriter    Writer
 * 	数据类型
 * 		字节流    
 * 			字节输入流   读取数据    InputStream
 * 			字节输出流   写出数据    OutputStream
 * 		字符流
 * 			字符输入流  读取数据    Reader
 * 			字符输出流  写出数据    Writer
 * 	注意：由于计算机存储文件的基本格式为byte，若读取中文或其它非单字节编码的文件时，
 * 	一个字节的字节流速度慢，所以需要使用字符流进行读取或复制，但图片、视频等文件的存储为二进制文件，无法使用字符流进行操作
 * 
 */
public class IODemo1 {
	public static void main(String[] args) throws IOException {
		//创建字符输入流对象
		FileReader fr = new FileReader("c.txt");
		
		//创建字符输出流对象
		FileWriter fw = new FileWriter("D:\\d.txt");
		//一次读取一个字符的方法
		int ch;
		while((ch = fr.read()) != -1) {
			fw.write(ch);
			fw.flush();
			
		}
		//一次读取一个字符数组
		int len;
		char[] chs = new char[2048];
		while((len = fr.read()) != -1) {
			fw.write(chs, 0, len);
			fw.flush();
		}
		//关闭资源
		fr.close();
		fw.close();
	}

}
