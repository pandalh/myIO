package com.Properties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
 	Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。
	特点：
	1、Hashtable的子类，map集合中的方法都可以用。
	2、该集合没有泛型。键值都是字符串。
	3、它是一个可以持久化的属性集。键值可以存储到集合中，也可以存储到持久化的设备(硬盘、U盘、光盘)上。键值的来源也可以是持久化的设备。
	4、有和流技术相结合的方法。

 */
public class PropertiesDemo {
	public static void main(String[] args) {
		//创建属性列表对象
		Properties prop = new Properties();
		
		//添加映射关系
		prop.put("NJUST01", "zhangsan");
		prop.put("NJUST02", "LISI");
		prop.put("NJUST04", "xiaohai");
		//遍历属性列表
		//遍历Map对象，获取所有key，通过key获取value
		Set<Object> keys = prop.keySet();
		for (Object key : keys) {
			Object value = prop.get(key);
			System.out.println(key + "=" + value);
		}
		System.out.println("------------------------------------");
		//方法二：获取所有结婚证对象
		Set<Map.Entry<Object, Object>> entrys = prop.entrySet();
		for (Map.Entry<Object, Object> entry : entrys) {
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + "=" + value);
		}
	}

}
