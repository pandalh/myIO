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
	
	
	****************************
	**解决对象输入流读取对象出现异常的问题**
	****************************
 */
public class ObjectOutputStreamDemo3 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//methodArrayList();
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
