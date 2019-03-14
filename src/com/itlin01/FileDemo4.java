package com.itlin01;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 *   File类的获取功能和修改功能：
 *   File getAbsoluteFile():以File对象的形式返回当前File对象所有指向的绝对路径
 *   String getAbsolutePath():获取文件的绝对路径,返回路径的字符串
 *   String getParent():获取当前路径的父级路径,以字符串形式返回该父级路径
 *   File getParentFile():获取当前路径的父级路径,以字File对象形式返回该父级路径
 *   String getName():获取文件或文件夹的名称
 *   String getPath():获取File对象中封装的路径
 *   long lastModified():以毫秒值返回最后修改时间
 *   long length():返回文件的字节数
 *   boolean renameTo(File dest): 将当前File对象所指向的路径 修改为 指定File所指向的路径

 */
public class FileDemo4 {
	public static void main(String[] args) throws IOException  {
		//methodGetAbsoluteFile();
		//methodGetParent();
		//methodGetPath();
		
		
		File f = new File("c.txt");
		File f2 = new File("e.txt");
		System.out.println(f.getAbsolutePath());
//		int i = 42;
//		//嵌套三目运算符
//		String s = (i<40)?"life":(i>50)?"universe":"everything";
//		System.out.println(s);

		
		//boolean renameTo(File dest) : 将当前File对象所指向的路径 修改为 指定File所指向的路径
		//注意：修改的文件路径不能存在，如果存在则修改失败
		//System.out.println(f.renameTo(f2));
	}

	private static void methodGetPath() {
		File f = new File("a.txt");
		File f2 = new File("d:\\a\\b.txt");
		File f3 = new File("b");
		
		//String getName() : 获取文件和文件夹的名称
		//System.out.println(f.getName());
		//System.out.println(f2.getName());
		//System.out.println(f3.getName());
		
		//String getPath() : 返回创建File对象时给的路径
		//System.out.println(f.getPath());
		//System.out.println(f2.getPath());
		//System.out.println(f3.getPath());
		
		//long lastModified() : 以毫秒值的形式返回最后修改时间
		//System.out.println(f.lastModified());
		//2514023311294
//		Date d = new Date(2514023311294L);
//		System.out.println(d.toLocaleString());
		
		//long length() : 返回文件的字节数
		System.out.println(f.length());
		System.out.println(f3.length());
	}

	private static void methodGetParent() throws IOException {
		//File f = new File("a.txt");
		
		//File f2 = new File("b","c.txt");
		//System.out.println(f2.createNewFile());
		
		File parent = new File("b");
		File f3 = new File(parent,"c.txt");
		if(!parent.exists()) {
			parent.mkdirs();
		}
		System.out.println(f3.createNewFile());
		
		//String getParent() 
		System.out.println(f3.getParent());
		//File getParentFile() 
		System.out.println(f3.getParentFile());
	}

	private static void methodGetAbsoluteFile() throws IOException {
		File f = new File("d:\\a\\b.txt");
		File f2 = new File("a.txt");
		

		//File getAbsoluteFile()  ：以File对象的形式返回当前File对象所有指向的绝对路径
		System.out.println(f2.getAbsoluteFile());
		//String getAbsolutePath() : 返回File对象所指向的绝对路径
		System.out.println(f2.getAbsolutePath());
	}

}

