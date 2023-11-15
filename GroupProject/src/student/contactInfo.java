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
public class contactInfo{
    private String phoneNum;
    private String email;
    
    //default constructor for contactInfo. parameters goes through the methods for validation check.
    public contactInfo(String aPhoneNum, String aEmail){
        setPhoneNum(aPhoneNum);
        setEmail(aEmail);
    }
    
    public String viewContactInfo(){
        return "\nPhone Number:\t\t" + getPhoneNum() + "\nEmail:\t\t\t" + getEmail();
    }

    public String getPhoneNum() {
        return phoneNum;
    }
    
    public String getEmail() {
        return email;
    }

    //phonenum can only contain numbers(0-9) and must be 8 in length.
    public void setPhoneNum(String aPhoneNum) {
        if (aPhoneNum.matches("[0-9]+")){
            if (aPhoneNum.length()==8){
                this.phoneNum = aPhoneNum;
            }else{
                System.out.println("INVALID PHONE NUMBER. MUST HAVE 8 DIGITS!!");
            }
        }else{
            System.out.println("INVALID PHONE NUMBER. MUST ONLY BE DIGITS(0-9)!!!");
        }
    }

    //email must have an "@" somewhere and a ".com" at the end.
    public void setEmail(String aEmail) {
        if (aEmail.matches("(.+)@(.+).com")){
            this.email = aEmail;
        }else{
            System.out.println("INVALID EMAIL. MUST HAVE \"@\" and \".com\"");
        }
    }
}
