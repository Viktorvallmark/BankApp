package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bank {

    //State
    public List<Customer> CustomerList;
    private String BankName;

    //Constructor
    public Bank(String bankName){
        BankName = bankName;
        List<Customer> customerList = new ArrayList<>();
    }
    public Bank(){

    }

    //Behaviour

    public List<String> GetCustomers(){
        List<String> tempList = new ArrayList<>();
        for(var customer : CustomerList){
            tempList.add(String.valueOf(customer));
        }
        return tempList;

    }

    public int getCustomerIndex(long pNr){
        int custIndex = -1;
        for(var customer : CustomerList){
            if(customer.getPNr() == pNr){
                custIndex = CustomerList.indexOf(customer);
            }
        }
    return custIndex;
    }

    public boolean AddCustomer(long pNr, String name){
        for(Customer i : CustomerList){
            if(i.getPNr() != pNr){
                CustomerList.add(new Customer(pNr, name));
                return true;
            }
        }
        return false;
    }

    public List<String> GetCustomer(long pNr){
        List<String> tempList = new ArrayList<>();
        var isTrue = getCustomerIndex(pNr);
        if(isTrue != -1){
            var customer = CustomerList.get(isTrue);
            tempList.add("Customer name:" + customer.getFullName());
            tempList.add("Customer's personal number:"+ String.valueOf(customer.getPNr()));
            tempList.add("Total accounts:" + String.valueOf(customer.getAccountList().size()));
        }else{
            tempList.add("Customer not found!");
        }
        return tempList;
    }
    //TODO
    public boolean ChangeCustomerName(String name, long pNr){
        for(Customer i : CustomerList){
            if(i.getPNr() == pNr){
                var k = i.getFullName();
                k = name;
                CustomerList.add(k);
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
        List<String> temp = new ArrayList<>();
        var isTrue = getCustomerIndex(pNr);
        if(isTrue != -1){
            var customer = CustomerList.get(isTrue);
            temp.add("Customer name:" + customer.getFullName());
            temp.add("Customer's personal number:"+ String.valueOf(customer.getPNr()));
            temp.add("Total accounts:" + String.valueOf(customer.getAccountList().size()));
            temp.add("Total balance returned to" + pNr + ":" + String.valueOf(customer.));
            CustomerList.remove(customer);

        }
        return temp;
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
