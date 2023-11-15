/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject;

/**
 *
 * @author Owner
 */

import java.util.Scanner;
import student.*;
public class Teacher {
    public static void upload(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("input course name");
        String Cname = scanner.nextLine();
        System.out.println("input Assignment title");
        String Atitle = scanner.nextLine();
        System.out.println("input Assignment description.");
        String Adesc = scanner.nextLine();
        System.out.println("input Assignment deadline. DD/MM/YYYY");
        String Dline = scanner.nextLine();
        System.out.println("input the full marks for assignment.");
        int Fmarks = scanner.nextInt();
        System.out.println("select file type \n1.pdf \t2.png \t3.jpeg");
        int filechoice = scanner.nextInt();
        String filetype = "";
        switch (filechoice){
            case 1:
                filetype ="pdf";
                break;
            case 2:
                filetype ="png";
                break;
            case 3:
                filetype ="jpeg";
                break;                
        }
        System.out.println(" You have uploaded an assignment for course " + Cname + "\nThe assignment "
        + Atitle + " with description " + "\"" + Adesc+ "\"" + " due on " + Dline +".Full marks is " + Fmarks +
        ". Student needs to submit file type " + filetype);        
        
        
    }
    
    public static void view(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Student ID.");
        String searchname = scanner.nextLine();
        boolean found = false;
        for (User x: User.users){
            if(x.getStaffID().equals(searchname)){
                    found = true;
                    System.out.println("What would you like to view: \t1. Student information \t2. Student grades");
                    int viewchoice = scanner.nextInt();
                    switch(viewchoice){
                        case 1:
                            System.out.println(Student.p1.viewPersonalInformation());
                            break;
                        case 2:
                            System.out.println(Student.a1.viewAcademicRecord());
                            break;
                        }
                } else if(searchname.equals(Student.p2.getHkId())){
                    found = true;
                    System.out.println("What would you like to view: \t1. Student information \t2. Student grades");
                    int viewchoice = scanner.nextInt();
                    switch(viewchoice){
                        case 1:
                            System.out.println(Student.p2.viewPersonalInformation());
                            break;
                        case 2:
                            System.out.println(Student.a2.viewAcademicRecord());
                            break;
                          }
                }   
            
            } 
        if (found == false){
            System.out.println("User not found");}
     }
         
                 
    
     

    
    public static void update(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Student ID.");
        String searchname = scanner.nextLine();
        boolean found = false;
        for (User x: User.users){
            if(x.getStaffID().equals(searchname)){
                   found = true;
                   System.out.println("Input new score for Chinese");
                   int Uchinese = scanner.nextInt();
                   System.out.println("Input new score for English");
                   int Uenglish = scanner.nextInt();
                   System.out.println("Input new score for Math");
                   int Umath = scanner.nextInt();
                   System.out.println("Input new score for Science");
                   int Uscience = scanner.nextInt();
                   System.out.println("Input new score for PE");
                   int Upe = scanner.nextInt();               
                   academicRecord a1 = new academicRecord(Uchinese,Uenglish,Umath,Uscience,Upe);
                   Student.setA1(a1);
                   System.out.println(Student.a1.viewAcademicRecord());
                    } else if(searchname.equals(Student.p2.getHkId())){
                        found = true;
                        System.out.println("Input new score for Chinese");
                        int Uchinese = scanner.nextInt();
                        System.out.println("Input new score for English");
                        int Uenglish = scanner.nextInt();
                        System.out.println("Input new score for Math");
                        int Umath = scanner.nextInt();
                        System.out.println("Input new score for Science");
                        int Uscience = scanner.nextInt();
                        System.out.println("Input new score for PE");
                        int Upe = scanner.nextInt();               
                        academicRecord a2 = new academicRecord(Uchinese,Uenglish,Umath,Uscience,Upe);
                        Student.setA2(a2);
                        System.out.println(Student.a2.viewAcademicRecord());
                  
                        }  
                 }
                if (found == false){
                    System.out.println("User not found");}
        }     
    
    public void teacher(){
    System.out.println("Press 1 to upload files \n Press 2 to view student information \n Press 3 to update student academic record");
    Scanner scanner = new Scanner(System.in);
    
    int input = scanner.nextInt();
    switch(input){
        case 1:
            upload();
            break;
        case 2:
            view();
            break;
        case 3:
            update();
            break;
        } 
    }
}
