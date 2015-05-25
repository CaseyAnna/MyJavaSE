package com.lovejava;

// 抽象类
//普通员工类：姓名、工号、工资 方法:工作
//经理类：姓名、工号、工资、奖金 方法:工作
//抽象类:员工类

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

	// 成员方法
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

	// 抽象方法
	public abstract void work();
}

class Programmer extends Employee {
	public Programmer() {}

	public Programmer(String name, String number, int salary) {
		super(name, number, salary);
	}
	
	public void work() {
		System.out.println("手动码代码");
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
		System.out.println("跟客户谈需求");
	}
}
public class Test2 {
	public static void  main(String[] args) {
		//测试普通员工
		Employee emp = new Programmer();
		emp.setName("Tao");
		emp.setNumber("123456");
		emp.setSalary(20000);
		System.out.println(emp.getName()+" "+emp.getNumber()+" "+emp.getSalary());
		emp.work();
		//测试经理
		//子类有特有内容 用子类对象来测试
		Manager m = new Manager("Zhang", "12342", 30000, 2000);
		System.out.println(m.getName()+" "+m.getNumber()+" "+m.getSalary()+" "+m.getBonus());
		m.work();
	}
}
