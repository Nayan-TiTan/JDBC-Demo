package com.DemoJDBC;

import com.utils.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyDemoJDBC {
    public static void main(String[] args) throws SQLException {

        Connection connection = DBUtils.getConnection();
        //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crs-flipkart","root","nayan10");
        String q="";
        PreparedStatement pst=null;

        try {

            String q2="Select * from dummy";
            pst = connection.prepareStatement(q2);
            ResultSet rs=pst.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        //just added this for a change to commit changes
        //new change in master so that it can be merged in new_demo
        //another change made in new_demo after merging master to this

        //now again 1 line added to reset change

    }
}
