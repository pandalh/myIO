package com.itlin05;

import java.io.IOException;
import java.io.PrintWriter;

/*
 * 	打印流：
 * 	PrintStream：PrintStream 为其他输出流添加了功能，使它们能够方便地打印各种数据值表示形式。
 * 		它还提供其他两项功能。与其他输出流不同，PrintStream 永远不会抛出 IOException；
 * 		而是，异常情况仅设置可通过 checkError 方法测试的内部标志。
 * 		另外，为了自动刷新，可以创建一个 PrintStream；这意味着可在写入 byte 数组之后自动调用 flush 方法，
 * 		可调用其中一个 println 方法，或写入一个换行符或字节 ('\n')。 
 * 	PrintWriter：父类-Writer，此类实现在PrintStream中的所有print方法。它不包含用于写入原始字节的方法
 * 				可以自动换行，println
 * 				不能输出字节，但是可以输出其他任意类型
 * 				通过某些配置，可以实现自动刷新（只有在调用println、printf或format才有用
 * 				也是包装流
 * 	注意：只能输出不能输入
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		//创建打印流对象
		PrintWriter pw = new PrintWriter("b.txt");
		//写出数据
		pw.write("hello");
		pw.write("world");
		pw.write("java");

		//释放资源
		pw.close();
	}

}
