package org.example;

public class Receipt {
    public int TransactionNumber(){
        int number = (int) (100000 + Math.random()*(999-100)-100);
        return number;
    }
}
