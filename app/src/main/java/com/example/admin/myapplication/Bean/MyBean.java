package com.example.admin.myapplication.Bean;

public class MyBean {
    String rollno;
    String name;

    public MyBean(String rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
