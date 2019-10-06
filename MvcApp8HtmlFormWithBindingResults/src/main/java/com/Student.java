package com;

import java.util.Date;
import java.util.List;

public class Student {
    int sid;
    String sname;
    long smobileno;
    Date sdob;
    List<String> sskills;
    Address saddress;


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

    public long getSmobileno() {
        return smobileno;
    }

    public void setSmobileno(long smobileno) {
        this.smobileno = smobileno;
    }

    public Date getSdob() {
        return sdob;
    }

    public void setSdob(Date sdob) {
        this.sdob = sdob;
    }

    public List<String> getSskills() {
        return sskills;
    }

    public void setSskills(List<String> sskills) {
        this.sskills = sskills;
    }

    public Address getSaddress() {
        return saddress;
    }

    public void setSaddress(Address saddress) {
        this.saddress = saddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", smobileno=" + smobileno +
                ", sdob=" + sdob +
                ", sskills=" + sskills +
                ", saddress=" + saddress +
                '}';
    }
}
