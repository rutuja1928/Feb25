package com.cdac.dao;
import com.cdac.pojos.User;
import java.sql.SQLException;

import com.cdac.pojos.User;

public interface UserDao {
//sign in using layer
	// ....... signIn(em,pass) throws SE
	User signIn(String email,String pwd) throws SQLException;
	
	//Sign up
	String signUp(User newUser) throws SQLException;
	
	
	//changePasseord
	String changePasword(String email,String oldPassword,String newPassword);
	
	//delete data
	
	String deleteUserByVoterId(int voterId);

	void cleanUp() throws SQLException;
}
