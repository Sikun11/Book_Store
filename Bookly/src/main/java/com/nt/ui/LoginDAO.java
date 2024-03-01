package com.nt.ui;

import java.sql.*;

public class LoginDAO {
	public Userbean ub = null;

	public Userbean login(String uname, String pwd) {
		try {
			Connection con = DB_con.getCon();
			PreparedStatement ps = con.prepareStatement("select* from userreg02 where uname=? and pwd=?");
			ps.setString(1, uname);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ub = new Userbean();
				ub.setUname(rs.getString(1));
				ub.setPwd(rs.getString(2));
				ub.setFname(rs.getString(3));
				ub.setLname(rs.getString(4));
				ub.setMid(rs.getString(5));
				ub.setMobno(rs.getLong(6));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ub;
	}

}
