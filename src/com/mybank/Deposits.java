package com.mybank;

public class Deposits {
    private int depositNumber;
    private double depositAmount;
    private String depositDate;
    private String deposits;

    public Deposits(int debNum, double debAmt, String debDate) {
        depositNumber = debNum;
        depositAmount = debAmt;
        depositDate = debDate;

        // Getters and setters omitted for brevity
    }

    public int getDepositNumber(){
        return depositNumber;
    }

    public double getDepositAmount(){
        return depositAmount;
    }

    public String getDepositDate(){
        return depositDate;
    }

    public String getIdentifier(){
        return deposits;
    }
}
