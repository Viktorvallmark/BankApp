package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bank {

    //State
    public List<Customer> CustomerList;
    private List<String> CustomerInfo;
    private String BankName;

    //Constructor
    public Bank(String bankName){
        BankName = bankName;
        List<Customer> customerList = new ArrayList<>();
        List<String> customerInfo = new ArrayList<>();
    }
    public Bank(){

    }


    //Behaviour

    public List<String> GetCustomers(){

        return CustomerInfo;

    }
    public boolean AddCustomer(String name, long pNr){
        for(Customer i : CustomerList){
            if(i.getPNr() != pNr){
                CustomerList.add(new Customer(pNr, name));
                return true;
            }
        }
        return false;
    }
    //TODO
    public List<String> GetCustomer(long pNr){

        return CustomerInfo;
    }

    public boolean ChangeCustomerName(String name, long pNr){
        for(Customer i : CustomerList){
            if(i.getPNr() == pNr){
                var k = i.getFullName();
                k = name;
                CustomerInfo.add(k);
                return true;
            }

        }
        return false;
    }
    public List<Customer> getCustomerList(){
        return CustomerList;
    }
    //TODO
    public List<String> RemoveCustomer(long pNr){
        return CustomerInfo;
    }
    public int addAccount(long pNr, int accountId){
        for(Customer i : CustomerList){
            var k = i.getAccountList();
            if(i.getPNr() == pNr){
                Account account = new Account(pNr, accountId);
                k.add(account);
                return accountId;
            }
            }
            return -1;
    }
}
