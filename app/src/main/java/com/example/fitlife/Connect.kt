package com.example.fitlife

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

class Connect {
    fun getConnection(): Connection?
    {
        val ip = "192.168.1.12";

        val host = "localhost";
        val port = 3306;
        val database = "fitness";
        val username = "root";
        val password = "";

        var connection: Connection? = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            val url = "jdbc:mysql://$ip:$port/$database";
            connection = DriverManager.getConnection(url, username, password);
        } catch (e: ClassNotFoundException) {
            e.printStackTrace();
        } catch (e: SQLException) {
            e.printStackTrace();
        }
        return connection;
    }
}
