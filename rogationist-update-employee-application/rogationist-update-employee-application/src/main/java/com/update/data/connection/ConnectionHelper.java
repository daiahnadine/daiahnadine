package com.update.data.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {
        public static final String URL = "jdbc:oracle:thin:@localhost:1521:rogate";
        public static final String ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
        public static final String username = "system";
        public static final String password = "Changeme0";

    public static Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:rogate", "system", "Changeme0");
        } catch (Exception e) {
            throw new RuntimeException("Error connecting to the database", e);
        }
    }
}

