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
public class academicRecord {
    private  int chinese;
    private  int english;
    private  int math;
    private  int science;
    private  int pe;
    
    public academicRecord(int aChinese,int aEnglish,int aMath,int aScience,int aPe){
        this.chinese = aChinese;
        this.english = aEnglish;
        this.math = aMath;
        this.science = aScience;
        this.pe = aPe;
    }
    
    public String viewAcademicRecord(){
        return "Academic Record\n------------------"
                + "\nChinese\t\t" + getChinese()
                + "\nEnglish\t\t" + getEnglish()
                + "\nMath\t\t" + getMath()
                + "\nScience\t\t" + getScience()
                + "\nPe\t\t" + getPe()
                + "\n\nAverage\t\t" + getAverage();
    }

    public int getChinese() {
        return chinese;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    public int getScience() {
        return science;
    }

    public int getPe() {
        return pe;
    }
    
    public double getAverage(){
        return (this.chinese + this.english + this.math + this.science + this.pe)/5.00;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public void setPe(int pe) {
        this.pe = pe;
    }
    
    
}
