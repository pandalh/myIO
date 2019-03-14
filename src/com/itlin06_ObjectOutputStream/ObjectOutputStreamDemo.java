package com.itlin06_ObjectOutputStream;
/*
 * 	ObjectOutputStream 将 Java 对象的基本数据类型和图形写入 OutputStream。

 对象操作流：可以用于读写任意类型的对象
	ObjectInputStream 称为 反序列化流,利用输入流从文件中读取对象
		readObject
		ObjectInputStream(InputStream in)
		
	ObjectOutputStream 称为 序列化流,利用输出流向文件中写入对象
		writeObject
		ObjectOutputStream(OutputStream out) 
	特点：用于操作对象。可以将对象写入到文件中，也可以从文件中读取对象。
	
	注意：
		使用对象输出流写出对象，智能使用对象输入流来读取对象
		只能将支持java.io.Serializable接口的对象写入流中
		
 */
public class ObjectOutputStreamDemo {
	public static void main(String[] args) {
		
	}

}
