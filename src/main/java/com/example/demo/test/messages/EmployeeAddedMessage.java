package com.example.demo.test.messages;

import com.example.demo.test.model.Employee;
import rs.xfinity.observer.interfaces.Message;

public class EmployeeAddedMessage extends Message {

    private Employee addedEmployee;

    public EmployeeAddedMessage(Employee addedEmployee) {
        this.addedEmployee = addedEmployee;
    }

    public Employee getAddedEmployee() {
        return addedEmployee;
    }
}
