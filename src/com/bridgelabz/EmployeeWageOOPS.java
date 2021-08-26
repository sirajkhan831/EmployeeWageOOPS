package com.bridgelabz;

public class EmployeeWageOOPS {

    //checking method
    public double empPresentCheck() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == 0) {
            System.out.println("Employee Present");
        } else {
            System.out.println("Employee absent");
        }
        return empCheck;
    }

    public void dailyWageEmployee(double check) {
        int wage = 20;
        int hour = 8;
        if (check == 0) {
            int dailyWage = wage * hour;
            System.out.println("Daily wage : " + dailyWage);
        }
    }

    //main method
    public static void main(String[] args) {
        EmployeeWageOOPS obj = new EmployeeWageOOPS();
        double check = obj.empPresentCheck();
        obj.dailyWageEmployee(0);
    }
}
