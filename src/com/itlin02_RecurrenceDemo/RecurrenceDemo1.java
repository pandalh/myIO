package com.itlin02_RecurrenceDemo;

import java.io.File;
/*
 * 需求：输出指定目录下所有的java文件名（包含子目录）
 */
public class RecurrenceDemo1 {
	public static void main(String[] args) {
//		File f = new File("src");
		File f = new File("src\\com\\itlin02\\RecurrenceDemo1.java");
		method2(f);
	}
	public static void method(File file) {
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				//判断是否是文件对象
				if(f.isFile()) {
					if(f.getName().endsWith(".java")) {
						System.out.println(f.getName());
					}
				}
				//先判断是否含有java文件，再处理子目录问题
				else if(f.isDirectory()){
					//是一个目录对象，使用递归方法
					method(f);
				}
			}
		}
	}
	//输出指定目录下的所有java文件名（不包含子目录）
	public static void method2(File file) {
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				//判断是否是文件对象
				if(f.isFile()) {
					if(f.getName().endsWith(".java")) {
						System.out.println(f.getName());
					}
				}
			}
		}
	}

}
