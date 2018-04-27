

package com.mybank;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class AccountTransactions {

    private final int numberOfCheques = 100;
    private final int numberOfTransactions = 100;

    private List<Transaction> transactionList;
    private List<Debits> debitsList = new ArrayList<Debits>();
    private List<Deposits> depositsList = new ArrayList<Deposits>();
    private List<Cheque> checksList = new ArrayList<Cheque>();
    public BankingApplication myBank;


    public AccountTransactions() {



    }
    public void addDebitTransaction(Debits debit) {
        this.getDebitsList().add(debit);


    }
    public void addCreditTransaction(Deposits deposit){
        this.getDepositsList().add(deposit);
    }


    public void addDepositSlip(Debits debit){
        this.getDebitsList().add(debit);
    }


    public int addTransaction(int tNum, double amount, String date) {
        if (tNum > 0 && tNum <= numberOfTransactions) {
            Transaction t = new Transaction(tNum, amount, date);
            if(!transactionList.contains(t)) {
                transactionList.add(t);
                return Constants.TRANSACTION_WRITTEN;
            } else
                return Constants.DUPLICATE_TRANSACTION_NUMBER;
        }
        return Constants.INVALID_TRANSACTION_NUMBER;
    }


    public List<Transaction> transactioneRange(int start, int end) {
        Transaction t;
        Iterator<Transaction> it = transactionList.iterator();
        List<Transaction> transactions = new ArrayList<Transaction>();
        while (it.hasNext()) {
            t = it.next();
            int chequeNumber = t.getTransactionNumber();
            if (chequeNumber >= start && chequeNumber <= end && chequeNumber != -1)
                transactions.add(t);
        }
        return transactions;
    }

    public List<Debits> getChequeList() {
        List<Debits> listOfCheques = new ArrayList<Debits>();
        for (Debits cheque: this.getDebitsList()			 )
        {
            if(cheque instanceof Cheque)   {
                listOfCheques.add(cheque);
            }
        }
        return listOfCheques;
    }

    public List<Debits> getDebitsList() {
        return debitsList;
    }

    public List<Deposits> getDepositsList() {

        return depositsList;
    }



}