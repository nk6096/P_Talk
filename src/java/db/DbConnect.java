package db;

import java.sql.*;
public class DbConnect {
    private Connection c;
    private Statement st;
    private PreparedStatement insertUser,
            checkUser,updateUser,updatePass,updatePhoto,userDetails,getArea;

    public Statement getSt() {
        return st;
    }

    public PreparedStatement getInsertUser() {
        return insertUser;
    }

    public PreparedStatement getCheckUser() {
        return checkUser;
    }

    public PreparedStatement getUpdateUser() {
        return updateUser;
    }

    public PreparedStatement getUpdatePass() {
        return updatePass;
    }

    public PreparedStatement getUpdatePhoto() {
        return updatePhoto;
    }

    public PreparedStatement getUserDetails() {
        return userDetails;
    }
    public PreparedStatement getgetArea() {
        return getArea;
    }
    public DbConnect(){
        try{
    Class.forName("oracle.jdbc.driver.OracleDriver");
    c=DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe", 
                "p_talk", "p_talk");
//    Class.forName("com.mysql.jdbc.Driver");
//    c=DriverManager.getConnection(
//            "jdbc:mysql://localhost:3306/lladb", 
//                "root", "");
    st=c.createStatement();
    insertUser=c.prepareStatement("insert into user_info values(?,?,?,?,?,?,?,?,?)");
    checkUser=c.prepareStatement("select * from user_info where email=? and pass=?");
    updateUser=c.prepareStatement("update user_info set name=?,phone=?,dob=?,area=?,city=?,state=? where email=?");
    updatePass=c.prepareStatement("update user_info set pass=? where email=? and pass=?");
    updatePhoto=c.prepareStatement("update user_info set photo=? where email=?");
    userDetails=c.prepareStatement("select * from user_info where email=?");
    getArea=c.prepareStatement("select * from user_info where area=? and city=? and state=?");
                    
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}