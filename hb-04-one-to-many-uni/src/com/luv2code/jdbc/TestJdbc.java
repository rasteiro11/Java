package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String pass = "titico03";
		try {
			System.out.println("Connecting");
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("connection successfull");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}
}
