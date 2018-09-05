package edu.wctc.studentdata;

public class Individual {
    private int accountNumber;
    private String fname;
    private String lname;
    private String email;
    private String ipAddress;

    public Individual(int accountNumber, String lname, String fname, String email, String ipAddress) {
        this.accountNumber = accountNumber;
        this.lname = lname;
        this.fname = fname;
        this.email = email;
        this.ipAddress = ipAddress;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getLname() {
        return lname;
    }

    public String getFname() {
        return fname;
    }

    public String getEmail() {
        return email;
    }

    public String getIpAddress() {
        return ipAddress;
    }
}
