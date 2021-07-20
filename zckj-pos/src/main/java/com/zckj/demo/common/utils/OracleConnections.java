package com.zckj.demo.common.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author 孙岩
 * @create 2020/10/21 12:09
 */
public class OracleConnections {

    private String driver = "";
    private String dbURL = "";
    private String user = "";
    private String password = "";
    private static OracleConnections connection = null;

    private OracleConnections() throws Exception {
        driver = "oracle.jdbc.driver.OracleDriver";
        dbURL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
        user = "ljt";
        password = "ljt";
        System.out.println("dbURL:" + dbURL);
    }

    public static Connection getConnection() {
        Connection conn = null;
        if (connection == null) {
            try {
                connection = new OracleConnections();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        try {
            Class.forName(connection.driver);
            conn = DriverManager.getConnection(connection.dbURL,
                    connection.user, connection.password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
