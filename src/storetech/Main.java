
package storeTech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        trocaSenha ts = new trocaSenha();
        ts.setVisible(true);
    }
}
