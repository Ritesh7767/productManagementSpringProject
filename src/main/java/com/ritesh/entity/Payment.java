package com.ritesh.entity;

public class Payment {

    private double amount;

    public static void proceedPayment(String user, double amount){
        System.out.println("Payment of " + amount + " has been successfully done by " + user);
    }
}
