package Chapter7.payroll;

import java.util.Scanner;

/**
 * Chapter7.payroll created by Remi on 2016-11-23.
 */
public class Pay {
    private int[] employeeId;
//    private int[] hours = new hours[employeeId.length];
//    private int[] pay = new pay[employeeId.length];
//    private int[] wage = new wage[employeeId.length];

    public Pay() {
        employeeId = new int[]{5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    }
    public int getLength(){
        return employeeId.length;
    }

    public int[] getEmployeeId(int id) {
        return employeeId[id];
    }
}
