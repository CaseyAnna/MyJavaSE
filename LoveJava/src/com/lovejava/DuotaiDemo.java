package com.lovejava;

/*
 * 多态案例
 * 南北方人
 * 
 */

class Person {
    public void eat() {
        System.out.println("eat!");
    }
}

class SouthPerson extends Person {
    public void eat() {
        System.out.println("南方人吃米饭");
    }
    public void  business() {
        System.out.println("南方人经商");
    }
}

class NorthPerson extends Person {
    public void eat() {
        System.out.println("北方吃馒头");
    }
    public void sudy() {
        System.out.println("北方人学习");
    }
}

class DuotaiDemo {
    public static void main(String[] args) {
        //test
    	//南方人
        Person p = new SouthPerson();
        p.eat();
        System.out.println("-----------");
        SouthPerson sp = (SouthPerson) p;
        sp.eat();
        sp.business();
        System.out.println("-----------");
        
        //北方人
        p = new NorthPerson();
        p.eat();
        System.out.println("-----------");
        NorthPerson np = (NorthPerson)p;
        np.eat();
        np.sudy();
        
    }
}