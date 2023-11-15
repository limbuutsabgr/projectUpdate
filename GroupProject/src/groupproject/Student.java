/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject;

import java.util.Scanner;
import student.*;

/**
 *
 * @author Owner
 */
public class Student {
    public String hkid;

    public static void setA1(academicRecord a1) {
        Student.a1 = a1;
    }

    public static void setA2(academicRecord a2) {
        Student.a2 = a2;
    }
    
    public Student(String hkid){
        this.hkid = hkid;
    }
        static personalInformation p1 = new personalInformation("John","s45677","D123567","18","M","123 Fake Street",new contactInfo("62718254","john@gmail.com"), new emergencyContactInfo("Mom","91706523"));
        static personalInformation p2 = new personalInformation("Amy","s56785","E123567","18","F","234 Fake Street",new contactInfo("94237856","amy@gmail.com"), new emergencyContactInfo("Dad","53467215"));

        //Creation of student's academic record
        static academicRecord a1 = new academicRecord(80,77,65,92,85);
        static academicRecord a2 = new academicRecord(88,95,83,95,100);
    public void viewStudent(){
        
        //Creation of student's personal information

        
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter \"1\" for personal information.\"2\" for academic record.");
        if(sc.nextInt() == 1){
            System.out.println("Enter \"1\" to view \"2\" to update");
            if(sc.nextInt() == 1){
                if(LoginSystem.hkid.equals(p1.getHkId())){
                    System.out.println(p1.viewPersonalInformation());
                }else{
                    System.out.println(p2.viewPersonalInformation());
                }
            }else{
                System.out.println("Which personal information would you like to update?"
                        + "\nEnter \"1\" for Address \"2\" for Emergency Contact Information \"3\" for Contact Information");
                int choice = sc.nextInt();
                if(choice == 1){
                    System.out.println("What is your new address?");
                    if(LoginSystem.hkid.equals(p1.getHkId())){
                        p1.setAddress(sc1.nextLine());
                        System.out.println(p1.viewPersonalInformation());
                    }else{
                        p1.setAddress(sc1.nextLine());
                        System.out.println(p2.viewPersonalInformation());
                    }
                }else if(choice == 2){
                    System.out.println("What is your new emergency contact Information?");
                    System.out.println("Enter emergency person's name");
                    String newName = sc1.nextLine();
                    System.out.println("Enter phone number");
                    String newPhoneNum = sc1.nextLine();
                    if(LoginSystem.hkid.equals(p1.getHkId())){
                        p1.setEmergencyContactInfo(new emergencyContactInfo(newName, newPhoneNum));
                        System.out.println(p1.viewPersonalInformation());
                    }else{
                        p2.setEmergencyContactInfo(new emergencyContactInfo(newName, newPhoneNum));
                        System.out.println(p2.viewPersonalInformation());
                    }
                }else{
                    System.out.println("What is your new contact Information?");
                    System.out.println("Enter new phone number");
                    String newPhoneNum = sc1.nextLine();
                    System.out.println("Enter new email");
                    String newEmail = sc1.nextLine();
                    if(LoginSystem.hkid.equals(p1.getHkId())){
                        p1.setContactInfo(new contactInfo(newPhoneNum, newEmail));
                        System.out.println(p1.viewPersonalInformation());
                    }else{
                        p2.setContactInfo(new contactInfo(newPhoneNum, newEmail));
                        System.out.println(p2.viewPersonalInformation());
                    }
                }
            }
        }else{
            if(LoginSystem.hkid.equals(p1.getHkId())){
                System.out.println(a1.viewAcademicRecord());
            }else{
                System.out.println(a2.viewAcademicRecord());
            }
        }

    }
    
}
