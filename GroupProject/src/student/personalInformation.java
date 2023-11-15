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
public class personalInformation {
    //Name, Age, Sex, Address, Contact Information(Phone Num, Email), Emergency Contact(Name, Phone Num)
    private String name;
    private final String studentId;
    private final String hkId;
    private String age;
    private String sex;
    private String address;
    public contactInfo contactInfo; //phone num, email
    public emergencyContactInfo emergencyContactInfo; //name, phone num
    
    public personalInformation(String aName,String aStudentId,String aHkId, String aAge, String aSex, String aAddress, contactInfo aContactInfo, emergencyContactInfo aEmergencyContactInfo){
        name = aName;
        studentId = aStudentId;
        hkId = aHkId;
        age = aAge;
        sex = aSex;
        address = aAddress;
        contactInfo = aContactInfo;
        emergencyContactInfo = aEmergencyContactInfo;
    }
    
    public String viewPersonalInformation(){
        return "\tPersonal Information\n------------------------------------"
                + "\nName:\t\t\t" + getName()
                + "\nStudent ID:\t\t" + getStudentId()
                + "\nHK ID:\t\t\t" + getHkId()
                + "\nAge:\t\t\t" + getAge()
                + "\nSex:\t\t\t" + getSex()
                + "\nAddress:\t\t" + getAddress()
                + viewContactInfo()
                + viewEmergencyContactInfo();
    }
    
    public String viewContactInfo(){
        return this.contactInfo.viewContactInfo();
    }
    
    public String viewEmergencyContactInfo(){
        return this.emergencyContactInfo.viewEmergencyContactInfo();
    }
    
    //getter methods
    public String getName(){
        return this.name;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public String getHkId() {
        return hkId;
    }
    
    public String getAge(){
        return this.age;
    }
    
    public String getSex(){
        return this.sex;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    //setter methods
    public void setName(String aName){
        this.name = aName;
    }
    
    public void setAge(String aAge){
        this.age = aAge;
    }
    
    public void setSex(String aSex){
        this.sex = aSex;
    }
    
    public void setAddress(String aAddress){
        this.address = aAddress;
    }
    
    public void setContactInfo(contactInfo aContactInfo){
        this.contactInfo = aContactInfo;
    }

    public void setEmergencyContactInfo(emergencyContactInfo aEmergencyContactInfo){
        this.emergencyContactInfo = aEmergencyContactInfo;
    }
}


