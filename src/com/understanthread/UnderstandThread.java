package com.understanthread;

/*
 * ���̣߳����������������߳���ʵ����Thread-0��Thread-1������������ݡ�
 * ���������̺߳��߳���ʵ����ȷ�����������
 * ���������߳���ȫ�����ɺ󣬲��ֵ��߳���ʵ�����ж����������
 */
public class UnderstandThread {

	public static void main(String[] args) {
		MyThread myThread1 = new MyThread();	//����MyThread���ʵ��
		myThread1.start(); //�����߳�
		MyThread myThread2 = new MyThread();
		myThread2.start();
		for(int i = 0; i < 10; i++)
			System.out.println("��������" + (i + 1) + "�����");
	}

}
