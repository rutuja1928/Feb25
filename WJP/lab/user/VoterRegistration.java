package com.cdac.tester;

import java.sql.Date;
import java.util.Scanner;

import com.cdac.dao.UserDaoImpl;
import com.cdac.pojos.User;

public class VoterRegistration{

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 1.create dao instace - create dependency
			UserDaoImpl dao = new UserDaoImpl();
			// accept em n password
			System.out.println("Enter firstName,lastName,email,password,dob");
			// create user instance then invoke dao's method
			User user=new User(sc.next(), sc.next(),sc.next(),sc.next(),Date.valueOf(sc.next()));
			System.out.println("Reg status-"+dao.signUp(user));
			dao.cleanUp();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
