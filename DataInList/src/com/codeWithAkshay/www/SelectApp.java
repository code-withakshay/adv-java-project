package com.codeWithAkshay.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class SelectApp 
{
	 public static void main(String[] args) 
		{
	        String url = "jdbc:oracle:thin:@localhost:1521:XE";
	        String username = "system";
	        String password = "admin";

	        String sql = "select * from student";

	        List<Student> students = new ArrayList<Student>();

	        try (Connection conn = DriverManager.getConnection(url, username, password);
	             PreparedStatement stmt = conn.prepareStatement(sql);
	             ResultSet rs = stmt.executeQuery()) 
	        {

	            while (rs.next()) 
				{
	                int id = rs.getInt(1);
	                String name = rs.getString(2);
	                String add = rs.getString(3);
	                int roll=rs.getInt(4);
	                students.add(new Student(id, name, add,roll));
	            }

	        } 
	        catch (SQLException e) 
	        {
	            e.printStackTrace();
	        }

	        //sorting of an object
			List<Student> newList=students.stream().sorted(Comparator.comparingInt(Student::getId)).collect(Collectors.toList());
			
			//reading the data from ArrayList
			newList.forEach(student -> System.out.println(student.getId()+" "+student.getName()+" "+student.getAdd()+" "+student.getRoll()));

	    }
}

