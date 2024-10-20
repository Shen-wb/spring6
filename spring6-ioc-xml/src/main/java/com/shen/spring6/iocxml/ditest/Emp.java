package com.shen.spring6.iocxml.ditest;

public class Emp {
    private String ename;
    private int age;
    private Dept dept;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void work() {
        System.out.println(ename + " emp work......"+age);
        dept.info();
    }
}
