package main.java.com.example.tutioncenter;

public class Teacher {

    private Name name;
    private String ic;
    private String address;
    private String qualification;
    private int yearsExp;
    private String datejoined;
    private int yearsSinceEnter;

    public Teacher(String ic, String address, String qualification, int yearsExp,String datejoined, int yearsSinceEnter) {
        this.ic = ic;
        this.address = address;
        this.qualification = qualification;
        this.yearsExp = yearsExp;
        this.datejoined = datejoined;
        this.yearsSinceEnter = yearsSinceEnter;
    }
//OPERATIONS

    public void setName(Name name) {
        this.name = name;
    }
    public Name getName() {
        return name;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }
    public String getIc() {
        return ic;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public String getQualification(){
        return qualification;
    }

    public void setYearsExp(int yearsExp) {
        this.yearsExp = yearsExp;
    }
    public int getYearsExp() {
        return yearsExp;
    }

    public void setDatejoined(String datejoined) {
        this.datejoined = datejoined;
    }
    public String getDatejoined() {
        return datejoined;
    }

    public void setYearsSinceEnter(int yearsSinceEnter) {
        this.yearsSinceEnter = yearsSinceEnter;
    }
    public int getYearsSinceEnter() {
        return yearsSinceEnter;
    }
}
