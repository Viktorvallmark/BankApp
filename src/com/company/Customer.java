package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    //State
    private List<Account> AccountList;
    private String FullName;
    private long PNr;

    //Constructor

    public Customer(long pNr){
        PNr = pNr;
        List<Account> accounts = new ArrayList<>();

    }
    public Customer(long pNr, String fullName){
        PNr = pNr;
        FullName = fullName;
        List<Account> accounts = new ArrayList<>();
    }


    //Behaviour


    public String closeAccount(long pNr, int accountId){
        AccountList.removeIf(i -> i.getAccountID() == accountId && i.getPNr() == pNr);
        return "Account with account number"+ accountId+"was removed. Balance";
    }

    public int getAccountIndex(int accountId){
        int accIndex = -1;
        for(var account : AccountList){
            if(account.getAccountID() == accountId){
                accIndex = AccountList.indexOf(account);
            }

        }
    return accIndex;
    }
    //TODO
    public String getAccount(long pNr, int accountId){
        String temp = "";




        return "";
    }

    public long getPNr() {
        return PNr;
    }

    public String getFullName() {
        return FullName;
    }

    public List<Account> getAccountList() {
        return AccountList;
    }
}
