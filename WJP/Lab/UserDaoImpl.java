package com.cdac.dao;

import java.sql.*;

import com.cdac.pojos.User;
import com.cdac.utils.DBUtils;

import static com.cdac.utils.DBUtils.*;

public class UserDaoImpl implements UserDao {
	// dependency - DB connection - DBUtils
	private Connection connection;
	private PreparedStatement pst1,pst2,pst3;

	// def ctor - will be invoked by layer above - Tester (dyn web comp)
	public UserDaoImpl() throws SQLException {
		// establish db cn
		openConnection();
		connection = getConnection();
		// creates PreparedStament
		String sql = "select * from users where email=? and password=?";
		pst1 = connection.prepareStatement(sql);
		
		//create pST to insert a record
		pst2=connection.prepareStatement("insert into users values(default,?,?,?,?,?,?,?)");
		System.out.println("user dao created !");
	}

	@Override
	public User signIn(String email, String pwd) throws SQLException {
		// 1. set IN params
		pst1.setString(1, email);
		pst1.setString(2, pwd);
		// 2. execute query n process RST
		try (ResultSet rst = pst1.executeQuery()) {
			if (rst.next()) {
				//success
				return new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5),
						rst.getDate(6), rst.getBoolean(7), rst.getString(8));
			}
			return null;

		}

	}
	
	

	@Override
	public String signUp(User newUser) throws SQLException {
	    pst2.setString(1,newUser.getFirstName());
	    pst2.setString(2,newUser.getLastName());
	    pst2.setString(3,newUser.getEmail());
	    pst2.setString(4,newUser.getPassword());
	    pst2.setDate(5,newUser.getDob());
	    pst2.setBoolean(6,false);
	    pst2.setString(7,"voter");
	    
	    //execute query-
	    int updateCount=pst2.executeUpdate();
	    if(updateCount==1)
	    	return "Voter registered...";
	    return "reg failed";
		
	}
	
	

	@Override
	public String changePasword(String email, String oldPassword, String newPassword) {
		String sql="update users set Password =? where email=? and password=?";
		try(Connection con=DBUtils.getConnection();
			PreparedStatement pst3=con.prepareStatement(sql)){
			pst3.setString(1, newPassword);
			 pst3.setString(2, email);
		     pst3.setString(3, oldPassword);

		     int rowsAffected = pst3.executeUpdate();
		        return rowsAffected > 0 ? "Password changed successfully" : "Failed to change password: incorrect email or old password";
		    } catch (SQLException e) {
		        e.printStackTrace();
		        return "Failed to change password: " + e.getMessage();
		    }
		}
	
	

	@Override
	public String deleteUserByVoterId(int voterId) {
		String sql="delete from users where id=?";
		try(Connection con=DBUtils.getConnection();
			PreparedStatement pst4=con.prepareStatement(sql)){
			pst4.setInt(1,voterId);
			 
		     int rowsDeleted= pst4.executeUpdate();
		        return rowsDeleted > 0 ? "Password deleted successfully" : "User not found";
		    } catch (SQLException e) {
		        e.printStackTrace();
		        return "Failed to deleteUser: " + e.getMessage();
		    }
		}
	

	// clean up - close db resources (PST , DB cn)
	public void cleanUp() throws SQLException {
		if (pst1 != null) {
			pst1.close();
			pst1 = null;
		}
		if (pst2 != null) {
			pst2.close();
			pst2 = null;
		}
		if (pst3 != null) {
			pst3.close();
			pst3 = null;
		}
		
		
		closeConnection();
	}

	
}
