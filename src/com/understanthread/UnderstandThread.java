package com.understanthread;

/*
 * 主线程（主函数）和两个线程类实例（Thread-0与Thread-1）交替输出内容。
 * 往往是主线程和线程类实例不确定次序交替输出
 * 或者是主线程完全输出完成后，才轮到线程类实例运行而产生输出。
 */
public class UnderstandThread {

	public static void main(String[] args) {
		MyThread myThread1 = new MyThread();	//创建MyThread类的实例
		myThread1.start(); //启动线程
		MyThread myThread2 = new MyThread();
		myThread2.start();
		for(int i = 0; i < 10; i++)
			System.out.println("主函数第" + (i + 1) + "次输出");
	}

}
