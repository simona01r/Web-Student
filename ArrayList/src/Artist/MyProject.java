package Artist;

import java.sql.*;

public class MyProject {

    public static void main(String[] args) throws Exceptions, SQLException {
        Menu m = new Menu();
        while (true) {
            m.displayMenu();
        }
    }
}
