package com.mybank;

public class Debits {
    private int debitNumber;
    private double debitAmount;
    private String debitDate;
    private int debit;

    public Debits(int debNum, double debAmt, String debDate) {
        debitNumber = debNum;
        debitAmount = debAmt;
        debitDate = debDate;

        // Getters and setters omitted for brevity

    }

    public int getDebitNumber(){
        return debitNumber;
    }

    public double getDebitAmount(){
        return debitAmount;
    }

    public String getDebitDate(){
        return  debitDate;
    }

    public int getIdentifier(){
        return debitNumber;
    }


}





