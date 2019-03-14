package com.itlin01;

import java.io.File;
/*
 * 返回值都是数组
 *     String[] list() 返回字符串数组
 *     File[] listFiles() 
 *     static File[] listRoots() 
 */
public class FileDemo5 {
	public static void main(String[] args)  {
		
		//static File[] listRoots() :  返回的是所有盘符
		File[] files = File.listRoots();
		for (File file : files) {
			System.out.println(file);
		}
		
        //methodList();
		//methodListFiles();
	}
	private static void methodListFiles() {
		File f = new File("b");
		File f2 = new File("D:\\研二");
		File f3 = new File("c.txt");
		//File[] listFiles()
		File[] files = f3.listFiles();
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
	private static void methodList() {
		File f = new File("b");
		File f2 = new File("D:\\研二");
		File f3 = new File("c.txt");
		//String[] list() : 返回当前路径下所有的文件和文件夹的名称
		//注意：只有指向文件夹的File对象才可以调用该方法，使用f3会导致出错
		String[] files = f2.list();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}
}

