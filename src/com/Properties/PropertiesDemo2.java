package com.Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

/*
 	Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。
	特点：
	1、Hashtable的子类，map集合中的方法都可以用。
	2、该集合没有泛型。键值都是字符串。
	3、它是一个可以持久化的属性集。键值可以存储到集合中，也可以存储到持久化的设备(硬盘、U盘、光盘)上。键值的来源也可以是持久化的设备。
	4、有和流技术相结合的方法。

 */
public class PropertiesDemo2 {
	public static void main(String[] args) throws IOException {
		//methodPrintWriter();
		//methodFireReader();
		//创建属性列表对象
		Properties prop = new Properties();
		
		//添加映射关系
		prop.setProperty("NJUST01", "zhangsan");
		prop.setProperty("NJUST02", "LISI");
		prop.setProperty("NJUST04", "xiaohai");
		//创建一个输出流对象
		FileWriter fw = new FileWriter("e.txt");
		//void store(Writer writer, String comments) 
		prop.store(fw, "hello world");
		//释放资源
		fw.close();
	}

	private static void methodFireReader() throws FileNotFoundException, IOException {
		//创建属性列表对象
		Properties prop = new Properties();
		//创建一个输入流对象
		FileReader fr = new FileReader("d.txt");
		
		//void load
		prop.load(fr);
		//释放资源
		fr.close();
		System.out.println(prop);
	}

	private static void methodPrintWriter() throws FileNotFoundException {
		//创建属性列表对象
		Properties prop = new Properties();
		
		//添加映射关系
		prop.setProperty("NJUST01", "zhangsan");
		prop.setProperty("NJUST02", "LISI");
		prop.setProperty("NJUST04", "xiaohai");
		
		//创建打印流对象
		PrintWriter out = new PrintWriter("d.txt");
		//void list(PrintWriter out)  
		prop.list(out);
		//释放资源
		out.close();
	}

}
