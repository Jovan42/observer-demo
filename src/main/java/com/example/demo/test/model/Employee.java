package com.example.demo.test.model;

public class Employee {

    private String firstName;
    private String lastName;

    private Long pay;

    public Employee(String firstName, String lastName, Long pay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pay = pay;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPay() {
        return pay;
    }

    public void setPay(Long pay) {
        this.pay = pay;
    }
}
