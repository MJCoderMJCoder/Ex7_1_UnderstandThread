package com.understanthread;
/*
 * 用户的线程类必须继承自Thread类（或实现Runnable接口），
 * 并覆盖Thread类的run()方法（或实现Runnable接口中的run()方法）；
 * run()：包含线程运行时所执行的代码，
 * start()：用于启动线程。（start()方法只属于Thread线程类）。
 */
class MyThread extends Thread {	//用户自定义的线程类
	public void run() {		//包含线程运行时所执行的代码
		for(int i = 0; i < 10; i++)
			System.out.println(this.getName() + "第" + (i+1)+ "次输出");	//this代表实例对象自身
	}

}
