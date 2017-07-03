package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bookapp.model.User;
import com.bookapp.util.ConnectionUtil;

public class UserDAO {
	public void register(User user)throws Exception{
		Connection connection=ConnectionUtil.getConnection();
		
		PreparedStatement pst=connection.prepareStatement("INSERT INTO users(NAME,email_id,PASSWORD,active)VALUES(?,?,?,?)");
		
		
		pst.setString(1,user.getName());
		pst.setString(2,user.getEmailId());
		pst.setString(3,user.getPassword());
		pst.setInt(4, 0);
		
	    pst.executeUpdate();
	}  
	    public boolean login(User user) throws Exception{
	    	Connection connection=ConnectionUtil.getConnection();
	    	
	    	PreparedStatement pst=connection.prepareStatement("SELECT email_id,PASSWORD FROM users  WHERE email_id=? AND PASSWORD=?");
            
	    	pst.setString(1,user.getEmailId());
	    	pst.setString(2,user.getPassword());
	    	
	    	ResultSet rs=pst.executeQuery();
	    	boolean flag=false;
	    	
	    	if(rs.next()){
	    		flag=true;
	    	}
	    	else{
	    		return flag;
	    	}
			return flag;
	    }


}

