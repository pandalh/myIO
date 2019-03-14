package com.itlin06_ObjectOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * 	ObjectOutputStream 将 Java 对象的基本数据类型和图形写入 OutputStream。
 * 	可以使用 ObjectInputStream 读取（重构）对象。
 * 	用于从流中读取对象的
	ObjectInputStream 称为 反序列化流,利用输入流从文件中读取对象
	ObjectOutputStream 称为 序列化流,利用输出流向文件中写入对象
	特点：用于操作对象。可以将对象写入到文件中，也可以从文件中读取对象。
	
	 *****************************
	 * 解决对实现序列化接口出现的黄色警告问题 *
	 *****************************
	 *问题分析：
	 *		当我们对Student类添加一个成员变量 String gender时，原文件（b.txt）中只有两个成员变量，Student类多了一个成员变量===》直接运行程序报错
	 *原因分析：
			 * Exception in thread "main" java.io.InvalidClassException
			 * 当 Serialization 运行时检测到某个类具有以下问题之一时，抛出此异常。 
					该类的序列版本号与从流中读取的类描述符的版本号不匹配 
					该类包含未知数据类型 
					该类没有可访问的无参数构造方法 
			 * 
			 * 总结：类Student实现序列化Serializable接口，当类发生变化时，类的序列号也会随之改变，
			 * 而文件(b.txt)还是之前的序列好，因此对文件进行读取时造成序列号版本不一致问题，导致出错。
	*解决方案：让类的序列号固定，使其与成员变量无关，在没给定前默认序列号与成员变量是相关的，对类的序列号进行固定后，就与成员变量无关了。

 */
public class ObjectOutputStreamDemo4 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//methodArrayList();
		methodNormal();
	}

	private static void methodNormal() throws IOException, FileNotFoundException, ClassNotFoundException {
		//创建对象输入流的对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("b.txt"));
		//读取对象
		Object obj = ois.readObject();
		//直接打印obj是将整个集合打印出来，而使用向下转型后用foreach可以打印集合中的每个对象。
		//System.out.println(obj);
		//向下转型
		ArrayList<Student> list = (ArrayList<Student>) obj;
		for (Student student : list) {
			System.out.println(student);
		}
		//释放资源
		ois.close();
	}

	private static void methodArrayList() throws IOException, FileNotFoundException {
		//创建对象输出流的对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("b.txt"));
		//创建集合对象
		ArrayList<Student> list = new ArrayList<Student>();
		
		//添加学生对象
		list.add(new Student("zhangsanfeng",89));
		list.add(new Student("xiaohai",24));
		//写出集合对象
		oos.writeObject(list);
		//释放资源
		oos.close();
	}

}
