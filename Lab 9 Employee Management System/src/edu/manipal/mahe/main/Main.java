package edu.manipal.mahe.main;

import edu.manipal.mahe.payroll.*;

public class Main {
    public static void main(String[] args){
        Payroll payroll = new Payroll();
        payroll.generatePaySlip();
    }
}