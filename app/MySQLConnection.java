class MySQLConnection {
    companion object {
        private const val host = "localhost"
        private const val port = 3306
        private const val database = "fitness"
        private const val username = "root"
        private const val password = ""

        fun getConnection(): Connection? {
                var connection: Connection? = null
        try {
            Class.forName("com.mysql.cj.jdbc.Driver")
            val url = "jdbc:mysql://$host:$port/$database"
            connection = DriverManager.getConnection(url, username, password)
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return connection
        }
    }
}

