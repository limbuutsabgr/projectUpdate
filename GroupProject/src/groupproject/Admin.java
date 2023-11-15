/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Admin {
    
    public void assignRole(){
        System.out.println("Please select Option:");
        System.out.println("1 for change role of Existing User");
        System.out.println("2 for Adding New User");
        Scanner sc = new Scanner(System.in);
        int pick = sc.nextInt();
        switch(pick){
            case 1:
                System.out.println("picked existing");
                existingUser();
                break;
            case 2:
                System.out.println("Picked new user");
                newUser();
                break;
            default:
                System.out.println("Incorrect input");
                break;
    }
    }
    
    public void existingUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the HKID of the user: ");
        String hkid = sc.nextLine();
        
        System.out.println("Enter the staff/Student ID of the user: ");
        String id = sc.nextLine();
        
        User found = User.findUserByHKIDAndID(hkid,id);
        
        if (found!=null){
            System.out.println("Enter the new role(ADMIN,TEACHER,STUDENT): ");
            String newrole = sc.nextLine();
            newrole = newrole.toUpperCase();
            found.setRole(Role.valueOf(newrole));
        }else{
            System.out.println("User not found!");
        }
        sc.close();
    }
    
    public void newUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the HKID of the new user: ");
        String hkid = sc.nextLine();
        
        System.out.println("Enter the Staff/Student ID of the new user: ");
        String id = sc.nextLine();
        
        System.out.println("Enter the new role(ADMIN,TEACHER,STUDENT): ");
        String role = sc.nextLine();
        role = role.toUpperCase();
        User newuser = new User(hkid,id,Role.valueOf(role));
        User.users.add(newuser);
        System.out.println("Add new User:");
        System.out.println("HKID of New User: "+ newuser.getHKID());
        System.out.println("Student ID of New User: "+ newuser.getStaffID());
        System.out.println("Role of New User: "+ newuser.getRole());
    }
    
    

}
