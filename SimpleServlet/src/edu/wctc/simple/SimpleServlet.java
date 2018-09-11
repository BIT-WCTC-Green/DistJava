package edu.wctc.simple;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


@WebServlet(name = "SimpleServlet")
public class SimpleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<html><head></head><body><h1>Simple Web Page</h1><p>The Test.");
        out.println(request.getParameter("message"));

        Students theStudents = new Students();
        String colToSearch = request.getParameter("column");
        ArrayList<Individual> result;
        FindColumns cols;

        switch(colToSearch){
            case "ACCTNUM":  cols = FindColumns.ACCTNUM;
                break;
            case "EMAIL":  cols = FindColumns.EMAIL;
                break;
            case "LNAME":  cols = FindColumns.LNAME;
                break;
            case "FNAME":  cols = FindColumns.FNAME;
                break;
            case "IPADDR":  cols = FindColumns.IPADDR;
                break;
        }

        result = theStudents.findStudents(FindColumns.EMAIL, request.getParameter("value"));
        out.println("<table><tr><th> Account</th><th>First Name</th><th>Last Name </th>");

        for (Individual i: result) {
            out.println("<tr><td>" + i.getAccountNumber() + "</td> <td>" + i.getFname() + "</td><td> " + i.getLname() + "</td></tr>>" );
        }


        out.println("</p></body></html>");
    }


}