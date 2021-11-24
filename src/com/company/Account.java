package com.company;

import java.util.ArrayList;
import java.util.List;

public class Account {

    //State
    private long PNr;
    private int AccountID;
    private double Balance;

    //Constructor
    public Account(long pNr, int accountId){
        PNr = pNr;
        AccountID = accountId;
    }
    public Account(long pNr, int accountId, double balance){
        PNr = pNr;
        AccountID = accountId;
        Balance = balance;
    }


    //Behaviour
    //TODO
    public String getAccount(long pNr, int accountId){


        return "";
    }

    public double getBalance() {
        return Balance;
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public long getPNr() {
        return PNr;
    }
    //TODO
    public boolean withdrawMoney(long pNr, int accountId, double amount){
        double k = Balance - amount;
        if(k < 0){
            System.out.println("There's no money on your account to service your withdrawal request");
            return false;
        }
        else{
            System.out.println("Withdrew:"+ amount + "monies");
            Balance = k;
            return true;
        }

    }
    //TODO
    public boolean depositMoney(long pNr, int accountId, int amount){
        if(getPNr() == pNr && getAccountID() == accountId){
            Balance += amount;
            return true;
        }
        else{
            System.out.println("Deposit failed!");
            return false;
        }

    }




}
