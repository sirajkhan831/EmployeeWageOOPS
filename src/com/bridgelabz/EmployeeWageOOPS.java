package com.bridgelabz;

public class EmployeeWageOOPS {//checking method

    public void empPresentCheck() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == 0) {
            System.out.println("Employee Present");
        } else {
            System.out.println("Employee absent");
        }
    }

    //main method
    public static void main(String[] args) {
        EmployeeWageOOPS obj = new EmployeeWageOOPS();
        obj.empPresentCheck();

    }
}
