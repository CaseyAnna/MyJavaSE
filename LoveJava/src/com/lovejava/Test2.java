package com.lovejava;

// ������
//��ͨԱ���ࣺ���������š����� ����:����
//�����ࣺ���������š����ʡ����� ����:����
//������:Ա����

abstract class Employee {
	private String name;
	private String number;
	private int salary;

	public Employee() {}

	public Employee(String name, String number, int salary) {
		this.name = name;
		this.number = number;
		this.salary = salary;
	}

	// ��Ա����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// ���󷽷�
	public abstract void work();
}

class Programmer extends Employee {
	public Programmer() {}

	public Programmer(String name, String number, int salary) {
		super(name, number, salary);
	}
	
	public void work() {
		System.out.println("�ֶ������");
	}
}

class Manager extends Employee {
	private int bonus;
	
	public Manager() {}
	
	public Manager(String name, String number, int salary, int bonus) {
		super(name, number, salary);
		this.bonus = bonus;
	}
	
	public int getBonus() {
		return bonus;
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public void work() {
		System.out.println("���ͻ�̸����");
	}
}
public class Test2 {
	public static void  main(String[] args) {
		//������ͨԱ��
		Employee emp = new Programmer();
		emp.setName("Tao");
		emp.setNumber("123456");
		emp.setSalary(20000);
		System.out.println(emp.getName()+" "+emp.getNumber()+" "+emp.getSalary());
		emp.work();
		//���Ծ���
		//�������������� ���������������
		Manager m = new Manager("Zhang", "12342", 30000, 2000);
		System.out.println(m.getName()+" "+m.getNumber()+" "+m.getSalary()+" "+m.getBonus());
		m.work();
	}
}
