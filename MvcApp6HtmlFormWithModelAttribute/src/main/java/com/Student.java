package com;

public class Student {
    int sid;
    String sname;

    public Student(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }
    public Student(){

    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                '}';
    }
}
