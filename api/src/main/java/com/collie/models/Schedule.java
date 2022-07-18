package com.collie.models;

import java.util.Date;

public class Schedule {

    public Long id;
    public Date date;
    public String name;
    public String phone;
    public double price;
    public String service;
    public int status;

    public Schedule(Long id, Date date, String name, String phone, double price, String service, int status) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.phone = phone;
        this.price = price;
        this.service = service;
        this.status = status;
    }
}
