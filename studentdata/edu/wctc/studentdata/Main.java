package edu.wctc.studentdata;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Students theStudents = new Students();

        ArrayList<Individual> result;

        result = theStudents.findStudents(FindColumns.ACCTNUM, "25");

        for (Individual i: result) {
            System.out.println(i.getAccountNumber() + " " + i.getFname() + " " + i.getLname());
        }

        result = theStudents.findStudents(FindColumns.LNAME, "Mar");

        for (Individual i: result) {
            System.out.println(i.getAccountNumber() + " " + i.getFname() + " " + i.getLname());
        }
    }
}
