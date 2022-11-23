package com.example.demo.test.subscriber;

import com.example.demo.test.messages.EmployeeAddedMessage;
import com.example.demo.test.messages.SaleAddedMessage;
import org.springframework.stereotype.Component;
import rs.xfinity.observer.anotations.HandleMessage;
import rs.xfinity.observer.anotations.Topic;
import rs.xfinity.observer.interfaces.Subscriber;

@Topic(name = {"employee", "sale"})
@Component
public class ProfitCalculator implements Subscriber {

    private Long employeesPays = 0L;
    private Long profits = 0L;


    @HandleMessage
    public void addEmployee(EmployeeAddedMessage employeeAddedMessage) {
        employeesPays += employeeAddedMessage.getAddedEmployee().getPay();
    }

    @HandleMessage
    public void addSale(SaleAddedMessage saleAddedMessage) {
        profits += saleAddedMessage.getAddedSale().getProfit();
    }

    public Long calculateProfit() {
        return  profits - employeesPays;
    }
}
