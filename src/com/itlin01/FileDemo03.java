package com.itlin01;
/*
 * boolean exists():判断指定路径的文件或文件夹是否存在
 * boolean isAbsolute():判断当前路路径是否是绝对路径
 * boolean isDirectory():判断当前的目录是否存在
 * boolean isFile():判断当前路径是否是一个文件
 * boolean isHidden():判断当前路径是否是隐藏文件
 */
import java.io.File;
import java.io.IOException;

public class FileDemo03 {
	public static void main(String[] args) throws IOException {
		//methodExists;
		//methodIsAbsolute();
		//methodIsFile();
		methodisHidden();
	}

	private static void methodisHidden() {
		File f = new File("d:\\a\\b.txt");
		//boolean isHidden() :判断File对象指向的路径是否有隐藏属性，如果隐藏了则返回true，否则返回false
		System.out.println(f.isHidden());
	}

	private static void methodIsFile() {
		File f = new File("a.txt");
		File f2 = new File("b");
		//boolean isDirectory() ：判断File对象指向的路径是否是文件夹，如果是则返回true，否则返回false
		//boolean isFile()  : 判断File对象指向的路径是否是文件，如果是则返回true，否则返回false
		//System.out.println(f.isDirectory());
		//System.out.println(f2.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f2.isFile());
	}

	private static void methodIsAbsolute() {
		//File f = new File("a.txt");
		File f2 = new File("d:\\a\b.txt");
		//boolean isAbsolute() :判断File对象指向的路径是否是绝对路径，如果是绝对路径则返回true，否则返回false
		System.out.println(f2.isAbsolute());
	}

	private static void methodExists() {
		File f = new File("a.txt");
		//f.createNewFile();
		//boolean exists() : 判断文件或者文件夹是否存在，如果存在则返回true，否则返回false
		System.out.println(f.exists());
	}
}

