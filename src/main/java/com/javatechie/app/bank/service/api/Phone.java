package com.javatechie.app.bank.service.api;

import org.springframework.stereotype.Service;

@Service
public class Phone implements Payment {

    @Override
    public String doTransaction() {
        // TODO Auto-generated method stub
        return "payment process using phonepe..!";
    }

}
