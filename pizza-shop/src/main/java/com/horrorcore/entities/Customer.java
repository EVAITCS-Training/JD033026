package com.horrorcore.entities;

import java.util.List;
import java.util.Objects;

public class Customer {
    private String name;
    private long phone;
    private String address;
    private List<Order> orderList;

    public Customer() {}

    public Customer(String name, long phone, String address, List<Order> orderList) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.orderList = orderList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Customer customer)) return false;
        return getPhone() == customer.getPhone() && Objects.equals(getName(), customer.getName()) && Objects.equals(getAddress(), customer.getAddress()) && Objects.equals(getOrderList(), customer.getOrderList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPhone(), getAddress(), getOrderList());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", orderList=" + orderList +
                '}';
    }
}
