package com.cdac.tester;

import java.sql.SQLException;
import java.util.Scanner;
import com.cdac.dao.UserDao;
import com.cdac.dao.UserDaoImpl;
import com.cdac.pojos.User;

public class TestLayeredApplication {

    public static void main(String[] args) throws SQLException {
        try (Scanner sc = new Scanner(System.in)) {
            // Create DAO instance
            UserDao dao = new UserDaoImpl();

            // Accept email and password for login
            System.out.println("Enter email and password");
            String email = sc.next();
            String password = sc.next();

            // Attempt login
            User user = dao.signIn(email, password);
            if (user != null) {
                System.out.println("Login success");
                System.out.println("Hello, " + user.getFirstName() + " " + user.getLastName());

                // Now ask to change password
                System.out.println("Do you want to change your password? (yes/no)");
                String choice = sc.next();
                if (choice.equalsIgnoreCase("yes")) {
                    System.out.println("Enter old password:");
                    String oldPassword = sc.next();
                    System.out.println("Enter new password:");
                    String newPassword = sc.next();
                    String result = dao.changePasword(email, oldPassword, newPassword);
                    System.out.println(result);
                }

            } else {
                System.out.println("Invalid email or password!");
            }
            
            //delete 
            if(user!=null) {
            	String deleteMsg = dao.deleteUserByVoterId(user.getUserId());
                System.out.println(deleteMsg);
            }
            else {
            	System.out.println("Invalid email or password!");
            }

            // Cleanup
            dao.cleanUp();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
