package com.lovejava;

/*
 * ��̬����
 * �ϱ�����
 * 
 */

class Person {
    public void eat() {
        System.out.println("eat!");
    }
}

class SouthPerson extends Person {
    public void eat() {
        System.out.println("�Ϸ��˳��׷�");
    }
    public void  business() {
        System.out.println("�Ϸ��˾���");
    }
}

class NorthPerson extends Person {
    public void eat() {
        System.out.println("��������ͷ");
    }
    public void sudy() {
        System.out.println("������ѧϰ");
    }
}

class DuotaiDemo {
    public static void main(String[] args) {
        //test
    	//�Ϸ���
        Person p = new SouthPerson();
        p.eat();
        System.out.println("-----------");
        SouthPerson sp = (SouthPerson) p;
        sp.eat();
        sp.business();
        System.out.println("-----------");
        
        //������
        p = new NorthPerson();
        p.eat();
        System.out.println("-----------");
        NorthPerson np = (NorthPerson)p;
        np.eat();
        np.sudy();
        
    }
}