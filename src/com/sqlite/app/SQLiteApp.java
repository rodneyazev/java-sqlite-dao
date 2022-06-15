package com.sqlite.app;

import java.sql.SQLException;

import com.sqlite.dao.SQLiteDAO;

public class SQLiteApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		SQLiteDAO sql = new SQLiteDAO();
		
		// sql.sqlCreate();
		
		sql.sqlDelete(1);
		sql.sqlDelete(2);
		sql.sqlDelete(3);
		sql.sqlDelete(4);
		sql.sqlDelete(5);
		
		sql.sqlInsert(1,"rodney");
		sql.sqlInsert(2,"paula");
		sql.sqlInsert(3,"paulo");
		sql.sqlInsert(4,"jose");
		sql.sqlInsert(5,"alice");
		
		sql.sqlSelect();
		
		sql.sqlUpdate(1, "azevedo");
		
		System.out.println();
		
		sql.sqlSelect();
		sql.sqlDelete(1);
		
		System.out.println();
		
		sql.sqlSelect();
	}

}
