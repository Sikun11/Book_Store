package com.nt.ui;
import java.sql.*;
public class ForgetpwdDAO {

public static int update(String emailId,String password)
{   int k=0;
	try {
		Connection con = DB_con.getCon();
		PreparedStatement ps = con.prepareStatement("update userreg02 set pwd=? where mid=?");
		
		ps.setString(1,password );
		ps.setString(2,emailId );
		k=ps.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return k;
}
}
