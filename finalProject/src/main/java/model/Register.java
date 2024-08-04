package model;

public class Register {
    private String lname;
    private String fname;
    private String email;
    private String pass;
    private int Mobno;

    public Register(String lname, String fname, String email, String pass, int mobno) {
        super();
        this.lname = lname;
        this.fname = fname;
        this.email = email;
        this.pass = pass;
        this.Mobno = mobno;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getMobno() {
        return Mobno;
    }

    public void setMobno(int mobno) {
        this.Mobno = mobno;
    }
}
