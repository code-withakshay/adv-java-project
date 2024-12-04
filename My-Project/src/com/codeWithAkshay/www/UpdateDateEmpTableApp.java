package com.codeWithAkshay.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class UpdateDateEmpTableApp 
{

    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Employee Id:");
        int no = sc.nextInt();

        System.out.println("Enter the New DOJ (dd-MM-yyyy):");
        String sdoj = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date udoj = sdf.parse(sdoj);

        // Converting util date to sql date
        java.sql.Date sqldoj = new java.sql.Date(udoj.getTime());

        // Loading the Oracle JDBC driver
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // Establishing connection
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "admin");

        // Using PreparedStatement to prevent SQL injection and handle date conversion
        String qry = "UPDATE emp1 SET edoj = ? WHERE eid = ?";
        PreparedStatement pst = con.prepareStatement(qry);
        
        // Setting parameters
        pst.setDate(1, sqldoj);  // Set the date
        pst.setInt(2, no);       // Set the employee ID

        // Executing the update
        int result = pst.executeUpdate();

        if (result == 0)
            System.out.println("No Record Updated");
        else
            System.out.println("Record Updated");

        // Closing resources
        pst.close();
        con.close();
    }
}
