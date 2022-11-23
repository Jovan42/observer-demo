package com.example.demo.test.publisher;

import com.example.demo.test.model.Employee;
import com.example.demo.test.messages.EmployeeAddedMessage;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import rs.xfinity.observer.anotations.Topic;
import rs.xfinity.observer.interfaces.Publisher;

import java.util.ArrayList;
import java.util.List;

@Topic(name = {"employee"})
@Component
public class EmployeesStore extends Publisher<EmployeeAddedMessage> {

    private ObjectMapper objectMapper;

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
        publish(new EmployeeAddedMessage(employee));
    }
}
