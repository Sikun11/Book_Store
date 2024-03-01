package com.nt.ui;

import java.sql.*;
import static com.nt.ui.DB_info.*;

public class DB_con {
	private static Connection con = null;

	public DB_con() {
	}

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(dburl, uname, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getCon() {
		return con;
	}

}
