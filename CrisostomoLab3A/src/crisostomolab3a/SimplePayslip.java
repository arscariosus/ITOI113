/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crisostomolab3a;
import java.io.*;
import java.util.*;
import java.text.*;

/**
 *
 * @author arscariosus
 */
public class SimplePayslip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat formatter = new DecimalFormat("##,##0.00");
        Date today = new Date();
        
        // variable declaration
        int number;
        String name;
        double salary;
        double ot;
        double witholding_tax;
        double sss = 500.00;
        double pag_ibig = 200.00;
        double philhealth = 100.00;
        double deductions = sss + pag_ibig + philhealth;
        String position;
        
        // prompts and inputs
        System.out.println("Employee Payslip");
        System.out.print("Enter Employee Number : ");
        number = Integer.parseInt(input.readLine());
        System.out.print("Enter Employee Name : ");
        name = input.readLine();
        System.out.print("Enter Employee's Basic Salary : ");
        salary = Double.parseDouble(input.readLine());
        System.out.print("Enter Employee's OT Hours : ");
        ot = Double.parseDouble(input.readLine()); 
        
        //computation and variable declaration for computation
        double ot_pay = (salary * .01) * ot;
        double gross_pay = salary + ot_pay;
        
        if((int)salary >= 8000 && (int)salary <= 10000) {
            witholding_tax = gross_pay * .10;
            if((int)salary < 10000) {
                position ="Technician Paygrade A";
            } else {
                position ="Technician Paygrade B";
            }
        }
        if((int)salary >= 12000 && (int)salary <= 15000) {
            witholding_tax = gross_pay * .12;
            if((int)salary < 15000) {
                position ="Encoder Paygrade A";
            } else {
                position ="Encoder Paygrade B";
            }
        }
        if((int)salary >= 18000 && (int)salary <= 20000) {
            witholding_tax = gross_pay * .15;
            if((int)salary < 20000) {
                position ="Programmer Paygrade A";
            } else {
                position ="Programmer Paygrade B";
            }
        }
        if((int)salary >= 25000 && (int)salary <= 30000) {
            witholding_tax = gross_pay * .18;
            if((int)salary < 30000) {
                position ="System Analyst Paygrade A";
            } else {
                position ="System Analyst Paygrade B";
            }
        }
        if((int)salary >= 40000 && (int)salary <= 60000) {
            witholding_tax = gross_pay * .20;
            if((int)salary < 60000) {
                position ="Manager Paygrade A";
            } else {
                position ="Manager Paygrade B";
            }
        }

        // prints payslip
    }
}
