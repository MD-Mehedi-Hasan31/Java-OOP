package com.pondit.studentManagement;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Main{

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection= 
                DriverManager.getConnection("jdbc.postgresql://localhost:6432/student_management",
                        "postgres","12345" );
                Statement statement= connection.createStatement();
     //   BufferedReader br= new BufferedReader(new InputStreamReader(System.in()));
              ResultSet rs= statement.executeQuery("select * from tbstudent");
        while(rs.next()){
            System.out.print(rs.getString("std_id")+"\t");
            System.out.print(rs.getString("std_name")+"\t");
            System.out.println(rs.getString("addrs_id")+"\t");
        }
    }
}
