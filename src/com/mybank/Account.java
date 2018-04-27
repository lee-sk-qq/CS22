package com.mybank;
import java.util.List;

public class Account {

    private long accountNumber;
    private String typeOfAccount;
    private double accountBalance;
    private long zipCode;
    private AccountTransactions accountTransactions;

    public AccountTransactions getAccountTransactionsList() {
        return accountTransactions;
    }

    public Account(long accNum, String accType, Long zip, double balance) {
        accountNumber = accNum;
        typeOfAccount = accType;
        zipCode = zip;
        accountBalance = balance;
        accountTransactions = new AccountTransactions();
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int deposit(Deposits deposit) {
        if(deposit.getDepositAmount() > 0) {
            accountBalance = accountBalance + deposit.getDepositAmount();
            accountTransactions.addCreditTransaction(deposit);
            return Constants.AMOUNT_DEPOSITED;
        } else
            return Constants.INVALID_AMOUNT;
    }
    public int addDebit(Debits debitTransaction) {
        if(accountBalance- debitTransaction.getDebitAmount() <0){
            return -1;
        }
        accountBalance = accountBalance - debitTransaction.getDebitAmount();
        accountTransactions.addDebitTransaction(debitTransaction);
        return 1;
    }

    public List<Debits> getChequesList() {
        return accountTransactions.getChequeList();
    }
    public List<Debits> getDepositsList() {
        return null;
    }


}