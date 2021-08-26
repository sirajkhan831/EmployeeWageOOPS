package com.bridgelabz;

public class EmployeeWageOOPS {

    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 8;
    public static final int Working_Days = 20;


    public static void main(String[] args) {
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        EmployeeWageOOPS obj = new EmployeeWageOOPS();
        obj.workingDays(empCheck);
    }

    public void workingDays(int empCheck) {
        int wage = 0;
        int empHours = 0;
        switch (empCheck) {
            case IS_FULL_TIME:
                empHours = 8;
                break;

            case IS_PART_TIME:
                empHours = 4;
                break;

            default:
                empHours = 0;
        }
        wage = empHours * EMP_RATE_PER_HOUR * Working_Days;
        System.out.println("Emp wage :" + wage);
    }
}


