package db;

import db.mysql.MySQLConnection;

public class DBConnectionFactory {
	// This should change based on the pipeline.
	private static final String DEFAULT_DB = "mysql";

	// Create a DBConnection based on given db type.
	public static DBConnection getDBConnection(String db) {
		switch (db) {
		case "mysql":
			return new MySQLConnection();
		case "mongodb":
			return null;
		// You may try other dbs and add them here.
		default:
			throw new IllegalArgumentException("Invalid db " + db);
		}
	}

	// This is overloading not overriding.
	public static DBConnection getDBConnection() {
		return getDBConnection(DEFAULT_DB);
	}
}
