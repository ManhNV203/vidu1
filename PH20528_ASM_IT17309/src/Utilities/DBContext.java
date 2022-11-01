/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Phong
 */
public class DBContext {
    public static final String HOSTNAME = "localhost";
    
    public static final String PORT = "1433";

    public static final String USER = "sa";

    public static final String PASSWORD = "123456";

    public static final String DATABASE_NAME = "FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041";
    
    public static final Boolean USING_SSL = false;

    public static final String POPUP_HEADER = "Thông báo";

    private static Connection connection;

    private static String CONNECT_STRING;

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            StringBuilder connectString = new StringBuilder();
            connectString
                    .append("jdbc:sqlserver://")
                    .append(HOSTNAME).append(":")
                    .append(PORT).append(";")
                    .append("databaseName=").append(DATABASE_NAME).append(";")
                    .append("user=").append(USER).append(";")
                    .append("password=").append(PASSWORD).append(";");
            if (USING_SSL) {
                connectString.append("encrypt=true;trustServerCertificate=true;");
            }
            CONNECT_STRING = connectString.toString();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnection() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection(CONNECT_STRING);
                DatabaseMetaData metaData = connection.getMetaData();
                System.out.println("Connection to database successfull");
                System.out.println("Driver name: " + metaData.getDriverName());
                System.out.println("Driver version: " + metaData.getDriverVersion());
                System.out.println("Product name: " + metaData.getDatabaseProductName());
                System.out.println("Product version: " + metaData.getDatabaseProductVersion());
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection to database failed");
            return null;
        }
        return connection;
    }
//    public static void main(String[] args) {
//        getConnection();
//    }
}
