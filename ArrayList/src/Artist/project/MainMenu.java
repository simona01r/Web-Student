package myproject2jdbc;


import java.sql.*;
import java.util.Formatter;

public class MainMenu {
  MyProject2JDBC myProject2JDBCObject=new MyProject2JDBC(); 
    public void displayMainMenu() throws SQLException
    {
        System.out.println("\n1.Add ARTIST to the database");
        System.out.println("\n2.Delete ARTIST from the database");
        System.out.println("\n3.Update ARTIST details in the database");
        System.out.println("\n4.Show All ARTIST details in the database");
        System.out.println("\n5.Find ARTIST by Id");
        System.out.println("\n6.Exit");
        System.out.println("PLEASE, ENTER YOUR CHOICE");
        
        int ch=myProject2JDBCObject.sc.nextInt();
        myProject2JDBCObject.sc.nextLine();
        switch(ch)
        {
            case 1:addArtist();
            break;
            case 2:deleteArtist();
            break;
            case 3:updateArtist();
            break;
            case 4:showArtist();
            break;
            case 5:findArtistById();
            break;
            case 6:System.exit(0);
            default:System.out.println("Wrong choice,please try again");
    }
    }
    public void addArtist() throws SQLException{
//        System.out.println("PLEASE,ENTER THE ID: ");
//        int id=myProject2JDBCObject.sc.nextInt();
//        myProject2JDBCObject.sc.nextLine();
        System.out.println("PLEASE,ENTER THE ARTIST FIRST NAME:");
        String fname=myProject2JDBCObject.sc.nextLine();
        System.out.println("PLEASE,ENTER THE ARTIST LAST NAME:");
        String lname=myProject2JDBCObject.sc.nextLine();
        System.out.println("PLEASE,ENTER THE AGE OF THE ARTIST:");
        int age=myProject2JDBCObject.sc.nextInt();
        //connectionCodeInsertion(id,fname,lname,age);
        connectionCodeInsertion(fname,lname,age);
        
    }
    public void deleteArtist()throws SQLException
    {
    System.out.println("PLEASE,ENTER THE ID:");
        int id=myProject2JDBCObject.sc.nextInt();
        connectionCodeDeletion(id);
    }
    public void updateArtist()throws SQLException{
        System.out.println("PLEASE,ENTER THE ID:");
        int id=myProject2JDBCObject.sc.nextInt();
        myProject2JDBCObject.sc.nextLine();
        System.out.println("PLEASE,ENTER THE NEW ARTIST FIRST NAME:");
        String fname=myProject2JDBCObject.sc.nextLine();
        System.out.println("PLEASE,ENTER THE NEW ARTIST LAST NAME:");
        String lname=myProject2JDBCObject.sc.nextLine();
        System.out.println("PLEASE,ENTER THE NEW AGE OF THE ARTIST:");
        int age=myProject2JDBCObject.sc.nextInt();
        connectionCodeUpdation(id,fname,lname,age);
    }
    public void showArtist()throws SQLException{
        System.out.println("DETAILS OF ARTISTS...");
        System.out.println("*********************");
        connectionCodeDisplayAll();
    }
    public void findArtistById()throws SQLException{
        System.out.println("PLEASE,ENTER THE ID:\n");
        int id=myProject2JDBCObject.sc.nextInt();
        connectionCodeDisplayById(id);
    }
    
    public void connectionCodeInsertion(String first_name,String last_name,int age) throws SQLException
    {
        try
        {
        Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
//        PreparedStatement myStmt=myConn.prepareStatement
//        ("insert into Artist(id,first_name,last_name,age)values(?,?,?,?)");
        PreparedStatement myStmt=myConn.prepareStatement
        ("insert into Artist(first_name,last_name,age)values(?,?,?)");
        //myStmt.setInt(1,id);
        myStmt.setString(1,first_name);
        myStmt.setString(2,last_name);
        myStmt.setInt(3,age);
        myStmt.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    public void connectionCodeDeletion(int id) throws SQLException
    {
        try
        {
        Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
        PreparedStatement myStmt=myConn.prepareStatement("delete from Artist where id=?");
        myStmt.setInt(1,id);
        myStmt.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    public void connectionCodeUpdation(int id,String fname,String lname,int age) throws SQLException
    {
        try
        {
        Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
        PreparedStatement myStmt=myConn.prepareStatement("update Artist set first_name=?,last_name=?,age=? where id=?");
        myStmt.setString(1,fname);
        myStmt.setString(2,lname);
        myStmt.setInt(3,age);
        myStmt.setInt(4,id);
        myStmt.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e); 
        }
        
    }
    
    public void connectionCodeDisplayAll() throws SQLException
    {
        try
        {
        Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
        Statement myStmt=myConn.createStatement();
        ResultSet rs=myStmt.executeQuery("Select * from Artist");
            System.out.println("ID   FIRST NAME          LAST NAME           AGE  \n");
        while(rs.next())
        {
            System.out.format("%5d%20s%20s%5d\n",rs.getInt("id"),rs.getString("first_name"),
                    rs.getString("last_name") ,rs.getInt("age"));
//            System.out.println(rs.getInt("id")+"     "+rs.getString("first_name")+"          "
//                    +rs.getString("last_name")+"          " +rs.getInt("age")+" ");
        }
        
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    public void connectionCodeDisplayById(int id) throws SQLException
    {
        try
        {
        Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
        PreparedStatement myStmt=myConn.prepareStatement("Select * from Artist where id=?");
        myStmt.setInt(1,id);
        ResultSet rs=myStmt.executeQuery();
        while(rs.next())
        {
            System.out.println("Id= "+rs.getInt("id")+" "+" First Name: "+rs.getString("first_name")
                    +" Last Name: "+rs.getString("last_name")+" Age: "+rs.getInt("age"));
        } 
        
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
//    public int connectionCodeId() throws SQLException
//    {
//        int id1=0;
//        try
//        {
//        Connection myConn=DriverManager.getConnection("jdbc:derby://localhost:1527/MyProject2","root","root");
//        Statement stmt=myConn.createStatement();
//        ResultSet rs=stmt.executeQuery("select max(id) from Artist");
//         id1=rs.getInt(id);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        return id1;
//    }
//    public void numberOfRowsinTable() throws SQLException
//    {
//        
//        try
//        {
//        Connection myConn=DriverManager.getConnection("jdbc:derby://localhost:1527/MyProject2","root","root");
//        Statement stmt=myConn.createStatement();
//        ResultSet rs=stmt.executeQuery("select count(*) from Artist");
//        if(!rs.next())
//            
//        }
//        catch(Exception e){
//            System.out.println(e);
//       }
//        
    }

