package com.nt.ui;
import java.io.*;
@SuppressWarnings("serial")
public class Userbean implements Serializable{
private  String uname,pwd,fname,lname,mid;
private Long mobno;

public Userbean() {}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getMid() {
	return mid;
}

public void setMid(String mid) {
	this.mid = mid;
}

public Long getMobno() {
	return mobno;
}

public void setMobno(Long mobno) {
	this.mobno = mobno;
}




 
}
