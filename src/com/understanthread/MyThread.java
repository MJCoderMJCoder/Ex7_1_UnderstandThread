package com.understanthread;
/*
 * �û����߳������̳���Thread�ࣨ��ʵ��Runnable�ӿڣ���
 * ������Thread���run()��������ʵ��Runnable�ӿ��е�run()��������
 * run()�������߳�����ʱ��ִ�еĴ��룬
 * start()�����������̡߳���start()����ֻ����Thread�߳��ࣩ��
 */
class MyThread extends Thread {	//�û��Զ�����߳���
	public void run() {		//�����߳�����ʱ��ִ�еĴ���
		for(int i = 0; i < 10; i++)
			System.out.println(this.getName() + "��" + (i+1)+ "�����");	//this����ʵ����������
	}

}
