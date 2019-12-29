package com;


import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    @XmlElement(name = "name")
    String sname;

    @XmlAttribute(name = "id")
    int sid;

    Long smobileno;

    Date sdob;

    List<String> sskills;

    @XmlElement(name = "address")
    Address saddress;

    public Student() {
    }

    public Student(String sname, int sid) {
        this.sname = sname;
        this.sid = sid;
    }

    public Student(String sname, int sid, Long smobileno, Date sdob, List<String> sskills, Address saddress) {
        this.sname = sname;
        this.sid = sid;
        this.smobileno = smobileno;
        this.sdob = sdob;
        this.sskills = sskills;
        this.saddress = saddress;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public Long getSmobileno() {
        return smobileno;
    }

    public void setSmobileno(Long smobileno) {
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
                "sname='" + sname + '\'' +
                ", sid=" + sid +
                ", smobileno=" + smobileno +
                ", sdob=" + sdob +
                ", sskills=" + sskills +
                ", saddress=" + saddress +
                '}';
    }
}
