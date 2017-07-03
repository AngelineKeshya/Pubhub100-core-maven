package com.bookapp.dao;

import com.bookapp.model.User;
import com.bookapp.dao.UserDAO;

public class TestUserDAO {
	public static void main(String[] args) throws Exception {
		User user=new User();
		
		user.setName("Shekina");
		user.setEmailId("sheki89@gmail.com");
		user.setPassword("rewy");
		user.setActive(1);
		
		
		UserDAO dao=new UserDAO();
		dao.register(user);
		
		
		

}
}