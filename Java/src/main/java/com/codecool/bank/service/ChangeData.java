package com.codecool.bank.service;

import data.Customer;

public class ChangeData {

    public void changeResidence(Customer customer, String newResidence){
        //getCustomer
        //setNewResidence
        customer.setResidence(newResidence);
    }

    public void changeEmail(Customer customer, String newEmail){
        //getCustomer
        //setNewEmail
        customer.setEmail(newEmail);
    }
}
