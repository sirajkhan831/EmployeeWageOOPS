package com.bridgelabz;

public class EmployeeWageOOPS {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 8;
    public static final int Working_Days = 20;
    public static final int Working_Hours = 100;


    public static void main(String[] args) {

        EmployeeWageOOPS obj = new EmployeeWageOOPS();
        obj.empCalc();
    }

    public void empCalc() {
        int wage = 0;
        int empHours = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= Working_Hours && totalWorkingDays < Working_Days) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
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
            totalEmpHrs += empHours;
            System.out.println("Day#: " + totalWorkingDays + "Emp hr: " + empHours);
        }
        wage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp wage :" + wage);
    }

}
