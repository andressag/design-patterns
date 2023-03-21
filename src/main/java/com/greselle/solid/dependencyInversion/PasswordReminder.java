package com.greselle.solid.dependencyInversion;


// in this implementation the the passwordReminder (hight level class) class
// is being forced to depend on MySQLConnection (lower level) what breaks this principe

//public class PasswordReminder {
//    private int dbConnection;
//
//    public PasswordReminder(MySqlConnection db) {
//        this.dbConnection = db;
//    }
//
//}

// this is how it should like when follow the dependency inversion
// the lower class implements the interface that is the dependecy of the higth class

interface DbConnectionInterface {
    public int connect();
}
class MySqlConnection implements DbConnectionInterface {
    public int connect() {
        return 1;
    }
}

class PasswordReminder {
    private DbConnectionInterface dbConnectionInterface;

    public PasswordReminder(DbConnectionInterface dbConnectionInterface) {
        this.dbConnectionInterface = dbConnectionInterface;
    }
}

