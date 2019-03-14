package com.itlin03_IO流;
//class C {
//    C() {
//        System.out.print("C");
//    }
//}
// 
//class A {
//    C c = new C();
// 
//    A() {
//        this("A");
//        System.out.print("A");
//    }
// 
//    A(String s) {
//        System.out.print(s);
//    }
//}
// 
//class Test extends A {
//    Test() {
//        super("B");
//        System.out.print("B");
//    }
// 
//    public static void main(String[] args) {
//        new Test();
//    }
//}
public class Test{
	public static void main(String[] args) {
		System.out.println("return value of getValue():" + getValue());
		//输出结果为 return value of getValue():1
	}
	public static int getValue() {
		try {
			return 0;
		}finally {
			return 1;
		}
	}
}