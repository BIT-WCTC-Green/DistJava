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
        Students theStudents2 = new Students();

        ArrayList<Individual> result2;

        result2 = theStudents2.findStudents(FindColumns.ACCTNUM, request.getParameter("message"));
        PrintWriter out = response.getWriter();
        out.println("<html><head></head><body><h1>Search results:</h1><p>");
        for (Individual i: result2) {

            out.println(i.getAccountNumber() + " " + i.getFname() + " " + i.getLname()+"<br>");
        }



        result2 = theStudents2.findStudents(FindColumns.LNAME, request.getParameter("message"));

        for (Individual i: result2) {
            out.println(i.getAccountNumber() + " " + i.getFname() + " " + i.getLname()+"<br>");
        }
        out.println("</p></body></html>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<html><head></head><body><h1>Simple Web Page</h1><p>The Test.");
        out.println(request.getParameter("message"));
        out.println("</p></body></html>");
    }


}