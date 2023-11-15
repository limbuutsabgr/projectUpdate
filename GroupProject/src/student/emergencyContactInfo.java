package student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s1307258
 */
public class emergencyContactInfo {
    private String name;
    private String phoneNum;
    
    //default constructor for emergencyContactInfo
    public emergencyContactInfo(String aName, String aPhoneNum){
        setName(aName);
        setPhoneNum(aPhoneNum);
    }
    
    public String viewEmergencyContactInfo(){
        return "\nEmergency Contact Name:\t" + getName() 
             + "\nEmergency Phone Number:\t" + getPhoneNum();
    }   
    
    
    //getter methods
    public String getName() {
        return name;
    }
    
    public String getPhoneNum() {
        return phoneNum;
    }

    //setter methods
    public void setName(String name) {
        //Name can only contain upper or lower case alphabetic characters.
        if(name.matches("[a-zA-Z]+")){
            this.name = name;
        }else{
            System.out.println("NAME MUST ONLY HAVE ALPHABETIC CHARACTERS!!");
        }
    }

    public void setPhoneNum(String phoneNum) {
        //phoneNum can only contain numbers(0-9) and must be 8 in length.
        if (phoneNum.matches("[0-9]+")){
            if (phoneNum.length()==8){
                this.phoneNum = phoneNum;
            }else{
                System.out.println("INVALID PHONE NUMBER. MUST HAVE 8 DIGITS!!");
            }
        }else{
            System.out.println("INVALID PHONE NUMBER. MUST ONLY BE DIGITS(0-9)!!!");
        }
    }
}
