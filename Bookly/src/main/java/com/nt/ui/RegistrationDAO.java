package com.nt.ui;
import java.sql.*;

public class RegistrationDAO {
public int k=0;

public int insert(Userbean ub)
{
	try {
		Connection con = DB_con.getCon();
		PreparedStatement ps = con.prepareStatement("insert into userreg02 values(?,?,?,?,?,?)");
		ps.setString(1,ub.getUname());
		ps.setString(2, ub.getPwd());
		ps.setString(3, ub.getFname());
		ps.setString(4, ub.getLname());
		ps.setString(5, ub.getMid());
		ps.setLong(6, ub.getMobno());
		k=ps.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return k;
}
	
}
