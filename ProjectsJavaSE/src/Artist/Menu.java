package Artist;

import java.sql.*;
import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    MyProject p = new MyProject();
    static int id = 1;

    public void displayMenu() throws Exceptions, SQLException {

        System.out.println("\n----------------------");
        System.out.println("1.Add Artists details into db");
        System.out.println("2.Delete ARTIST details into db");
        System.out.println("3.Update ARTIST details into db");
        System.out.println("4.Show All ARTIST details into db");
        System.out.println("5.Find ARTIST by Id in db");
        System.out.println("6.Exit");
        System.out.println("7.Enter Choice");

        int ch = sc.nextInt();
        sc.nextLine();

        switch (ch) {
            case 1:
                addArtist();
                break;
            case 2:
                deleteArtist();
                break;
            case 3:
                updateArtist();
                break;
            case 4:
                showArtist();
                break;
            case 5:
                findArtistById();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Invalid option");
        }
    }

//    1
    public void addArtist() throws SQLException {
        System.out.println("Enter ID");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter artist First Name");
        String fname = sc.nextLine();

        System.out.println("Enter artist Last Name");
        String lname = sc.nextLine();

        System.out.println("Enter Age");
        int age = sc.nextInt();
        sc.nextLine();

        Insertion(id, fname, lname, age);
    }

    public void Insertion(int id, String fname, String lname, int age) throws SQLException {
        try {
            Connection myCon = DriverManager.getConnection("jdbc:derby://localhost:1527/MyProject", "root", "root");
            PreparedStatement myStmt = myCon.prepareStatement("insert into Artist (id,name, lastname, age ) values (?,?,?,?) ");

            myStmt.setInt(1, id);
            myStmt.setString(2, fname);
            myStmt.setString(3, lname);
            myStmt.setInt(4, age);

            myStmt.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
//    2

    public void deleteArtist() throws SQLException {
        System.out.println("Enter the id:");
        int id = sc.nextInt();
        sc.nextLine();
        Deletion(id);

    }

    public void Deletion(int id) throws SQLException {
        
        try {
        Connection myCon = DriverManager.getConnection("jdbc:derby://localhost:1527/MyProject", "root", "root");
        PreparedStatement myStmt = myCon.prepareStatement("delete from artist where id = ?");

        myStmt.setInt(1, id);

        int results = myStmt.executeUpdate();
        System.out.println("Records deleted: " + results);

        } catch (Exception e) {
            System.out.println("");
        }
    }

//    3
    public void updateArtist() throws SQLException {

        System.out.println("Enter Id");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter first name:");
        String fname = sc.nextLine();
        System.out.println("Enter last name:");
        String lname = sc.nextLine();
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        sc.nextLine();
        Updation(id, fname, lname, age);
    }

    public void Updation(int id, String fname, String lname, int age) throws SQLException {
        try {

            Connection myConn = DriverManager.getConnection("jdbc:derby://localhost:1527/MyProject", "root", "root");
            PreparedStatement myStmt = myConn.prepareStatement("update Artist set name=?,lastname=?,age=? where id=?");
            myStmt.setString(1, fname);
            myStmt.setString(2, lname);
            myStmt.setInt(3, age);
            myStmt.setInt(4, id);
            myStmt.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

//        4
    public void showArtist() throws SQLException {
        System.out.println("Details of Artists:...");
        System.out.println("**********************");
        DisplayAll();
    }

    public void DisplayAll() throws SQLException {

        try {

            Connection myCon = DriverManager.getConnection("jdbc:derby://localhost:1527/MyProject", "root", "root");
            Statement myStmt = myCon.createStatement();
            ResultSet rs = myStmt.executeQuery("select * from Artist");

            while (rs.next()) {
                System.out.println("Id= " + rs.getInt("id") + " First name: " + rs.getString("name")
                        + " Last name: " + rs.getString("lastname") + " Age: " + rs.getInt("age"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

//        5
    public void findArtistById() throws SQLException {
        System.out.println("Enter the Id:");
        int id = sc.nextInt();
        sc.nextLine();
        DisplayById();
    }

    public void DisplayById() throws SQLException {

        try {
            Connection myCon = DriverManager.getConnection("jdbc:derby://localhost:1527/MyProject", "root", "root");
            PreparedStatement myStmt = myCon.prepareStatement("Select * from Artist where id=?");
            myStmt.setInt(1, id);
            ResultSet rs = myStmt.executeQuery();

            while (rs.next()) {
                System.out.println("Id= " + rs.getInt("id") + " First name: " + rs.getString("name")
                        + " Last name: " + rs.getString("lastname") + " Age: " + rs.getInt("age"));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
