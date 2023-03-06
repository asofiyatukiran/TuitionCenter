package main.java.com.example.tutioncenter;

public class Name {
    //DATA
    private String fname;
    private String mname;
    private String lname;

    //CONSTRUCTORS
    public Name(String fname, String mname, String lname) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }


//OPERATIONS

    public void setFName(String fname) {
        // "this" refers to the class attributes
        this.fname = fname;
    }
    public void setMName(String mname) {
        // "this" refers to the class attributes
        this.mname = mname;
    }
    public void setLName(String lname) {
        // "this" refers to the class attributes
        this.lname = lname;
    }

    public String getMName() {
        return fname;
    }
    public String getFName() {
        return fname;
    }
    public String getLName() {
        return lname;
    }

    public String getFullName() {
        return fname +" "+ mname +" "+ lname;
    }
}
