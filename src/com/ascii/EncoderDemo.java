package com.ascii;
/*
 * 	编码表：把计算机底层的二进制数据转换成我们能看到的字符
	 *         ASCII
	 * 
	 *         GB2312    ---    GBK
	 *         Unicode    所有的字符都占2个字节
	 *         UTF-8    长度可变的码表
	 * 
	 * ANSI：本地编码表    gbk
	 * Java中的字符串默认使用的ANSI（gbk）
	 * 
	 * 乱码：编码保持前后一致即可解决
常用方法：
		构造方法（字节数组转字符串）：
			String():初始化一个新创建的 String 对象，使其表示一个空字符序列
			String(byte[] bytes) 使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String
			String(byte[] bytes, Charset charset) 通过使用指定的 charset 解码指定的 byte 数组，构造一个新的 String
		成员方法（字符串转字节数组）
			getBytes() 使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中
			getBytes(Charset charset) 使用给定的 charset 将此 String 编码到 byte 序列，并将结果存储到新的 byte 数组
		 

 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class EncoderDemo {
	public static void main(String[] args) throws IOException   {
		//method();
		FileInputStream fis = new FileInputStream("w.txt");
		byte[] bys = new byte[1024];
		int len = fis.read(bys);
		//System.out.println(new String(bys,0,len));
		System.out.println(new String(bys,0,len,"UTF-8"));
	}
	private static void method() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		String s = "高薪就业";
		//byte[] bys = s.getBytes();//通过默认编码转换成数组
		byte[] bys = s.getBytes("UTF-8");
		FileOutputStream fos = new FileOutputStream("a.txt");
		fos.write(bys);
		fos.close();
	}

}
