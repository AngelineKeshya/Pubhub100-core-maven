package com.bookapp.util;

import com.bookapp.util.ConnectionUtil;

public class TestConnectionUtil {
	public static void main(String[] args) {
		try {
			System.out.println(ConnectionUtil.getConnection());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}


}
