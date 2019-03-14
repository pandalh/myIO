package com.ascii;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
/*
 * 字符流中的编码
 * 	字符流读写文件还会出现编码乱码的问题吗？
 * 	字符流 = 字节流 + 编码
 * 	OutputStreamWriter:字节流与字符流的转换
 * 
 */
public class EncoderDemo02 {
	public static void main(String[] args) throws IOException {
		//method();
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"),"UTF-16");
		//OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"));
		String s = "迎娶白富美";
		osw.write(s);
		osw.close();
	}
	private static void method() throws IOException, UnsupportedEncodingException {
		FileWriter fw = new FileWriter("b.txt");
		String s = "月薪过万";
//		fw.write(s);
//		fw.close();
		//当改变b.txt的编码格式改成US-ASCII、UTF-16等编码方式时，可以字符串打回原形，字符串转换成US-ASCII、UTF-16等相应的字节数组
		byte[] bys = s.getBytes("US-ASCII");
		fw.write(new String(bys));
		fw.close();
	}
}

