package com.bridgelabz.Javasample;
import java.sql.SQLException;

public class App {
    static Payroll_UC1 uc1 = new Payroll_UC1();
    static  Payroll_UC2 uc2 = new  Payroll_UC2();
    static  Payroll_UC3 uc3 = new  Payroll_UC3();
    static Payroll_UC4 uc4 = new Payroll_UC4();
    static Payroll_UC5 uc5 = new Payroll_UC5();
    static Payroll_UC6 uc6 = new Payroll_UC6();

    static getConnection connection = new getConnection();
    static final String URL = "jdbc:mysql://localhost:3306/payroll_service";
    static final String USERNAME = "root";
    static final String PASSWORD = "Rajuskarvaibh97#";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        uc1.checkForConnection(URL, USERNAME, PASSWORD);
        uc2.retriveData(connection.connect());
        uc3.updateDetail(connection.connect());
        uc4.updateSalary(connection.connect());
        uc5.getData(connection.connect());
        uc6.dbFunction(connection.connect());
    }
}
